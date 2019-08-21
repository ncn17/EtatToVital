package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Mention;
import cg.ncn.tools.HbEtatCivilUtils;

public class MentionDAO implements DAOEtatCivil<Mention> {

    @Override
    public List<Mention> findAll() {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();

        List<Mention> mentionList = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.etatcivil.Mention" );
            mentionList = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return mentionList;
    }

    @Override
    public int save( Mention obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Mention finbId( int id ) {
        // TODO Auto-generated method stub
        return null;
    }

}
