package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Register;
import cg.ncn.tools.HbEtatCivilUtils;

public class RegisterDAO implements DAOEtatCivil<Register> {

    @Override
    public List<Register> findAll() {

        Session session = HbEtatCivilUtils.getSessionFactory().openSession();

        List<Register> register = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.etatcivil.Register" );
            register = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return register;
    }

    @Override
    public int save( Register register ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        Transaction tx = null;
        int status = 0;
        try {
            tx = session.beginTransaction();
            status = (int) session.save( register );
            tx.commit();
        } catch ( Exception e ) {
            e.printStackTrace();
            tx.rollback();
        }
        session.close();
        return status;
    }

    @Override
    public Register finbId( int id ) {
        // TODO Auto-generated method stub
        return null;
    }

}
