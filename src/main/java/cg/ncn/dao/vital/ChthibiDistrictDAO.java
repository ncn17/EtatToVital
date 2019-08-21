package cg.ncn.dao.vital;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.entities.vital.ChthibiDistrict;
import cg.ncn.tools.HbVitalStatUtils;

public class ChthibiDistrictDAO implements DAOVital<ChthibiDistrict> {

    @Override
    public List<ChthibiDistrict> findAll(  ) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public ChthibiDistrict findById(int id) {
        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        ChthibiDistrict district = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( "select a from ChthibiDistrict a where id=:id " );
            q.setParameter( "id", id );
            district = (ChthibiDistrict) q.uniqueResult();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
        return district;
    }

}
