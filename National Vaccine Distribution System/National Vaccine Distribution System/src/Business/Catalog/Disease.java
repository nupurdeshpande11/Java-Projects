/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Catalog;

/**
 *
 * @author nupur
 */
public class Disease {
    private String name;
    private Vaccine vaccine; //Every Disease has a vaccine

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    @Override
    public String toString(){
        return name;
    }
    
}
