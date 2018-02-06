/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    private ArrayList<Enterprise> enterpriseList2;
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
       enterpriseList2 = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList2() {
        return enterpriseList2;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type,String vacName,int quantity){
        Enterprise enterprise = null;
         if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name,vacName,quantity);
           
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.CDC){
            enterprise = new CDCEnterprise(name,vacName,quantity);
           
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Provider){
            enterprise = new StateProviderEnterprise(name,vacName,quantity);
           
            enterpriseList.add(enterprise);
        }
       
        return enterprise;
    }
     /*public Enterprise addEnterprise(String name, int quantity,Enterprise ent){
     
        ent.setVacName(name);
        ent.setQuantity(quantity);
        enterpriseList2.add(ent);
        return ent;
    }*/
}
