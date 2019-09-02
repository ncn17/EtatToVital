package cg.ncn.missedData;

import java.io.FileWriter;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.vital.ChthibiDeath;
import cg.ncn.tools.HbVitalStatUtils;

public class locateDeath {
    private static final int IDTYPE = 2;

    public static List<ChthibiDeath> findDeath( int annee ) {
        String query = "\n" +
                " select d FROM cg.ncn.entities.vital.ChthibiDeath as d , cg.ncn.entities.vital.ChthibiRegister as r where r.number = d.number and r.year = :annee and r.idtype = :idtype order by d.number";

        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        List<ChthibiDeath> deaths = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( query );
            q.setParameter( "annee", annee );
            q.setParameter( "idtype", IDTYPE );
            deaths = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return deaths;
    }

    public static void findError() {
        int tabTYear[] = { 2000, 2001, 2019 };

        // get data by year

        for ( int year : tabTYear ) {
            List<ChthibiDeath> deaths = locateDeath.findDeath( year );

            // traitement list
            int compt = 0, found = 0;
            String texte = null;

            if ( deaths.isEmpty() == false ) {
                for ( int i = 0; i < deaths.size(); i++ ) {
                    int k = i + 1;

                    if ( k < deaths.size() ) {
                        compt = deaths.get( k ).getNumber() - deaths.get( i ).getNumber();
                        if ( compt > 1 ) {
                            found++;
                            texte = "Erreur données manquantes entre : number => " + deaths.get( i ).getNumber()
                                    + " et number => "
                                    + deaths.get( k ).getNumber() + " Année : "
                                    + deaths.get( k ).getYeargeorgian();
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
        String name = "missedDeath" + year + ".txt";
        try {
            fw = new FileWriter( "Report/" + name );
            fw.write( "*******Rapport d'erreur : Table ChthibiDeath du : " + new Date() + " *******\n\n" );
            fw.write( txt );
            fw.close();
        } catch ( Exception e ) {
            System.err.println( e.getMessage() );
        }
    }
}
