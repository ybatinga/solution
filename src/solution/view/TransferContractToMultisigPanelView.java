/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import solution.control.RegistryServiceControl;
import solution.model.GetRawTransactionModel;

/**
 *
 * @author ssd
 */
public class TransferContractToMultisigPanelView extends javax.swing.JPanel {
    private String multisigAddress;
    
    /**
     * Creates new form TransferContractToMultisigPanelView
     */
    public TransferContractToMultisigPanelView(String multisigAddress) {
        initComponents();
        this.multisigAddress = multisigAddress;
        transactionIdOfTransferredContractTextField.setVisible(false);
        multisigAddressTextField.setText(multisigAddress);
        
        
//        interface code
//        shareContractTransactionId = (ShareContractTransactionId) registerContractPanelView;
    }

//        interface code
//    public static interface ShareContractTransactionId {
//        
//        public String onRegisterContractGetTransactionId(); 
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transferContractToMultisigAddressLable = new javax.swing.JLabel();
        contractTransactionIdLabel = new javax.swing.JLabel();
        contractTransactionIdTextField = new java.awt.TextField();
        transferContractToMultisigButton = new javax.swing.JButton();
        multisigAddressLabel = new javax.swing.JLabel();
        multisigAddressTextField = new java.awt.TextField();
        transactionIdOfTransferredContractLabel = new javax.swing.JLabel();
        transactionIdOfTransferredContractTextField = new java.awt.TextField();

        transferContractToMultisigAddressLable.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        transferContractToMultisigAddressLable.setText("Transfer Contract to Multisig Address");

        contractTransactionIdLabel.setText("Contract Transaction ID:");

        contractTransactionIdTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        transferContractToMultisigButton.setText("Transfer");
        transferContractToMultisigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferContractToMultisigButtonActionPerformed(evt);
            }
        });

        multisigAddressLabel.setText("Multisig Address:");

        multisigAddressTextField.setEditable(false);

        transactionIdOfTransferredContractLabel.setText("Transaction ID of Transferred Contract:");

        transactionIdOfTransferredContractTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transferContractToMultisigAddressLable)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contractTransactionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contractTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(transferContractToMultisigButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multisigAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multisigAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transactionIdOfTransferredContractLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionIdOfTransferredContractTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transferContractToMultisigAddressLable)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contractTransactionIdLabel)
                    .addComponent(contractTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multisigAddressLabel)
                    .addComponent(multisigAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(transferContractToMultisigButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transactionIdOfTransferredContractLabel)
                    .addComponent(transactionIdOfTransferredContractTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transferContractToMultisigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferContractToMultisigButtonActionPerformed
        long vout = -1;
        GetRawTransactionModel getRawTransactionModel = RegistryServiceControl.getRawTransaction(contractTransactionIdTextField.getText());
        if(getRawTransactionModel.getError() == null){
            vout = getRawTransactionModel.getResult().getVout().get(0).getN();
        }
        String rawTxHex = RegistryServiceControl.createRawTransaction(contractTransactionIdTextField.getText(), vout, multisigAddress);
        String txIdOfTransferredContractToMultisig = RegistryServiceControl.decodeRawTransaction(rawTxHex);// not used; just for reference
        String signedTx = RegistryServiceControl.signRawTransactionWithWallet(rawTxHex, "ord");
        String txIdOfTransferredContract = RegistryServiceControl.sendRawTransaction(signedTx, "ord");
        if (vout == -1){
            transactionIdOfTransferredContractTextField.setText("Invalid contranct transaction ID");
            transactionIdOfTransferredContractTextField.setVisible(true);
        }else {
            transactionIdOfTransferredContractTextField.setText(txIdOfTransferredContract);
            transactionIdOfTransferredContractTextField.setVisible(true);
        }
        
    }//GEN-LAST:event_transferContractToMultisigButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contractTransactionIdLabel;
    private java.awt.TextField contractTransactionIdTextField;
    private javax.swing.JLabel multisigAddressLabel;
    private java.awt.TextField multisigAddressTextField;
    private javax.swing.JLabel transactionIdOfTransferredContractLabel;
    private java.awt.TextField transactionIdOfTransferredContractTextField;
    private javax.swing.JLabel transferContractToMultisigAddressLable;
    private javax.swing.JButton transferContractToMultisigButton;
    // End of variables declaration//GEN-END:variables
}
