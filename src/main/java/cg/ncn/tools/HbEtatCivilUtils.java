package cg.ncn.tools;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbEtatCivilUtils {

    private static SessionFactory sF = getSessionFactory();

    public static SessionFactory getSessionFactory() {
        if(sF == null) {
            try {
                // creation de la configuration

                sF =  ( new Configuration() ).configure( "ressources/hibernate_etatCivil.cfg.xml" ).buildSessionFactory();
            } catch ( Exception e ) {
                System.out.println( "Initialisation Hibernate Echouer !" );
                throw new ExceptionInInitializerError( e );
            }
        }
        return sF;
    }

    public static void closeHibernate() {
        sF.close();
    }

}
