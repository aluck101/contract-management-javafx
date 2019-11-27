/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.util;

import energdata.model.ActiveContractor;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager; 
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javafx.collections.ObservableList;
        
        /**
         *
         * @author ALUCK
         */


public class DBUtil {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    private static EntityManager getEntityManager() {
        if (em == null) {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("EnergDataPU");
                em = emf.createEntityManager();
            } else {
                em = emf.createEntityManager();
            }
        }
        return em;

    }
    
    public static ObservableList<ActiveContractor> getActiveContractor() {
        EntityManager entityManager = getEntityManager();
        TypedQuery<ActiveContractor> query = entityManager.createQuery("SELECT a FROM ActiveContractor a ORDER BY a.id", ActiveContractor.class);
        ObservableList<ActiveContractor> list = (ObservableList<ActiveContractor>) query.getResultList();
        return list;
    }

 /**   public static List<Contractor> getAllContractor() {
        EntityManager entityManager = getEntityManager();
        TypedQuery<Contractor> query = entityManager.createQuery("SELECT c FROM Contractor c ORDER BY c.companyId", Contractor.class);
        List<Contractor> list = query.getResultList();       
        return list;
    }
 **/

    
}
