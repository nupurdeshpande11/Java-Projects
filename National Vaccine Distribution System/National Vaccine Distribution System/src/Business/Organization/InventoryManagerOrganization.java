/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InventoryManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class InventoryManagerOrganization extends Organization {

    
    public InventoryManagerOrganization() {
        super(Organization.Type.InventoryManager.getValue());
    }

    @Override 
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roleList= new ArrayList<>();
       roleList.add(new InventoryManager());
       return roleList;
    }
    
}
