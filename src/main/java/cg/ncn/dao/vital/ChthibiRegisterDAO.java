package cg.ncn.dao.vital;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.vital.ChthibiRegister;
import cg.ncn.tools.HbVitalStatUtils;

public class ChthibiRegisterDAO implements DAOVital<ChthibiRegister> {

    @Override
    public List<ChthibiRegister> findAll(  ) {
        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        List<ChthibiRegister> register = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.vital.ChthibiRegister" );
            register = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return register;
    }

}
