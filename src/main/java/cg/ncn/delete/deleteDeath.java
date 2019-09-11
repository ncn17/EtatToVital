package cg.ncn.delete;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cg.ncn.tools.HbVitalStatUtils;

public class deleteDeath {

    private static String query = "Delete from cg.ncn.entities.vital.ChthibiDeath where ID <  12 and ID > 29\n" +
            "and id not in (select id from cg.ncn.entities.vital.ChthibiIacquiremoroccannationality )\n" +
            "and id not in (select id from cg.ncn.entities.vital.ChthibiIdeathforeignfirstnamechange )\n" +
            "and id not in (select id from cg.ncn.entities.vital.ChthibiIdeathlastnamereplacement )\n" +
            "and id not in (select id from cg.ncn.entities.vital.ChthibiIdeathother)\n" +
            "and id not in (select id from cg.ncn.entities.vital.ChthibiIdeathreformlatinname )\n" +
            "and id not in (select id from cg.ncn.entities.vital.ChthibiIdeathRevision )\n" +
            "and id not in (select id from cg.ncn.entities.vital.ChthibiIdeathsinbirthplace )\n" +
            "and id not in (select id from cg.ncn.entities.vital.ChthibiIdeathsinnonbirthplace )";

    public static void clean() {
        Session session = HbVitalStatUtils.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery( query );
            q.executeUpdate();
            tx.commit();
        } catch ( Exception e ) {
            tx.rollback();
        }
        session.close();
    }

}
