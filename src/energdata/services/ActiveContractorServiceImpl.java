/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.services;

import energdata.model.ActiveContractor;
import energdata.model.ActiveContractorDAO;
import energdata.model.ActiveContractorDOAImpl;
import java.util.List;

/**
 *
 * @author ALUCK
 */
public class ActiveContractorServiceImpl implements ActiveContractorService {

    private ActiveContractorDAO activeContractorDAO = new ActiveContractorDOAImpl();
    
    @Override
    public void addActiveContractor(ActiveContractor activeContractor) {
     activeContractorDAO.addActiveContractor(activeContractor);
    }

    @Override
    public List<ActiveContractor> listActiveContractor() {
        return activeContractorDAO.listActiveContractor();
    }

    @Override
    public void updateActiveContractor(ActiveContractor activeContractor) {
        activeContractorDAO.updateActiveContractor(activeContractor);
    }

    @Override
    public void deleteActiveContractor(Long id) {
        activeContractorDAO.deleteActiveContractor(id);
    }
    
}
