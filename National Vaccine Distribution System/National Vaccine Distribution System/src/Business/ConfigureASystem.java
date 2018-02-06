package Business;

import Business.Catalog.Disease;
import Business.Catalog.Vaccine;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Catalog.VaccineCatalog;

/**
 *
 * @author nupur
 */
public class ConfigureASystem {

   
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        //VaccineCatalog vc = new VaccineCatalog();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Vaccine vaccine = system.getVaccineCatalog().addVaccine("Polio");
        Vaccine vaccine1 = system.getVaccineCatalog().addVaccine("Influenza");
        
        
        
        return system;
    }
    
}
