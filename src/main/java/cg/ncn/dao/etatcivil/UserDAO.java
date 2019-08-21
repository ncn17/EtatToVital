package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.User;
import cg.ncn.tools.HbEtatCivilUtils;

public class UserDAO implements DAOEtatCivil<User> {

    @SuppressWarnings( "unchecked" )
    @Override
    public List<User> findAll() {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        List<User> userList = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.etatcivil.User " );
            userList = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return userList;
    }

    @Override
    public int save( User obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public User finbId( int id ) {
        // TODO Auto-generated method stub
        return null;
    }

}
