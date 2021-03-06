/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Housing;

import Business.Ecosystem;
import UserInterface.Housing.*;
import Business.Enterprise.Enterprise;
import Business.Organization.HousingOrganization;
import Business.Organization.Organization;
import Business.Organization.HousingOrganization;
import Business.Housing.HousingNames;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nupur
 */
public class AddHousing extends javax.swing.JPanel {

    /**
     * Creates new form AddHousing
     */
    JPanel userProcessContainer; HousingOrganization housingOrganization;Enterprise enterprise; Ecosystem business;
     AddHousing(JPanel userProcessContainer, HousingOrganization housingOrganization, Enterprise enterprise, Ecosystem business){
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.housingOrganization=housingOrganization;
        this.enterprise=enterprise;
        this.business=business;
    }

   

     public void populateHousingTable(){
           DefaultTableModel model = (DefaultTableModel) tblFood.getModel();

        model.setRowCount(0);
            for(HousingNames housingNames : housingOrganization.getHousingNamesDirectory().getHousingNames()){
            Object[] row = new Object[5];
            row[0] = housingNames;
            row[1] = housingNames.getPrice();
             row[2] = housingNames.getHousingType();
              row[3] = housingNames.getHousingID();
             row[4] = housingNames.getLocation();
               model.addRow(row);
        }
       } 
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtHousingName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHousingPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFood = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        housingCB = new javax.swing.JComboBox();
        txtHousingID = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();

        jLabel1.setText("Housing Name");

        jLabel2.setText("Housing Price");

        txtHousingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHousingPriceActionPerformed(evt);
            }
        });

        tblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Housing Name", "Housing Price", "Housing Type", "Housing ID", "Location"
            }
        ));
        jScrollPane1.setViewportView(tblFood);

        jButton1.setText("Add Housing");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Housing Type");

        jLabel4.setText("Housing ID");

        jLabel5.setText("Location");

        housingCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apartments 1bhk", "Apartments 2BHK", "Bunglow 2000sqft", "Bunglow1000sq ft", "Temporary" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHousingName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHousingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(housingCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHousingID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHousingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHousingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(housingCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHousingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        String housingName = txtHousingName.getText();
        float housingPrice = Float.parseFloat(txtHousingPrice.getText());
        String housingType = (String) housingCB.getSelectedItem();
        
        String housingID = txtHousingID.getText();
        String housingRoute = txtLocation.getText();
         JOptionPane.showMessageDialog(null, " Added successfully!");
        Organization org=null;
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof HousingOrganization){
                org=organization;
                break;
            }
        }

        if(org!=null){
            System.out.println(org);
            org.getHousingNamesDirectory().addHousing(housingName,housingID,housingRoute,housingType,housingPrice);

        }
        
        populateHousingTable();
        }
         catch(Exception e){
       JOptionPane.showMessageDialog(null,"Enter valid input");
       System.out.println(e);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtHousingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHousingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHousingPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox housingCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFood;
    private javax.swing.JTextField txtHousingID;
    private javax.swing.JTextField txtHousingName;
    private javax.swing.JTextField txtHousingPrice;
    private javax.swing.JTextField txtLocation;
    // End of variables declaration//GEN-END:variables
}
