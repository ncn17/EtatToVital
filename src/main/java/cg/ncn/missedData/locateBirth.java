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

    private static final int IDTYPE = 1;

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
            q.setParameter( "idtype", IDTYPE );
            births = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return births;
    }

    public static void findError() {
        int tabTYear[] = { 2000, 2001, 2019 };

        // get data by year

        for ( int year : tabTYear ) {
            List<ChthibiBirth> births = locateBirth.findBirth( year );

            // traitement list
            int compt = 0, found = 0;
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
                                    + births.get( k ).getYeargeorgian();
                            texte += "\n";
                        }
                    }
                }
            }
            // memorisation
            if ( found > 0 ) {
                found = 0;
                saveInFile( texte, year );
            }
        }
    }

    private static void saveInFile( String txt, int year ) {
        FileWriter fw = null;
        String name = "missedBirth" + year + ".txt";
        try {
            fw = new FileWriter( "Report/" + name );
            fw.write( "*******Rapport d'erreur : Table ChthibiBirth du : " + new Date() + " *******\n\n" );
            fw.write( txt );
            fw.close();
        } catch ( Exception e ) {
            System.err.println( e.getMessage() );
        }
    }

}
