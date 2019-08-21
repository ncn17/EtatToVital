package cg.ncn.dao.etatcivil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.etatcivil.Person;
import cg.ncn.tools.HbEtatCivilUtils;

public class PersonDAO implements DAOEtatCivil<Person> {

    @Override
    public List<Person> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save( Person obj ) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Person finbId( int id ) {
        Session session = HbEtatCivilUtils.getSessionFactory().openSession();
        Person pers = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select p from Person p where idperson=:id " );
            q.setParameter( "id", id );
            pers = (Person) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return pers;
    }

}
