package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Persondeclaration;
import cg.ncn.tools.HbEtatCivilUtils;

public class PersondeclarationDAO implements DAOEtatCivil<Persondeclaration> {

    @Override
    public List<Persondeclaration> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save( Persondeclaration obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Persondeclaration finbId( int id ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        Persondeclaration declare = new Persondeclaration();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select p from Persondeclaration p where idpersonDeclaration=:id " );
            q.setParameter( "id", id );
            declare = (Persondeclaration) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return declare;
    }

}
