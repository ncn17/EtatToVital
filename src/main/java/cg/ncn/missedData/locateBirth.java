package cg.ncn.missedData;

import java.io.FileWriter;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.vital.ChthibiBirth;
import cg.ncn.tools.HbVitalStatUtils;

public class locateBirth {

    public static List<ChthibiBirth> findBirth( int annee ) {
        String query = "\n" +
                " select b FROM cg.ncn.entities.vital.ChthibiBirth as b , cg.ncn.entities.vital.ChthibiRegister as r where r.number = b.number and r.year = :annee and r.idtype = :idtype order by b.number";

        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        List<ChthibiBirth> births = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( query );
            q.setParameter( "annee", annee );
            q.setParameter( "idtype", DataStorage.IDTYPEBIRTH );
            births = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return births;
    }

    public static Long countBirth() {
        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        Long total = 0l;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "SELECT count(distinct b.id) FROM cg.ncn.entities.vital.ChthibiBirth b" );
            total = (Long) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return total;
    }

    public static void findError() {
        // get data by year

        for ( int year = 1900; year < 2050; year++ ) {
            List<ChthibiBirth> births = locateBirth.findBirth( year );

            // traitement list
            int compt = 0, found = 0, miss = 0;
            String texte = null;

            if ( births.isEmpty() == false ) {
                for ( int i = 0; i < births.size(); i++ ) {
                    int k = i + 1;

                    if ( k < births.size() ) {
                        compt = births.get( k ).getNumber() - births.get( i ).getNumber();
                        if ( compt > 1 ) {
                            found++;
                            texte = "Erreur données manquantes entre : number => " + births.get( i ).getNumber()
                                    + " et number => "
                                    + births.get( k ).getNumber() + " Année : "
                                    + year;
                            texte += "\n";
                            miss += compt;
                        }
                    }
                }
            }
            // memorisation
            if ( found > 0 ) {
                found = 0;
                saveInFile( texte, year, miss );
            }
        }
    }

    private static void saveInFile( String txt, int year, int miss ) {
        FileWriter fw = null;
        String name = "missedBirth" + year + ".txt";
        try {
            fw = new FileWriter( "Report/" + name );
            fw.write( "*******Rapport : Table ChthibiBirth du : " + new Date() + " *******\n\n" );
            fw.write( "Nombres Total d'actes de naissances :  " + countBirth() + '\n' );
            fw.write( "Nombres Total d'actes de naissances manquant :  " + miss + '\n' );
            fw.write( txt );
            fw.close();
        } catch ( Exception e ) {
            System.err.println( e.getMessage() );
        }
    }

}
