package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Birth;
import cg.ncn.tools.HbEtatCivilUtils;

public class BirthDAO implements DAOEtatCivil<Birth> {

    @Override
    public List<Birth> findAll() {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        List<Birth> birthList = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.etatcivil.Birth " );
            birthList = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return birthList;
    }

    @Override
    public int save( Birth obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Birth finbId( int id ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        Birth birth = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select p from Birth p where idbirth=:id " );
            q.setParameter( "id", id );
            birth = (Birth) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return birth;
    }

}
