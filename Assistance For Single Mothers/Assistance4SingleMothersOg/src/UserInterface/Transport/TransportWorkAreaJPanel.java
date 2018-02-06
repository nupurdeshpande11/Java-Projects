/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Transport;

import UserInterface.Transport.*;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.JobWorkQueue.TransportWorkRequest;
import Business.JobWorkQueue.TrackerWorkRequest;
import Business.Organization.TransportOrganization;
import Business.Transport.TransportNames;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEHA
 */
public class TransportWorkAreaJPanel extends javax.swing.JPanel {
    /**
     * Creates new form TransportWorkAreaWorkJPanel
     */
   JPanel userProcessContainer; UserAccount account; TransportOrganization transportOrganization; Enterprise enterprise; Ecosystem business;

    public TransportWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, TransportOrganization transportOrganization, Enterprise enterprise, Ecosystem business) {
         initComponents();
    this.userProcessContainer=userProcessContainer;
    this.account=account;
    this.business=business;
    this.enterprise=enterprise;
    this.transportOrganization=transportOrganization;
    populateTransportResponseTable();
    }
      public void populateTransportResponseTable() {
        DefaultTableModel model = (DefaultTableModel) transportTable.getModel();

        model.setRowCount(0);

        for (TrackerWorkRequest request : transportOrganization.getJobWorkQueue().getTrackerWorkRequestList()) {
          
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getMotherName();
                row[2] = request.getJobSalary();
                row[3] = request.getSender().getEmployee().getName();
                row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[5] = request.getStatus();
                row[6] = ((TransportWorkRequest) request).getResult();
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

        btnProcess = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        transportTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnAddTransport = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnBUY = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTransport = new javax.swing.JTable();

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        transportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Name", "Salary", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(transportTable);

        btnAssign.setText("Assign To me ");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnAddTransport.setText("Add Transport");
        btnAddTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransportActionPerformed(evt);
            }
        });

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnBUY.setText("BUY");
        btnBUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUYActionPerformed(evt);
            }
        });

        tblTransport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TransportName", "TransportPrice", "Transport Type", "Transport ID", "Route"
            }
        ));
        jScrollPane4.setViewportView(tblTransport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcess)
                            .addComponent(btnAddTransport))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCheck)
                                .addGap(62, 62, 62)
                                .addComponent(btnBUY))
                            .addComponent(btnAssign))
                        .addGap(0, 251, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnAssign))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCheck)
                            .addComponent(btnBUY)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAddTransport)))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = transportTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row!");
            return;

        }

        TransportWorkRequest request = (TransportWorkRequest) transportTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ProcessTransportRequestJPanel processTransportRequestJPanel = new ProcessTransportRequestJPanel(userProcessContainer, request,business);
        userProcessContainer.add("processTransportRequestJPanel", processTransportRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = transportTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row!");
            return;
        }

        TrackerWorkRequest request = (TrackerWorkRequest) transportTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateTransportResponseTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnAddTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransportActionPerformed
        // TODO add your handling code here:
        AddTransport addTransport = new AddTransport(userProcessContainer, transportOrganization,enterprise,business);
        userProcessContainer.add("addTransportJPanel", addTransport);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddTransportActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        int selectedRow = transportTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row of request Table!");
            return;

        }
        TransportWorkRequest request = (TransportWorkRequest) transportTable.getValueAt(selectedRow, 0);

        DefaultTableModel model = (DefaultTableModel) tblTransport.getModel();
        model.setRowCount(0);
        for(TransportNames transportNames : transportOrganization.getTransportNamesDirectory().getTransportNames()){
            if(transportNames.getPrice()<=request.getJobSalary()){
                Object[] row = new Object[5];
                row[0] = transportNames;
                row[1] = transportNames.getPrice();
                row[2] = transportNames.getTransType();
                row[3] = transportNames.getTransID();
 row[4] = transportNames.getTransRoute();
                model.addRow(row);
            }
            else{
                JOptionPane.showMessageDialog(null,"None Available! Try another price range!Inform Tracker!");
                break;
            }

        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnBUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUYActionPerformed
        // TODO add your handling code here:
        int selectedRow = transportTable.getSelectedRow();
        TransportWorkRequest request = (TransportWorkRequest) transportTable.getValueAt(selectedRow, 0);
        BuyTransportJPanel processTransportRequestJPanel = new BuyTransportJPanel(userProcessContainer, transportOrganization,enterprise,request,business);
        userProcessContainer.add("BuyTransportJPanel", processTransportRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBUYActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTransport;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBUY;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblTransport;
    private javax.swing.JTable transportTable;
    // End of variables declaration//GEN-END:variables
}
