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
public class DiseaseCatalog {
   
    private ArrayList<Disease> diseaseCatalog;

    public DiseaseCatalog() {
        diseaseCatalog = new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseCatalog() {
        return diseaseCatalog;
    }

           
    public Disease addDisease(){
        Disease disease = new Disease();
        diseaseCatalog.add(disease);
        return disease;
    }
}
