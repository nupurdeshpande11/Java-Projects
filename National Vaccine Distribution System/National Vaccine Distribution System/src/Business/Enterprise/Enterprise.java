/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Catalog.Vaccine;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author nupur
 */
public abstract class Enterprise extends Organization{
     
        
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private WorkQueue workQueue;
    String vacName;
     int quantity;        
    public Enterprise(String name, EnterpriseType type,String vacName,int quantity) {
        super(name);
        this.enterpriseType = type;
        this.vacName=vacName;
        this.quantity=quantity;
        organizationDirectory = new OrganizationDirectory();
        workQueue = new WorkQueue();
       
    }

    public String getVacName() {
        return vacName;
    }

    public void setVacName(String vacName) {
        this.vacName = vacName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),Finanace("Finanace"),Provider("Provider"),CDC("CDC");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
