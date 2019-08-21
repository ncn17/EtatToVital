package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Act;
import cg.ncn.tools.HbEtatCivilUtils;

public class ActDAO implements DAOEtatCivil<Act> {

    @Override
    public List<Act> findAll() {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        List<Act> actList = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.etatcivil.Act " );
            actList = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return actList;
    }

    @Override
    public int save( Act obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Act finbId( int id ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        Act act = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select a from Act a where idact=:id " );
            q.setParameter( "id", id );
            act = (Act) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return act;
    }


}
