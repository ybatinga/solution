/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.util.List;
import solution.control.RegistryServiceControl;
import solution.model.GetBlockModel;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class VerifyTransactionsPanel extends javax.swing.JPanel {

    /**
     * Creates new form VerifyTransactions
     */
    public VerifyTransactionsPanel() {
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

        verifyPaymentTransactionLabel = new javax.swing.JLabel();
        paymentTransactionIdLabel = new javax.swing.JLabel();
        paymentTransactionIdTextField = new java.awt.TextField();
        verifyPaymentButton = new javax.swing.JButton();
        paymentConfirmationMessageLabel = new javax.swing.JLabel();
        confirmationsLabel = new javax.swing.JLabel();
        confirmationsTextField = new java.awt.TextField();
        confirmationBlockNumberLabel = new javax.swing.JLabel();
        confirmationBlockNumberTextField = new java.awt.TextField();
        blockHashLabel = new javax.swing.JLabel();
        blockHashTextField = new java.awt.TextField();
        paymentConfirmationMessageTextField = new java.awt.TextField();
        timeStampLabel = new javax.swing.JLabel();
        timeStampTextField = new java.awt.TextField();

        verifyPaymentTransactionLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        verifyPaymentTransactionLabel.setText("Verify Payment Transaction");

        paymentTransactionIdLabel.setText("Payment Transaction ID:");

        verifyPaymentButton.setText("Verify");
        verifyPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyPaymentButtonActionPerformed(evt);
            }
        });

        paymentConfirmationMessageLabel.setText("Payment Confirmation Message:");

        confirmationsLabel.setText("Confirmations:");

        confirmationsTextField.setBackground(new java.awt.Color(242, 242, 242));
        confirmationsTextField.setEditable(false);

        confirmationBlockNumberLabel.setText("Confirmation Block Number:");

        confirmationBlockNumberTextField.setBackground(new java.awt.Color(242, 242, 242));
        confirmationBlockNumberTextField.setEditable(false);

        blockHashLabel.setText("Block Hash:");

        blockHashTextField.setBackground(new java.awt.Color(242, 242, 242));
        blockHashTextField.setEditable(false);

        paymentConfirmationMessageTextField.setBackground(new java.awt.Color(242, 242, 242));
        paymentConfirmationMessageTextField.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        paymentConfirmationMessageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentConfirmationMessageTextFieldActionPerformed(evt);
            }
        });

        timeStampLabel.setText("Timestamp:");

        timeStampTextField.setBackground(new java.awt.Color(242, 242, 242));
        timeStampTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeStampLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeStampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(verifyPaymentTransactionLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paymentTransactionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(verifyPaymentButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paymentConfirmationMessageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentConfirmationMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmationsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmationsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmationBlockNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmationBlockNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(blockHashLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blockHashTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verifyPaymentTransactionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentTransactionIdLabel)
                    .addComponent(paymentTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verifyPaymentButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentConfirmationMessageLabel)
                    .addComponent(paymentConfirmationMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmationsLabel)
                    .addComponent(confirmationsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmationBlockNumberLabel)
                    .addComponent(confirmationBlockNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blockHashLabel)
                    .addComponent(blockHashTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeStampLabel)
                    .addComponent(timeStampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verifyPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyPaymentButtonActionPerformed
        // generate 1 new block to verify payment transaction confirmed on first generated block 
        List<String> blockHashList = RegistryServiceControl.generateToAddress(1);
        
        String getBestblockhash = RegistryServiceControl.getBlockchainInfo();
        GetBlockModel getBlockModel = RegistryServiceControl.getBlock(getBestblockhash, paymentTransactionIdTextField.getText());
        if (getBlockModel != null){
            paymentConfirmationMessageTextField.setText(StringsService.payment_has_been_confirmed_on_the_blockchain);
            confirmationsTextField.setText(Long.toString(getBlockModel.getConfirmations()));
            confirmationBlockNumberTextField.setText(Long.toString(getBlockModel.getHeight()));
            blockHashTextField.setText(getBestblockhash);
            String time = RegistryServiceControl.convertUnixEpochToUtcTime(getBlockModel.getTime());
            timeStampTextField.setText(time);
        }else{
            paymentConfirmationMessageTextField.setText(StringsService.payment_has_not_been_confirmed_on_the_blockchain);
        }
    }//GEN-LAST:event_verifyPaymentButtonActionPerformed

    private void paymentConfirmationMessageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentConfirmationMessageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentConfirmationMessageTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blockHashLabel;
    private java.awt.TextField blockHashTextField;
    private javax.swing.JLabel confirmationBlockNumberLabel;
    private java.awt.TextField confirmationBlockNumberTextField;
    private javax.swing.JLabel confirmationsLabel;
    private java.awt.TextField confirmationsTextField;
    private javax.swing.JLabel paymentConfirmationMessageLabel;
    private java.awt.TextField paymentConfirmationMessageTextField;
    private javax.swing.JLabel paymentTransactionIdLabel;
    private java.awt.TextField paymentTransactionIdTextField;
    private javax.swing.JLabel timeStampLabel;
    private java.awt.TextField timeStampTextField;
    private javax.swing.JButton verifyPaymentButton;
    private javax.swing.JLabel verifyPaymentTransactionLabel;
    // End of variables declaration//GEN-END:variables
}
