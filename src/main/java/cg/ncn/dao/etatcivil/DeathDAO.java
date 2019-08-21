package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Death;
import cg.ncn.tools.HbEtatCivilUtils;

public class DeathDAO implements DAOEtatCivil<Death> {

    @Override
    public List<Death> findAll() {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        List<Death> deathList = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.etatcivil.Death " );
            deathList = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return deathList;
    }

    @Override
    public int save( Death obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Death finbId( int id ) {
        // TODO Auto-generated method stub
        return null;
    }

}
