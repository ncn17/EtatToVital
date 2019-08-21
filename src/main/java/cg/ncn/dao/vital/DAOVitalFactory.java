package cg.ncn.dao.vital;

public class DAOVitalFactory {

    public static ChthibiUserDAO getChthibiUserDAO() {
        return new ChthibiUserDAO();
    }

    public static ChthibiRegisterDAO getChthibiRegisterDAO() {
        return new ChthibiRegisterDAO();
    }
    
    public static ChthibiAnnexDAO getChthibiAnnexDAO() {
        return new ChthibiAnnexDAO();
    }
    
    public static ChthibiDistrictDAO getChthibiDistrictDAO() {
        return new ChthibiDistrictDAO();
    }
    
    public static ChthibiBirthDAO getChthibiBirthDAO() {
        return new ChthibiBirthDAO();
    }
    
    public static ChthibiDeathDAO getChthibiDeathDAO() {
        return new ChthibiDeathDAO();
    }

}
