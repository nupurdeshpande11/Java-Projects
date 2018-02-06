/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class HospitalEnterprise extends Enterprise{

    public HospitalEnterprise(String name,String vacName,int quantity) {
        super(name, EnterpriseType.Hospital,vacName,quantity);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
