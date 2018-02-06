/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Catalog;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class VaccineCatalog {

 private ArrayList<Vaccine> vaccineList;

   
   public VaccineCatalog() {
        vaccineList = new ArrayList();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
     public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

 
    public Vaccine addVaccine(String name){
        Vaccine vaccine = new Vaccine();
        vaccine.setName(name);
        //vaccine.setQuantity(Integer.parseInt(quantity));
        vaccineList.add(vaccine);
        return vaccine;
    }
    /*public Vaccine createVaccine(String quantity){
        Vaccine vaccine1 = new Vaccine();
        vaccine1.setQuantity(quantity);
        vaccineCatalog.add(vaccine1);
        return vaccine1;
    }*/
}
