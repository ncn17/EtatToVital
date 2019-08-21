package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Transcription;
import cg.ncn.tools.HbEtatCivilUtils;

public class TranscriptionDAO implements DAOEtatCivil<Transcription> {

    @Override
    public List<Transcription> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save( Transcription obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Transcription finbId( int id ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        Transcription trans = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select t from Transcription t where idtranscription=:id " );
            q.setParameter( "id", id );
            trans = (Transcription) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return trans;
    }

}
