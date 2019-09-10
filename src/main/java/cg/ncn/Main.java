package cg.ncn;

import cg.ncn.migration.MigrationBirth;
import cg.ncn.migration.MigrationDeath;
import cg.ncn.migration.MigrationMentionToIdeath;
import cg.ncn.migration.MigrationMentionToIother;
import cg.ncn.migration.MigrationRegister;
import cg.ncn.migration.MigrationUser;

public class Main {

    public static void main( String[] args ) {

        /*
         * Demarrage de toutes les connections Mode singleton (fast)
         * InitAllConnections.start()
         */

        /* Debut migration */
        MigrationUser.migrateUserEtatToVital();

        MigrationRegister.migrateRegisterEtatToVital();

        MigrationBirth.migrateBirthEtatToVital();

        MigrationDeath.migrateDeathEtatToVital();

        MigrationMentionToIother.migreMentionEtatToChthibiIother();

        MigrationMentionToIdeath.migreMentionEtatToChthibiIdeathother();

    }

}
