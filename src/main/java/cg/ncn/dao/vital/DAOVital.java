package cg.ncn.dao.vital;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.tools.HbVitalStatUtils;

public interface DAOVital<T> {

    public List<T> findAll( );
    
    public default void save( T data) {
        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save( data );
            tx.commit();
        } catch ( Exception e ) {
            e.printStackTrace();
            tx.rollback();
        }
        session.close();
    }

}
