/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InventoryManager.InventoryManagerWorkAreaJPanel;
import Business.Catalog.VaccineCatalog;
/**
 *
 * @author nupur
 */
public class InventoryManager extends Role{
    //for(e : ed)
    //{ent.getName();
    //
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InventoryManagerWorkAreaJPanel(userProcessContainer, account, organization, enterprise,business);
    }

    

  
    
}
