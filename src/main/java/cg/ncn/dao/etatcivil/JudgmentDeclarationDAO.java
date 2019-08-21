package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Judgmentdeclaration;
import cg.ncn.tools.HbEtatCivilUtils;

public class JudgmentDeclarationDAO implements DAOEtatCivil<Judgmentdeclaration> {

    @Override
    public List<Judgmentdeclaration> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save( Judgmentdeclaration obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Judgmentdeclaration finbId( int id ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        Judgmentdeclaration judgment = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select j from Judgmentdeclaration j where idjudgmentDeclaration=:id " );
            q.setParameter( "id", id );
            judgment = (Judgmentdeclaration) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return judgment;
    }

}
