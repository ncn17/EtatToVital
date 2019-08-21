package cg.ncn.migration;

import cg.ncn.entities.etatcivil.Act;
import cg.ncn.entities.etatcivil.Mention;
import cg.ncn.entities.vital.ChthibiIabbottconjugal;
import cg.ncn.tools.MyTools;

public class MigrationChthibiIabbottconjugal {
    
    public static ChthibiIabbottconjugal getChthibiIabbottconjugal(Mention mention) {
        
        Act act = mention.getAct();
        
        ChthibiIabbottconjugal newConjugal = new ChthibiIabbottconjugal();
        
        newConjugal.setIdbirth( act.getIdact() );
        newConjugal.setIdtype( mention.getMentiontype().getIdmentionType() );
        
        newConjugal.setIduser( MyTools.IdADMIN );
        newConjugal.setValid( MyTools.VALID );
        
        return null;
    }

}
