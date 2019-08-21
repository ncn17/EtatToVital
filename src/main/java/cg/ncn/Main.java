package cg.ncn;

import cg.ncn.migration.MigrationBirth;
import cg.ncn.migration.MigrationDeath;
import cg.ncn.migration.MigrationRegister;
import cg.ncn.migration.MigrationUser;

public class Main {

    public static void main( String[] args ) {

        /*
         * Demmarage de toutes les connections 
         * Mode singleton (fast)
         * InitAllConnections.start()
        */

        /* Debut migration */
        MigrationUser.migrateUserEtatToVital();
        
        MigrationRegister.migrateRegisterEtatToVital();
        
        MigrationBirth.migrateBirthEtatToVital();
       
        MigrationDeath.migrateDeathEtatToVital();
   
//        System.out.println( MyTools.getPersonDate() );
//        
//        List<Mention> list = DAOEtatFactory.getMentionDAO().findAll();
//        
//        for(Mention mt : list) {
//            System.out.println( mt.getOfficerAr() );
//        }

    }

}
