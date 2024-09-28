/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import solution.control.RegistryServiceControl;
import solution.model.GetAddressInfoModel;
import solution.model.ListUnspentModel;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class SendPaymentFromBuyerToOwnerPanel extends javax.swing.JPanel {
    private String walletOwnerAddress;
    /**
     * Creates new form sendPaymentFromBuyerToOwnerPanel
     */
    public SendPaymentFromBuyerToOwnerPanel() {
        initComponents();
        double paymentAmount = StringsService.paymentAmount;
        paymentAmountTextField.setText(Double.toString(paymentAmount)); 
        walletOwnerAddress = StringsService.PLATFORM.getWALLET_ADDRESS_OWNER();
        walletOwnerAddressTextField.setText(walletOwnerAddress);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendPaymentLabel = new javax.swing.JLabel();
        walletOwnerAddressLabel = new javax.swing.JLabel();
        walletOwnerAddressTextField = new java.awt.TextField();
        paymentAmountLabel = new javax.swing.JLabel();
        paymentAmountTextField = new java.awt.TextField();
        sendPaymentButton = new javax.swing.JButton();
        transactionIdOfPaymentSentToOwnerAddressLabel = new javax.swing.JLabel();
        transactionIdOfPaymentSentToOwnerAddressTextField = new java.awt.TextField();

        sendPaymentLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        sendPaymentLabel.setText("Send Payment");

        walletOwnerAddressLabel.setText("Owner Wallet Address:");

        walletOwnerAddressTextField.setBackground(new java.awt.Color(242, 242, 242));
        walletOwnerAddressTextField.setEditable(false);

        paymentAmountLabel.setText("Payment Amount:");

        paymentAmountTextField.setBackground(new java.awt.Color(242, 242, 242));
        paymentAmountTextField.setEditable(false);

        sendPaymentButton.setText("Send Payment");
        sendPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPaymentButtonActionPerformed(evt);
            }
        });

        transactionIdOfPaymentSentToOwnerAddressLabel.setText("Transaction ID of Payment Sent to Owner Address:");

        transactionIdOfPaymentSentToOwnerAddressTextField.setBackground(new java.awt.Color(242, 242, 242));
        transactionIdOfPaymentSentToOwnerAddressTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(walletOwnerAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(walletOwnerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sendPaymentLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paymentAmountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sendPaymentButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transactionIdOfPaymentSentToOwnerAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionIdOfPaymentSentToOwnerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendPaymentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(walletOwnerAddressLabel)
                    .addComponent(walletOwnerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentAmountLabel)
                    .addComponent(paymentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sendPaymentButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transactionIdOfPaymentSentToOwnerAddressLabel)
                    .addComponent(transactionIdOfPaymentSentToOwnerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPaymentButtonActionPerformed
        
        String paymentRawTransactionHex = null;
        
        String walletBuyerAddress = StringsService.PLATFORM.getWALLET_ADDRESS_BUYER();

        BigDecimal minimumAmount = new BigDecimal(paymentAmountTextField.getText()).setScale(5, RoundingMode.DOWN);
        BigDecimal minimumAmountConsideringTxFee = minimumAmount.add(new BigDecimal(Double.toString(StringsService.transactionFee)).setScale(5, RoundingMode.DOWN));
        
        List<ListUnspentModel>  listUnspentModelList = RegistryServiceControl.listUnspent(
            StringsService.PLATFORM.getWALLET_NAME_BUYER(),
            walletBuyerAddress,
            minimumAmountConsideringTxFee.doubleValue());

        if (listUnspentModelList.isEmpty()) {
            transactionIdOfPaymentSentToOwnerAddressTextField.setText("It cannot create paymento transaction because listUnspent list is empty");
            //            paymentRawTransactionHexTextField.setVisible(true);
        } else {

            String txId = listUnspentModelList.get(0).getTxid();
            long vout = listUnspentModelList.get(0).getVout();
            BigDecimal amount = BigDecimal.valueOf(listUnspentModelList.get(0).getAmount());
            BigDecimal paymentAmount = BigDecimal.valueOf(Double.parseDouble(paymentAmountTextField.getText()));
            BigDecimal change = amount.subtract(paymentAmount);
            BigDecimal changeMinusTxFee = change.subtract(new BigDecimal(StringsService.transactionFee).setScale(5, RoundingMode.DOWN)); // sutract 0.00001 BTC so that this to 0.00001 BTC amount is used to pay for transaction fee

            paymentRawTransactionHex = RegistryServiceControl.createRawTransactionWithChangeAddress(
                txId,
                vout,
                walletOwnerAddress,
                Double.parseDouble(paymentAmount.toString()),
                walletBuyerAddress,
                Double.parseDouble(changeMinusTxFee.toString()));
            
            String signedTx = RegistryServiceControl.signRawTransactionWithWallet(paymentRawTransactionHex, StringsService.PLATFORM.getWALLET_NAME_BUYER());

            String txIdOfPaymentSentToOwnerAddress = RegistryServiceControl.sendRawTransaction(
                signedTx,
                StringsService.PLATFORM.getWALLET_NAME_BUYER());
            transactionIdOfPaymentSentToOwnerAddressTextField.setText(txIdOfPaymentSentToOwnerAddress);

            // generate 6 new blocks after sending payment
            List<String> blockHashList = RegistryServiceControl.generateToAddress(6);            
        }
        
    }//GEN-LAST:event_sendPaymentButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel paymentAmountLabel;
    private java.awt.TextField paymentAmountTextField;
    private javax.swing.JButton sendPaymentButton;
    private javax.swing.JLabel sendPaymentLabel;
    private javax.swing.JLabel transactionIdOfPaymentSentToOwnerAddressLabel;
    private java.awt.TextField transactionIdOfPaymentSentToOwnerAddressTextField;
    private javax.swing.JLabel walletOwnerAddressLabel;
    private java.awt.TextField walletOwnerAddressTextField;
    // End of variables declaration//GEN-END:variables
}
