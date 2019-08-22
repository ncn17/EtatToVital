package cg.ncn.dao.etatcivil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Birth;
import cg.ncn.entities.etatcivil.Death;
import cg.ncn.entities.etatcivil.Mention;
import cg.ncn.tools.HbEtatCivilUtils;
import cg.ncn.tools.MyTools;

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

    public List<Mention> findAllByTYPE( int type ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();

        // update later !!!!!!!!!!
        List<Integer> list = new ArrayList<Integer>();

        if ( type == 0 ) {
            for ( Birth b : DAOEtatFactory.getBirthDAO().findAll() ) {
                list.add( b.getIdbirth() );
            }
        } else {
            for ( Death d : DAOEtatFactory.getDeathDAO().findAll() ) {
                list.add( d.getIddeath() );
            }
        }

        List<Mention> mentionList = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery(
                    "from cg.ncn.entities.etatcivil.Mention where IDMentionType=:idtype AND IDAct IN:ids )" );
            q.setParameter( "idtype", MyTools.MENTIONIDTYPE );
            q.setParameterList( "ids", list );
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

        return null;
    }

}
