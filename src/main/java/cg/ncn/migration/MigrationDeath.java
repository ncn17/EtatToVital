package cg.ncn.migration;

import java.util.List;

import cg.ncn.dao.etatcivil.DAOEtatFactory;
import cg.ncn.dao.vital.DAOVitalFactory;
import cg.ncn.entities.etatcivil.Act;
import cg.ncn.entities.etatcivil.Death;
import cg.ncn.entities.etatcivil.Declaration;
import cg.ncn.entities.etatcivil.Edition;
import cg.ncn.entities.etatcivil.Judgmentdeclaration;
import cg.ncn.entities.etatcivil.Person;
import cg.ncn.entities.etatcivil.Persondeclaration;
import cg.ncn.entities.etatcivil.Register;
import cg.ncn.entities.vital.ChthibiDeath;
import cg.ncn.tools.MyTools;

public class MigrationDeath {
    
    public static void migrateDeathEtatToVital() {

        List<Death> listDeath = DAOEtatFactory.getDeathDAO().findAll();
        for ( Death death : listDeath ) {

            /* save */
           DAOVitalFactory.getChthibiDeathDAO().save( getDeath( death ) );
        }
    }

    private static ChthibiDeath getDeath( Death etatDeath ) {
        ChthibiDeath death = new ChthibiDeath();

        Act act = DAOEtatFactory.getActDAO().finbId( etatDeath.getIddeath() );
        Person person = act.getPerson();
        Edition edt = act.getEdition();
        Declaration declaration = act.getDeclaration();
        Register register = act.getRegister();

        death.setId( etatDeath.getIddeath() );
        /* view  */
        death.setNumber( act.getNumber() );
        death.setIdregister( register.getIdregister() );
        death.setIdannex( MyTools.IdANNEX );
        death.setIddistrict( MyTools.IdDISTRICT );
        death.setIduser( MyTools.IdADMIN );
        death.setFirstnamearabic( person.getFirstNameAr() );
        death.setFirstnamefrench( person.getFirstNameFr() );
        death.setLastnamearabic( person.getLastNameAr() );
        death.setLastnamefrench( person.getLastNameFr() );
        death.setNationalityarabic( person.getNationalityAr() );
        death.setNationalityfrench( person.getNationalityFr() );
        death.setJobarabic( person.getJobAr() );
        death.setJobfrench( person.getJobFr() );
        death.setLocalarabic( act.getLocalActAr() );
        death.setLocalfrench( act.getLocalActFr() );
        /* view */
        death.setJobcategory( person.getJobcategory().getIdjobCategory() );
        death.setMarriedwithfrench( etatDeath.getSpouseFr() );
        death.setMarriedwitharabic( etatDeath.getSpouseAr() );
        death.setAdressarabic( person.getAdressAr() );
        death.setAdressfrench( person.getAdressFr() );
        
        death.setDate( MyTools.getPersonDate( ) );
        
        death.setDaygeorgian( act.getDayActGregorian() );
        death.setMonthgeorgian( act.getMonthActGregorian() );
        death.setYeargeorgian( act.getYearActGregorian() );
        death.setDayhijri( act.getDayActHijri() );
        death.setMonthhijri( act.getMonthActHijri() );
        death.setYearhijri( act.getYearActHijri() );
        death.setBirthdaygeorgian( person.getDayBirthGregorian() );
        death.setBirthdayhijri( person.getDayBirthHijri() );
        death.setBirthmonthgeorgian( person.getMonthBirthGregorian() );
        death.setBirthmonthhijri( person.getMonthBirthHijri() );
        death.setBirthyeargeorgian( person.getYearBirthGregorian() );
        death.setBirthyearhijri( person.getYearBirthHijri() );
        death.setHour( act.getHourAct() );
        death.setMinute( act.getMinuteAct() );
        death.setMarried( etatDeath.getMarried() );
        death.setBirthlocalarabic( person.getBirthPlaceAr() );
        death.setBirthlocalfrench( person.getBirthPlaceFr() );
        death.setIsproblem( act.getIsProblem() );
        death.setComment( act.getComment() );
        death.setFirstnamemarginar( act.getFirstNameMarginAr() );
        death.setFirstnamemarginfr( act.getFirstNameMarginFr() );
        death.setLastnamemarginar( act.getLastNameMarginAr() );
        death.setLastnamemarginfr( act.getLastNameMarginFr() );
        death.setEducationlevel( person.getGradeAr() );
        death.setRank( person.getRank() );
        death.setValid( MyTools.VALID );
        death.setActdaygeorgian( edt.getDayGregorian() );
        death.setActdayhijri( edt.getDayHijri() );
        death.setActmonthgeorgian( edt.getMonthGregorian() );
        death.setActmonthhijri( edt.getMonthHijri() );
        death.setActyeargeorgian( edt.getYearGregorian() );
        death.setActyearhijri( edt.getYearHijri() );
        death.setActjobarabic( edt.getExecutiveAr() );
        death.setActjobfrench( edt.getExecutiveFr() );
        death.setActundersignedarabic( edt.getSignedAr() );
        death.setActundersignedfrench( edt.getSignedFr() );
        death.setSex( person.getGender() );
        death.setReghour( edt.getHour() );
        death.setRegminute( edt.getMinute() );

        /* father */
        Person father = null;
        if ( ( father = person.getPersonByIdfather() ) != null ) {

            death.setFatherfirstnamearabic( father.getFirstNameAr() );
            death.setFatherfirstnamefrench( father.getFirstNameFr() );
            death.setFathernationalityarabic( father.getNationalityAr() );
            death.setFathernationalityfrench( father.getNationalityFr() );
            death.setFatherjobarabic( father.getJobAr() );
            death.setFatherjobfrench( father.getJobFr() );
            death.setFatheradressarabic( father.getAdressAr() );
            death.setFatheradressfrench( father.getAdressFr() );
            death.setFatherdeath( father.getIsDead() );
            death.setFatherdaygeorgian( father.getDayBirthGregorian() );
            death.setFatherdayhijri( father.getDayBirthHijri() );
            death.setFathermonthgeorgian( father.getMonthBirthGregorian() );
            death.setFathermonthhijri( father.getMonthBirthHijri() );
            death.setFatheryeargeorgian( father.getYearBirthGregorian() );
            death.setFatheryearhijri( father.getYearBirthHijri() );
            death.setFathereducationlevel( father.getGradeAr() );
        }
        Person mother = null;
        if ( ( mother = person.getPersonByIdfather() ) != null ) {

            death.setMotherfirstnamearabic( mother.getFirstNameAr() );
            death.setMotherfirstnamefrench( mother.getFirstNameFr() );
            death.setMothernationalityarabic( mother.getNationalityAr() );
            death.setMothernationalityfrench( mother.getNationalityFr() );
            death.setMotherjobarabic( mother.getJobAr() );
            death.setMotherjobfrench( mother.getJobFr() );
            death.setMotheradressarabic( mother.getAdressAr() );
            death.setMotheradressfrench( mother.getAdressFr() );
            death.setMotherdeath( mother.getIsDead() );
            death.setMotherdaygeorgian( mother.getDayBirthGregorian() );
            death.setMotherdayhijri( mother.getDayBirthHijri() );
            death.setMothermonthgeorgian( mother.getMonthBirthGregorian() );
            death.setMothermonthhijri( mother.getMonthBirthHijri() );
            death.setMotheryeargeorgian( mother.getYearBirthGregorian() );
            death.setMotheryearhijri( mother.getYearBirthHijri() );
            death.setMothereducationlevel( mother.getGradeAr() );
        }

        /* Declaration mapping */
        if ( declaration != null ) {

            /* personDeclaration mapping */
            Persondeclaration personDeclaration = DAOEtatFactory.getPersondeclarationDAO()
                    .finbId( declaration.getIddeclaration() );
            if ( personDeclaration != null ) {
                /* view */
                death.setStatementtype( MyTools.IdSTATEMENT );
                death.setDeclarantnumber( personDeclaration.getNumber() );
                death.setDeclarantfirstnamearabic( personDeclaration.getFirstNameAr() );
                death.setDeclarantfirstnamefrench( personDeclaration.getFirstNameFr() );
                death.setDeclarantrelationshiparabic( personDeclaration.getRelationShipAr() );
                death.setDeclarantrelationshipfrench( personDeclaration.getRelationShipFr() );
                death.setDeclarantage( personDeclaration.getAge() );
                death.setDeclarantjobarabic( personDeclaration.getJobAr() );
                death.setDeclarantjobfrench( personDeclaration.getJobFr() );
                death.setDeclarantadressarabic( personDeclaration.getAdressAr() );
                death.setDeclarantadressfrench( personDeclaration.getAdressFr() );
                death.setDeclarantnationalityarabic( personDeclaration.getNationalityAr() );
                death.setDeclarantnationalityarabic( personDeclaration.getNationalityFr() );
                death.setFoldernumber( personDeclaration.getFolderNumber() );
            } else {
                /* judgment declaration */
                Judgmentdeclaration judgement = DAOEtatFactory.getJudgmentDeclarationDAO()
                        .finbId( declaration.getIddeclaration() );
                if ( judgement != null ) {
                    death.setJudgementnumber( judgement.getJudgmentNumber() );
                    death.setJudgementfilenumber( judgement.getFile() );
                    death.setJudgementcourtarabic( judgement.getCourtAr() );
                    death.setJudgementcourtfrench( judgement.getCourtFr() );
                    death.setJudgementyear( judgement.getInformationYearGregorian() );
                    death.setJudgementdaygeorgian( judgement.getInformationDayGregorian() );
                    death.setJudgementdayhijri( judgement.getInformationDayHijri() );
                    death.setJudgementmonthgeorgian( judgement.getInformationMonthGregorian() );
                    death.setJudgementmonthhijri( judgement.getInformationMonthHijri() );
                    death.setJudgementyeargeorgian( judgement.getInformationYearGregorian() );
                    death.setJudgementyearhijri( judgement.getInformationYearHijri() );
                    death.setOrdernumber( judgement.getOrderNumber() );
                    death.setPermissionnumber( judgement.getPermissionNumber() );
                }
            }
        }

        return death;
    }

}
