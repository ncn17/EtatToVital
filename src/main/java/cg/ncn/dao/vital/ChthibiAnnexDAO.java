package cg.ncn.dao.vital;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.vital.ChthibiAnnex;
import cg.ncn.tools.HbVitalStatUtils;

public class ChthibiAnnexDAO implements DAOVital<ChthibiAnnex> {

    @Override
    public List<ChthibiAnnex> findAll() {
        return null;
    }
    
    public ChthibiAnnex findById(int id) {
        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        ChthibiAnnex annex = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select a from ChthibiAnnex a where id=:id " );
            q.setParameter( "id", id );
            annex = (ChthibiAnnex) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return annex;
    }

}
