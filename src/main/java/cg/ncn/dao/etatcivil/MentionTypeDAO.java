package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Mentiontype;
import cg.ncn.tools.HbEtatCivilUtils;

public class MentionTypeDAO implements DAOEtatCivil<Mentiontype> {

    @Override
    public List<Mentiontype> findAll() {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();

        List<Mentiontype> mentionType = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "from cg.ncn.entities.etatcivil.Mentiontype" );
            mentionType = q.list();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return mentionType;
    }

    @Override
    public int save( Mentiontype obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Mentiontype finbId( int id ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        Mentiontype mentiontype = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select mt from Mentiontype mt where idmentionType=:id " );
            q.setParameter( "id", id );
            mentiontype = (Mentiontype) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return mentiontype;
    }

}
