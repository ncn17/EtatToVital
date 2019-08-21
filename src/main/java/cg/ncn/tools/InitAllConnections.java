package cg.ncn.tools;

public class InitAllConnections {
    public static void start(){
        HbEtatCivilUtils.getSessionFactory();
        HbVitalStatUtils.getSessionFactory();
        MyTools.getChthibiAnnex();
        MyTools.getChthibiDistrict();
        MyTools.getChthibiUser();
    }
}
