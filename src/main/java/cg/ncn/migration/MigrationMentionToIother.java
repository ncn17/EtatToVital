package cg.ncn.migration;

import cg.ncn.dao.etatcivil.DAOEtatFactory;
import cg.ncn.dao.vital.DAOVitalFactory;
import cg.ncn.entities.etatcivil.Mention;
import cg.ncn.entities.vital.ChthibiIother;
import cg.ncn.tools.MyTools;

public class MigrationMentionToIother {

    public static void migreMentionEtatToChthibiIother() {

        for ( Mention mention : DAOEtatFactory.getMentionDAO().findAllByTYPE( MyTools.IOTHER ) ) {
            DAOVitalFactory.getChthibiIotherDAO().save( getIOther( mention ) );
        }

    }

    private static ChthibiIother getIOther( Mention mention ) {
        ChthibiIother iother = new ChthibiIother();

        iother.setId( mention.getIdmention() );
        iother.setIdbirth( mention.getAct().getIdact() );
        iother.setIdtype( mention.getIdmention() );

        iother.setContent( mention.getDisplayText() );
        iother.setContentfr( mention.getDisplaySummary() );

        iother.setDaygeorgianedition( mention.getDayGregorianEdition() );
        iother.setMonthgeorgianedition( mention.getMonthGregorianEdition() );
        iother.setYeargeorgianedition( mention.getYearGregorianEdition() );
        iother.setDayhijriedition( mention.getDayHijriEdition() );
        iother.setMonthhijriedition( mention.getMonthHijriEdition() );
        iother.setYearhijriedition( mention.getYearHijriEdition() );

        iother.setIduser( MyTools.IdADMIN );
        iother.setValid( MyTools.VALID );

        iother.setMentionofficerar( mention.getOfficerAr() );
        iother.setMentionofficerfr( mention.getOfficerFr() );

        return iother;

    }

}
