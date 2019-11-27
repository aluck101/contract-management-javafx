/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.services;

import energdata.model.ActiveContractor;
import java.util.List;

/**
 *
 * @author ALUCK
 */
public interface ActiveContractorService {

    public void addActiveContractor(ActiveContractor activeContractor);

    public List<ActiveContractor> listActiveContractor();

    public void updateActiveContractor(ActiveContractor activeContractor);

    public void deleteActiveContractor(Long id);
}
