/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManager;

import Business.Catalog.Vaccine;
import Business.EcoSystem;
import Business.Enterprise.CDCEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.StateProviderEnterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nupur
 */
public class Update extends javax.swing.JPanel {

    /**
     * Creates new form Update
     */
    JPanel userProcessContainer; EcoSystem business;Vaccine v;Enterprise enterprise;
    Update(JPanel userProcessContainer, EcoSystem business,Vaccine v,Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer= userProcessContainer;
        this.business= business;
        this.v=v;
        this.enterprise=enterprise;
        txtVaccine.setText(v.getName());
        //txtQuantity.setText(String.valueOf(v.getQuantity()));
     
    }
    public void  populateEntVacTable(){
            
         DefaultTableModel model = (DefaultTableModel) tblEntVac.getModel();

        model.setRowCount(0);
         for(Network net: business.getNetworkList()){
          for(Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
              if(ent.getName().equals(enterprise.getName())){
                  Object[] row = new Object[3];
                  row[0]=ent.getName();
                 row[1] = ent.getVacName();
                 row[2] = ent.getQuantity();
                 model.addRow(row);
              }}}}
        
             
          
             
            
          
       
    
    
    
         
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtVaccine = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEntVac = new javax.swing.JTable();

        jLabel1.setText("Vaccine");

        jLabel2.setText("Quantity");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblEntVac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Vaccines", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEntVac);
        if (tblEntVac.getColumnModel().getColumnCount() > 0) {
            tblEntVac.getColumnModel().getColumn(0).setResizable(false);
            tblEntVac.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack)
                        .addGap(42, 42, 42)
                        .addComponent(btnUpdate)))
                .addGap(159, 169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnBack))
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
      
      String name = enterprise.getName();
      String vacname = txtVaccine.getText();
      int q  = Integer.parseInt(txtQuantity.getText());
      
       
     for(Network net: business.getNetworkList()){
          for(Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
             
                 if(ent.equals(enterprise) && ent instanceof HospitalEnterprise){
     net.getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Hospital, vacname, q);
       populateEntVacTable();
    break;
         
                 }
                 else if(ent.equals(enterprise) && ent instanceof CDCEnterprise){
     net.getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.CDC, vacname, q);
       populateEntVacTable();
    break;
         
                 }
                 else if(ent.equals(enterprise) && ent instanceof StateProviderEnterprise){
     net.getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Provider, vacname, q);
       populateEntVacTable();
    break;
         
                 }
          
          
          }}
   
      
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:'
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        GiveVaccineNames gvn = (GiveVaccineNames)component;
        gvn. populateVacTable();
        gvn.populateEntVacTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEntVac;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtVaccine;
    // End of variables declaration//GEN-END:variables
}
