/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class StateProviderEnterprise extends Enterprise{
     public StateProviderEnterprise(String name,String vacName,int quantity) {
        super(name, EnterpriseType.Provider,vacName,quantity);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}