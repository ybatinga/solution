/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.util.List;
import solution.control.RegistryServiceControl;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class SendSignedContractToRegistryPanel extends javax.swing.JPanel {

    /**
     * Creates new form SendContractToRegistryOfficePanel
     */
    public SendSignedContractToRegistryPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendSignedContractToRegistryOfficeLabel = new javax.swing.JLabel();
        ownerBuyerSignatureHexLabel = new javax.swing.JLabel();
        sendSignedContractButton = new javax.swing.JButton();
        txIdOfSignedContractSentToRegistryAddressLabel = new javax.swing.JLabel();
        txIdOfSignedContractSentToRegistryAddressTextField = new java.awt.TextField();
        ownerBuyerSignatureHexTextField = new java.awt.TextField();

        sendSignedContractToRegistryOfficeLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        sendSignedContractToRegistryOfficeLabel.setText("Send Signed Contract to Registry");

        ownerBuyerSignatureHexLabel.setText("Owner and Buyer Signature Hex:");

        sendSignedContractButton.setText("Send");
        sendSignedContractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendSignedContractButtonActionPerformed(evt);
            }
        });

        txIdOfSignedContractSentToRegistryAddressLabel.setText("Transaction ID of Signed Contract Sent to Registry Office Address:");

        txIdOfSignedContractSentToRegistryAddressTextField.setBackground(new java.awt.Color(242, 242, 242));
        txIdOfSignedContractSentToRegistryAddressTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ownerBuyerSignatureHexLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerBuyerSignatureHexTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sendSignedContractToRegistryOfficeLabel)
                    .addComponent(sendSignedContractButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txIdOfSignedContractSentToRegistryAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txIdOfSignedContractSentToRegistryAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendSignedContractToRegistryOfficeLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerBuyerSignatureHexLabel)
                    .addComponent(ownerBuyerSignatureHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(sendSignedContractButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txIdOfSignedContractSentToRegistryAddressLabel)
                    .addComponent(txIdOfSignedContractSentToRegistryAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendSignedContractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendSignedContractButtonActionPerformed
        
        String ownerBuyerSignatureHex = ownerBuyerSignatureHexTextField.getText();
        String txIdOfSignedContractSentToRegistryAddress = RegistryServiceControl.sendRawTransaction(ownerBuyerSignatureHex, StringsService.wallet_name_ord_notary);
        txIdOfSignedContractSentToRegistryAddressTextField.setText(txIdOfSignedContractSentToRegistryAddress);
        
        // generate 6 new blocks after sending signed contract inscription to registry office's address
        List<String> blockHashList = RegistryServiceControl.generateToAddress(6);
    }//GEN-LAST:event_sendSignedContractButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ownerBuyerSignatureHexLabel;
    private java.awt.TextField ownerBuyerSignatureHexTextField;
    private javax.swing.JButton sendSignedContractButton;
    private javax.swing.JLabel sendSignedContractToRegistryOfficeLabel;
    private javax.swing.JLabel txIdOfSignedContractSentToRegistryAddressLabel;
    private java.awt.TextField txIdOfSignedContractSentToRegistryAddressTextField;
    // End of variables declaration//GEN-END:variables
}
