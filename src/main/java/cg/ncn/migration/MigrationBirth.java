package cg.ncn.migration;

import java.util.List;

import cg.ncn.dao.etatcivil.DAOEtatFactory;
import cg.ncn.dao.vital.DAOVitalFactory;
import cg.ncn.entities.etatcivil.Act;
import cg.ncn.entities.etatcivil.Birth;
import cg.ncn.entities.etatcivil.Declaration;
import cg.ncn.entities.etatcivil.Edition;
import cg.ncn.entities.etatcivil.Judgmentdeclaration;
import cg.ncn.entities.etatcivil.Person;
import cg.ncn.entities.etatcivil.Persondeclaration;
import cg.ncn.entities.etatcivil.Register;
import cg.ncn.entities.etatcivil.Transcription;
import cg.ncn.entities.vital.ChthibiBirth;
import cg.ncn.entities.vital.ChthibiRegister;
import cg.ncn.tools.MyTools;

public class MigrationBirth {

    public static void migrateBirthEtatToVital() {

        List<Birth> listBirth = DAOEtatFactory.getBirthDAO().findAll();
        for ( Birth birth : listBirth ) {

            /* save */
            DAOVitalFactory.getChthibiBirthDAO().save( getBirth( birth ) );
        }
    }

    private static ChthibiBirth getBirth( Birth etatBirth ) {
        ChthibiBirth birth = new ChthibiBirth();

        /*
         * User Default Admin id ==>> 2
         */
        birth.setChthibiUser( MyTools.getChthibiUser() );
        birth.setId( etatBirth.getIdbirth() );

        // get Transcription && mapping
        Transcription transcription = etatBirth.getTranscription();

        // get Act,Edition,Person,declaration && mapping
        Act act = DAOEtatFactory.getActDAO().finbId( etatBirth.getIdbirth() );
        Edition edt = act.getEdition();
        Person person = act.getPerson();
        Declaration declaration = act.getDeclaration();
        Register register = act.getRegister();
        ChthibiRegister chthibiRegister = MigrationRegister.getChthibiRegister( register );

        birth.setChthibiAnnex( MyTools.getChthibiAnnex() );
        birth.setChthibiDistrict( MyTools.getChthibiDistrict() );
        birth.setChthibiRegister( chthibiRegister );
        birth.setValid( MyTools.VALID );
        birth.setTranscactdaygeorgian( edt.getDayGregorian() );
        birth.setTranscactdayhijri( edt.getDayHijri() );
        birth.setTranscactmonthgeorgian( edt.getMonthGregorian() );
        birth.setTranscactmonthhijri( edt.getMonthHijri() );
        birth.setTranscactyeargeorgian( edt.getYearGregorian() );
        birth.setTranscactyearhijri( edt.getYearHijri() );
        birth.setTranscactjobarabic( edt.getExecutiveAr() );
        birth.setTranscactjobfrench( edt.getExecutiveFr() );
        birth.setTranscactundersignedarabic( edt.getSignedAr() );
        birth.setTranscactundersignedfrench( edt.getSignedFr() );
        birth.setActdaygeorgian( edt.getDayGregorian() );
        birth.setActdayhijri( edt.getDayHijri() );
        birth.setActmonthgeorgian( edt.getMonthGregorian() );
        birth.setActmonthhijri( edt.getMonthHijri() );
        birth.setActyeargeorgian( edt.getYearGregorian() );
        birth.setActyearhijri( edt.getYearHijri() );
        birth.setActjobarabic( edt.getExecutiveAr() );
        birth.setActjobfrench( edt.getExecutiveFr() );
        birth.setActundersignedarabic( edt.getSignedAr() );
        birth.setActundersignedfrench( edt.getSignedFr() );
        birth.setFirstnamemarginar( act.getFirstNameMarginAr() );
        birth.setFirstnamemarginfr( act.getFirstNameMarginFr() );
        birth.setLastnamemarginar( act.getLastNameMarginAr() );
        birth.setLastnamemarginfr( act.getLastNameMarginAr() );
        birth.setBirthcityarabic( act.getCityActAr() );
        birth.setBirthcityfrench( act.getCityActFr() );
        birth.setNumber( act.getNumber() );
        birth.setIsproblem( act.getIsProblem() );
        birth.setComment( act.getComment() );
        birth.setFirstnamearabic( person.getFirstNameAr() );
        birth.setFirstnamefrench( person.getFirstNameFr() );
        birth.setLastnamearabic( person.getLastNameAr() );
        birth.setLastnamefrench( person.getLastNameFr() );
        birth.setLocalarabic( act.getLocalActAr() );
        birth.setLocalfrench( act.getLocalActFr() );
        birth.setDaygeorgian( act.getDayActGregorian() );
        birth.setDayhijri( act.getDayActHijri() );
        birth.setMonthgeorgian( act.getMonthActGregorian() );
        birth.setMonthhijri( act.getMonthActHijri() );
        birth.setYeargeorgian( act.getYearActGregorian() );
        birth.setYearhijri( act.getYearActHijri() );
        birth.setHour( act.getHourAct() );
        birth.setMinute( act.getMinuteAct() );
        birth.setSex( person.getGender() );
        birth.setTwin( etatBirth.getTwin() );
        birth.setIsabondoned( etatBirth.getAbandoned() );
        /* view */
        birth.setResidencecityarabic( person.getCityResidenceAr() );
        birth.setResidencecityarabic( person.getCityResidenceFr() );
        birth.setNationalityarabic( person.getNationalityAr() );
        birth.setNationalityfrench( person.getNationalityFr() );
        birth.setRank( person.getRank() );
        birth.setReghour( edt.getHour() );
        birth.setRegminute( edt.getMinute() );
        birth.setDate( MyTools.getPersonDate() );

        /* view */
        if ( transcription != null ) {

            birth.setIstranscripted( MyTools.IdSTATEMENT );
            birth.setTranscriptiondaygeorgian( transcription.getDayDemandGregorian() );
            birth.setTranscriptiondayhijri( transcription.getDayDemandHijri() );
            birth.setTranscriptionmonthgeorgian( transcription.getMonthDemandGregorian() );
            birth.setTranscriptionmonthhijri( transcription.getMonthDemandHijri() );
            birth.setTranscriptionyeargeorgian( transcription.getYearDemandGregorian() );
            birth.setTranscriptionyearhijri( transcription.getYearDemandHijri() );
            // transcription origine only Ar
            birth.setTranscriptionorigine( transcription.getOriginAr() );
            // transc
            birth.setTranscdemandedaygeorgian( transcription.getDayDemandGregorian() );
            birth.setTranscdemandedayhijri( transcription.getDayDemandHijri() );
            birth.setTranscdemandemonthgeorgian( transcription.getMonthDemandGregorian() );
            birth.setTranscdemandemonthhijri( transcription.getMonthDemandHijri() );
            birth.setTranscdemandeyeargeorgian( transcription.getYearDemandGregorian() );
            birth.setTranscdemandeyearhijri( transcription.getYearDemandHijri() );
            birth.setTranscdemandewhoarabic( transcription.getEnvoyAr() );
            birth.setTranscdemandewhofrench( transcription.getEnvoyFr() );
            birth.setTranscoriginenumber( transcription.getOriginNumber() );
            birth.setTranscactoriginefrench( transcription.getOriginFr() );
            birth.setTranscactoriginearabic( transcription.getOriginAr() );
        }

        /* father */
        Person father = null;
        if ( ( father = person.getPersonByIdfather() ) != null ) {

            birth.setFatherfirstnamearabic( father.getFirstNameAr() );
            birth.setFatherfirstnamefrench( father.getFirstNameFr() );
            birth.setFathernationalityarabic( father.getNationalityAr() );
            birth.setFathernationalityfrench( father.getNationalityFr() );
            birth.setFatherjobarabic( father.getJobAr() );
            birth.setFatherjobfrench( father.getJobFr() );
            birth.setFatherlocalarabic( father.getAdressAr() );
            birth.setFatherlocalfrench( father.getAdressFr() );
            birth.setFatheradressarabic( father.getAdressAr() );
            birth.setFatheradressfrench( father.getAdressFr() );
            birth.setFatherdeath( father.getIsDead() );
            birth.setFatherdaygeorgian( father.getDayBirthGregorian() );
            birth.setFatherdayhijri( father.getDayBirthHijri() );
            birth.setFathermonthgeorgian( father.getMonthBirthGregorian() );
            birth.setFathermonthhijri( father.getMonthBirthHijri() );
            birth.setFatheryeargeorgian( father.getYearBirthGregorian() );
            birth.setFatheryearhijri( father.getYearBirthHijri() );
            birth.setFathereducationlevel( father.getGradeAr() );
        }
        /* Mother */
        Person mother = null;
        if ( ( mother = person.getPersonByIdfather() ) != null ) {

            birth.setMotherfirstnamearabic( mother.getFirstNameAr() );
            birth.setMotherfirstnamefrench( mother.getFirstNameFr() );
            birth.setMothernationalityarabic( mother.getNationalityAr() );
            birth.setMothernationalityfrench( mother.getNationalityFr() );
            birth.setMotherjobarabic( mother.getJobAr() );
            birth.setMotherjobfrench( mother.getJobFr() );
            birth.setMotherlocalarabic( mother.getAdressAr() );
            birth.setMotherlocalfrench( mother.getAdressFr() );
            birth.setMotheradressarabic( mother.getAdressAr() );
            birth.setMotheradressfrench( mother.getAdressFr() );
            birth.setMotherdeath( mother.getIsDead() );
            birth.setMotherdaygeorgian( mother.getDayBirthGregorian() );
            birth.setMotherdayhijri( mother.getDayBirthHijri() );
            birth.setMothermonthgeorgian( mother.getMonthBirthGregorian() );
            birth.setMothermonthhijri( mother.getMonthBirthHijri() );
            birth.setMotheryeargeorgian( mother.getYearBirthGregorian() );
            birth.setMotheryearhijri( mother.getYearBirthHijri() );
            birth.setMothereducationlevel( mother.getGradeAr() );
        }

        /* Declaration mapping */
        if ( declaration != null ) {

            /* personDeclaration mapping */
            Persondeclaration personDeclaration = DAOEtatFactory.getPersondeclarationDAO()
                    .finbId( declaration.getIddeclaration() );
            if ( personDeclaration != null ) {
                /* view */
                birth.setStatementtype( 1 );
                birth.setDeclarantnumber( personDeclaration.getNumber() );
                birth.setDeclarantfirstnamearabic( personDeclaration.getFirstNameAr() );
                birth.setDeclarantfirstnamefrench( personDeclaration.getFirstNameFr() );
                birth.setDeclarantrelationshiparabic( personDeclaration.getRelationShipAr() );
                birth.setDeclarantrelationshipfrench( personDeclaration.getRelationShipFr() );
                birth.setDeclarantage( personDeclaration.getAge() );
                birth.setDeclarantjobarabic( personDeclaration.getJobAr() );
                birth.setDeclarantjobfrench( personDeclaration.getJobFr() );
                birth.setDeclarantadressarabic( personDeclaration.getAdressAr() );
                birth.setDeclarantadressfrench( personDeclaration.getAdressFr() );
                birth.setDeclarantnationalityarabic( personDeclaration.getNationalityAr() );
                birth.setDeclarantnationalityarabic( personDeclaration.getNationalityFr() );
                birth.setFoldernumber( personDeclaration.getFolderNumber() );
            } else {
                /* judgment declaration */
                Judgmentdeclaration judgement = DAOEtatFactory.getJudgmentDeclarationDAO()
                        .finbId( declaration.getIddeclaration() );
                if ( judgement != null ) {
                    birth.setJudgementnumber( judgement.getJudgmentNumber() );
                    birth.setJudgementfilenumber( judgement.getFile() );
                    birth.setJudgementcourtarabic( judgement.getCourtAr() );
                    birth.setJudgementcourtfrench( judgement.getCourtFr() );
                    birth.setJudgementyear( judgement.getInformationYearGregorian() );
                    birth.setJudgementdaygeorgian( judgement.getInformationDayGregorian() );
                    birth.setJudgementdayhijri( judgement.getInformationDayHijri() );
                    birth.setJudgementmonthgeorgian( judgement.getInformationMonthGregorian() );
                    birth.setJudgementmonthhijri( judgement.getInformationMonthHijri() );
                    birth.setJudgementyeargeorgian( judgement.getInformationYearGregorian() );
                    birth.setJudgementyearhijri( judgement.getInformationYearHijri() );
                    birth.setOrdernumber( judgement.getOrderNumber() );
                    birth.setPermissionnumber( judgement.getPermissionNumber() );
                }
            }

        }
        /* Not found Valid mapping */
        return birth;
    }

}
