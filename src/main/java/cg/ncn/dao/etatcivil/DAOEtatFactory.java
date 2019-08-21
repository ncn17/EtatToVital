package cg.ncn.dao.etatcivil;

public class DAOEtatFactory {

    public static RegisterDAO getRegisterDAO() {
        return new RegisterDAO();
    }

    public static UserDAO getUserDAO() {
        return new UserDAO();
    }
    
    public static ActDAO getActDAO() {
        return new ActDAO();
    }
    
    public static TranscriptionDAO getTranscriptionDAO() {
        return new TranscriptionDAO();
    }
    
    public static PersonDAO getPersonDAO() {
        return new PersonDAO();
    }
    
    public static BirthDAO getBirthDAO() {
        return new BirthDAO();
    }
    
    public static PersondeclarationDAO getPersondeclarationDAO() {
        return new PersondeclarationDAO();
    }
    
    public static JudgmentDeclarationDAO getJudgmentDeclarationDAO() {
        return new JudgmentDeclarationDAO();
    }
    
    public static DeathDAO getDeathDAO() {
        return new DeathDAO();
    }
    
    public static MentionDAO getMentionDAO() {
        return new MentionDAO();
    }
    
    public static MentionTypeDAO getMentionTypeDAO() {
        return new MentionTypeDAO();
    }
    
}
