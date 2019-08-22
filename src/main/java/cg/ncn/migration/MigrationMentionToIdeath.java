package cg.ncn.migration;

import cg.ncn.dao.etatcivil.DAOEtatFactory;
import cg.ncn.dao.vital.DAOVitalFactory;
import cg.ncn.entities.etatcivil.Mention;
import cg.ncn.entities.vital.ChthibiIdeathother;
import cg.ncn.tools.MyTools;

public class MigrationMentionToIdeath {

    public static void migreMentionEtatToChthibiIdeathother() {

        for ( Mention mention : DAOEtatFactory.getMentionDAO().findAllByTYPE( MyTools.IDEATH ) ) {
            DAOVitalFactory.getChthibiIdeathotherDAO().save( getideath( mention ) );
        }

    }

    private static ChthibiIdeathother getideath( Mention mention ) {
        ChthibiIdeathother ideath = new ChthibiIdeathother();

        ideath.setId( mention.getIdmention() );
        ideath.setIddeath( mention.getAct().getIdact() );
        ideath.setIdtype( mention.getIdmention() );

        ideath.setContent( mention.getDisplayText() );
        ideath.setContentfr( mention.getDisplaySummary() );

        ideath.setDaygeorgianedition( mention.getDayGregorianEdition() );
        ideath.setMonthgeorgianedition( mention.getMonthGregorianEdition() );
        ideath.setYeargeorgianedition( mention.getYearGregorianEdition() );
        ideath.setDayhijriedition( mention.getDayHijriEdition() );
        ideath.setMonthhijriedition( mention.getMonthHijriEdition() );
        ideath.setYearhijriedition( mention.getYearHijriEdition() );

        ideath.setIduser( MyTools.IdADMIN );
        ideath.setValid( MyTools.VALID );

        ideath.setMentionofficerar( mention.getOfficerAr() );
        ideath.setMentionofficerfr( mention.getOfficerFr() );

        return ideath;

    }
}
