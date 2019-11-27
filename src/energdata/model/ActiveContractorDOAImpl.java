/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.model;

import java.util.ArrayList;
import java.util.List;
import energdata.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author ALUCK
 */
public class ActiveContractorDOAImpl implements ActiveContractorDAO {

    @Override
    public void addActiveContractor(ActiveContractor activeContractor) {
        Session s = HibernateUtil.openSession();
        s.beginTransaction();
        s.save(activeContractor);
        s.getTransaction().commit();
        s.close();

    }

    @Override
    public List<ActiveContractor> listActiveContractor() {
        List list = new ArrayList<>();
        Session s = HibernateUtil.openSession();
        s.beginTransaction();
        list = s.createQuery("from ActiveContractor").list();
        s.getTransaction().commit();
        s.close();
        return list;
    }

    @Override
    public void deleteActiveContractor(Long id) {
        Session s = HibernateUtil.openSession();
        s.beginTransaction();
        ActiveContractor a = (ActiveContractor) s.load(ActiveContractor.class, id);
        s.delete(a);
        s.getTransaction().commit();
        s.close();

    }

    @Override
    public void updateActiveContractor(ActiveContractor activeContractor) {
        Session s = HibernateUtil.openSession();
        s.beginTransaction();
        s.update(activeContractor);
        s.getTransaction().commit();
        s.close();
    }
}


