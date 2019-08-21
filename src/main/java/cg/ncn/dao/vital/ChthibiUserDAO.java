package cg.ncn.dao.vital;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.vital.ChthibiUser;
import cg.ncn.tools.HbVitalStatUtils;

public class ChthibiUserDAO implements DAOVital<ChthibiUser> {

    @Override
    public List<ChthibiUser> findAll( ) {
        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        List<ChthibiUser> users = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.vital.ChthibiUser" );
            users = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return users;
    }
    
    public ChthibiUser findById( int id) {
        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        ChthibiUser user = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select u from ChthibiUser u where id=:id" );
            q.setParameter( "id", id );
            user = (ChthibiUser) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return user;
    }

}
