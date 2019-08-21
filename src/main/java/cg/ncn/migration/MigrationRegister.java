package cg.ncn.migration;

import java.util.List;

import cg.ncn.dao.etatcivil.DAOEtatFactory;
import cg.ncn.dao.vital.DAOVitalFactory;
import cg.ncn.entities.etatcivil.Register;
import cg.ncn.entities.vital.ChthibiRegister;
import cg.ncn.tools.MyTools;

public class MigrationRegister {

    public static void migrateRegisterEtatToVital() {

        List<Register> listRegisters = DAOEtatFactory.getRegisterDAO().findAll();
        for ( Register register : listRegisters ) {

            /* save */
            DAOVitalFactory.getChthibiRegisterDAO().save( getChthibiRegister( register ) );
        }
    }

    public static ChthibiRegister getChthibiRegister( Register register ) {
        ChthibiRegister chthibiRegister = new ChthibiRegister();
        chthibiRegister.setId( register.getIdregister() );
        chthibiRegister.setIddistrict( MyTools.IdDISTRICT );
        chthibiRegister.setIdannex( MyTools.IdANNEX );
        chthibiRegister.setYear( register.getYear() );
        chthibiRegister.setNumber( register.getNumber() );
        chthibiRegister.setPagescount( register.getPagesCount() );
        chthibiRegister.setEditorfrench( register.getEditorFr() );
        chthibiRegister.setEditorarabic( register.getEditorAr() );
        chthibiRegister.setDaygeorgian( register.getDayGregorian() );
        chthibiRegister.setDayhijri( register.getDayHijri() );
        chthibiRegister.setMonthgeorgian( register.getMonthGregorian() );
        chthibiRegister.setMonthhijri( register.getMonthGregorian() );
        chthibiRegister.setYear( register.getYear() );
        chthibiRegister.setYeargeorgian( register.getYearGregorian() );
        chthibiRegister.setYearhijri( register.getYearHijri() );
        chthibiRegister.setValid( MyTools.VALID );
        chthibiRegister.setIduser( MyTools.IdADMIN );
        
        /*  */

        /* IDTYPE zone */
        chthibiRegister.setIdtype( getIDTYPE( register ) );

        return chthibiRegister;
    }

    public static int getIDTYPE( Register register ) {

        int idType = register.getRegistertype().getIdregisterType();
        int idClass = register.getRegisterclass().getIdregisterClass();
        int idNumb = register.getRegisternumbering().getIdregisterNumbering();

        int link = 0;

        if ( idType == idClass && idType == 1 ) {
            switch ( idNumb ) {
            case 1:
                link = 1;
                break;
            case 2:
                link = 9;
                break;
            case 3:
                link = 10;
                break;
            case 4:
                link = 11;
                break;
            }
        } else if ( idType == 1 && idClass == 2 ) {
            switch ( idNumb ) {
            case 1:
                link = 6;
                break;
            case 2:
                link = 22;
                break;
            case 3:
                link = 23;
                break;
            case 4:
                link = 24;
                break;
            }
        } else if ( idType == 1 && idClass == 3 ) {
            switch ( idNumb ) {
            case 1:
                link = 7;
                break;
            case 2:
                link = 28;
                break;
            case 3:
                link = 29;
                break;
            case 4:
                link = 30;
                break;
            }
        } else if ( idType == 2 && idClass == 1 ) {
            switch ( idNumb ) {
            case 1:
                link = 2;
                break;
            case 2:
                link = 16;
                break;
            case 3:
                link = 17;
                break;
            case 4:
                link = 18;
                break;
            }
        } else if ( idType == idClass && idType == 2 && idNumb == 1 ) {
            link = 8;
        } else if ( idType == 2 && idClass == 3 && idNumb == 1 ) {
            link = 15;
        }

        return link;
    }

}
