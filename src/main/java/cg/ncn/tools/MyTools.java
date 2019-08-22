package cg.ncn.tools;

import java.util.Date;

import cg.ncn.dao.vital.DAOVitalFactory;
import cg.ncn.entities.vital.ChthibiAnnex;
import cg.ncn.entities.vital.ChthibiDistrict;
import cg.ncn.entities.vital.ChthibiUser;

public class MyTools {

    private static ChthibiAnnex    annex         = getChthibiAnnex();
    private static ChthibiDistrict district      = getChthibiDistrict();
    private static ChthibiUser     user          = getChthibiUser();
    public static final int        IdANNEX       = 14;
    public static final int        IdDISTRICT    = 2;
    public static final int        IdADMIN       = 1;
    public static final int        IdSTATEMENT   = 1;
    public static final int        VALID         = 0;
    public static final int        MENTIONIDTYPE = 15;
    public static final int        IOTHER        = 0;
    public static final int        IDEATH        = 1;

    public static ChthibiAnnex getChthibiAnnex() {
        if ( annex == null ) {
            annex = DAOVitalFactory.getChthibiAnnexDAO().findById( MyTools.IdANNEX );
        }
        return annex;
    }

    public static ChthibiDistrict getChthibiDistrict() {
        if ( district == null ) {
            district = DAOVitalFactory.getChthibiDistrictDAO().findById( MyTools.IdDISTRICT );
        }
        return district;
    }

    public static ChthibiUser getChthibiUser() {
        if ( user == null ) {
            user = DAOVitalFactory.getChthibiUserDAO().findById( IdADMIN );
        }
        return user;
    }

    public static Date getPersonDate() {
        return new Date();
    }

}
