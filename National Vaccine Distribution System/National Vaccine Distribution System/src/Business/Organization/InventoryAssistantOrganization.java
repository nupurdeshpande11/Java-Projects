/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Role.InventoryAssistant;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author nupur
 */
public class InventoryAssistantOrganization extends Organization{

  
    public InventoryAssistantOrganization(){
       super(Organization.Type.InventoryAssistant.getValue());
    }

    

     @Override 
      public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roleList= new ArrayList<>();
       roleList.add(new InventoryAssistant());
       return roleList;
    }
}
