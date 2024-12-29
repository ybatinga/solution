/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import solution.control.RegistryServiceControl;
import solution.model.GetAddressInfoModel;
import solution.model.GetBlockModel;
import solution.model.GetRawTransactionModel;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class VerifyContractSignaturesPanel extends javax.swing.JPanel {

    /**
     * Creates new form VerifyContractSignaturesPanel
     */
    public VerifyContractSignaturesPanel() {
        initComponents();
        // get Buyer wallet address info
        GetAddressInfoModel getBuyerAddressInfoModel = RegistryServiceControl.getAddressInfo(StringsService.PLATFORM.getWALLET_NAME_BUYER(), StringsService.PLATFORM.getWALLET_ADDRESS_BUYER());
        // get Buyer's wallet address public key 
        String buyerWalletPublicKey = getBuyerAddressInfoModel.getResult().getPubkey();
        // get Owner wallet address info
        GetAddressInfoModel getOwnerAddressInfoModel = RegistryServiceControl.getAddressInfo(StringsService.PLATFORM.getWALLET_NAME_OWNER(), StringsService.PLATFORM.getWALLET_ADDRESS_OWNER());
        // get Owner's wallet address public key 
        String ownerWalletPublicKey = getOwnerAddressInfoModel.getResult().getPubkey();
        // show Buyer's wallet address public key on UI
        buyerWalletPublicKeyTextField.setText(buyerWalletPublicKey);
        // show Owner's wallet address public key on UI
        onwerWalletPublicKeyTextField.setText(ownerWalletPublicKey);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verifyContractSignaturesLabel = new javax.swing.JLabel();
        signaturesConfirmationMessageLabel = new javax.swing.JLabel();
        confirmationsLabel = new javax.swing.JLabel();
        confirmationsTextField = new java.awt.TextField();
        confirmationBlockNumberLabel = new javax.swing.JLabel();
        confirmationBlockNumberTextField = new java.awt.TextField();
        recipientAddressLabel = new javax.swing.JLabel();
        blockHashLabel = new javax.swing.JLabel();
        recipientAddressTextField = new java.awt.TextField();
        blockHashTextField = new java.awt.TextField();
        amountSentLabel = new javax.swing.JLabel();
        paymentConfirmationMessageTextField = new java.awt.TextField();
        amountSentTextField = new java.awt.TextField();
        txIdOfSignedContractSentToRegistryAddressLabel = new javax.swing.JLabel();
        timeStampLabel = new javax.swing.JLabel();
        txIdOfSignedContractSentToRegistryAddressTextField = new java.awt.TextField();
        timeStampTextField = new java.awt.TextField();
        verifyPaymentButton = new javax.swing.JButton();
        buyerWalletPublicKeyLabel = new javax.swing.JLabel();
        ownerWalletPublicKeyLabel = new javax.swing.JLabel();
        ownerBuyerSignatureHexLabel = new javax.swing.JLabel();
        ownerBuyerSignatureHexTextField = new java.awt.TextField();
        buyerWalletPublicKeyTextField = new java.awt.TextField();
        onwerWalletPublicKeyTextField = new java.awt.TextField();

        setBackground(new java.awt.Color(247, 247, 247));

        verifyContractSignaturesLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        verifyContractSignaturesLabel.setText("Verify Contract Signatures");

        signaturesConfirmationMessageLabel.setText("Signatures Confirmation Message:");

        confirmationsLabel.setText("Confirmations:");

        confirmationsTextField.setBackground(new java.awt.Color(248, 248, 248));
        confirmationsTextField.setEditable(false);

        confirmationBlockNumberLabel.setText("Confirmation Block Number:");

        confirmationBlockNumberTextField.setBackground(new java.awt.Color(248, 248, 248));
        confirmationBlockNumberTextField.setEditable(false);

        recipientAddressLabel.setText("Recipient Address:");

        blockHashLabel.setText("Block Hash:");

        recipientAddressTextField.setBackground(new java.awt.Color(248, 248, 248));

        blockHashTextField.setBackground(new java.awt.Color(248, 248, 248));
        blockHashTextField.setEditable(false);

        amountSentLabel.setText("Amount Sent:");

        paymentConfirmationMessageTextField.setBackground(new java.awt.Color(248, 248, 248));
        paymentConfirmationMessageTextField.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        amountSentTextField.setBackground(new java.awt.Color(248, 248, 248));
        amountSentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountSentTextFieldActionPerformed(evt);
            }
        });

        txIdOfSignedContractSentToRegistryAddressLabel.setText("Transaction ID of Signed Contract Sent to Registry Office Address:");

        timeStampLabel.setText("Timestamp:");

        timeStampTextField.setBackground(new java.awt.Color(248, 248, 248));
        timeStampTextField.setEditable(false);

        verifyPaymentButton.setText("Verify");
        verifyPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyPaymentButtonActionPerformed(evt);
            }
        });

        buyerWalletPublicKeyLabel.setText("Buyer Wallet Public Key:");

        ownerWalletPublicKeyLabel.setText("Owner Wallet Public Key:");

        ownerBuyerSignatureHexLabel.setText("Owner and Buyer Signature Hex:");

        ownerBuyerSignatureHexTextField.setBackground(new java.awt.Color(248, 248, 248));
        ownerBuyerSignatureHexTextField.setEditable(false);

        buyerWalletPublicKeyTextField.setBackground(new java.awt.Color(248, 248, 248));
        buyerWalletPublicKeyTextField.setEditable(false);

        onwerWalletPublicKeyTextField.setBackground(new java.awt.Color(248, 248, 248));
        onwerWalletPublicKeyTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ownerBuyerSignatureHexLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerBuyerSignatureHexTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verifyContractSignaturesLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txIdOfSignedContractSentToRegistryAddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txIdOfSignedContractSentToRegistryAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeStampLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeStampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(verifyPaymentButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(signaturesConfirmationMessageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paymentConfirmationMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmationsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmationsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmationBlockNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmationBlockNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(blockHashLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blockHashTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(recipientAddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recipientAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(amountSentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountSentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ownerWalletPublicKeyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onwerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buyerWalletPublicKeyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buyerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verifyContractSignaturesLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txIdOfSignedContractSentToRegistryAddressLabel)
                    .addComponent(txIdOfSignedContractSentToRegistryAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ownerWalletPublicKeyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onwerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyerWalletPublicKeyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(verifyPaymentButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signaturesConfirmationMessageLabel)
                    .addComponent(paymentConfirmationMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmationsLabel)
                    .addComponent(confirmationsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmationBlockNumberLabel)
                    .addComponent(confirmationBlockNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blockHashLabel)
                    .addComponent(blockHashTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeStampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeStampLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recipientAddressLabel)
                    .addComponent(recipientAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountSentLabel)
                    .addComponent(amountSentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerBuyerSignatureHexLabel)
                    .addComponent(ownerBuyerSignatureHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verifyPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyPaymentButtonActionPerformed
        // get Transaction ID of Signed Contract Sent to Registry Office Address from UI
        String txIdOfSignedContractSentToRegistry = txIdOfSignedContractSentToRegistryAddressTextField.getText();
        // get Buyer Wallet Public Key from UI
        String buyerWalletPublicKey = buyerWalletPublicKeyTextField.getText();
        // get Owner Wallet Public Key from UI
        String ownerWalletPublicKey = onwerWalletPublicKeyTextField.getText();
        // block info where the Transaction ID of Signed Contract Sent to Registry Office Address is registered
        GetBlockModel getBlockModel = RegistryServiceControl.searchTransactionInBlocks(txIdOfSignedContractSentToRegistry);
        // check if the Transaction ID of Signed Contract Sent to Registry Office Address is registered on a block
        if (getBlockModel != null){
            // get raw transaction info of the Transaction ID of Signed Contract Sent to Registry Office Address 
            GetRawTransactionModel getRawTransactionModel = RegistryServiceControl.getRawTransaction(txIdOfSignedContractSentToRegistry);
            // get signature hex of the Transaction ID of Signed Contract Sent to Registry Office Address 
            String ownerBuyerSignatureHex = getRawTransactionModel.getResult().getHex();
            // show signature hex on UI
            ownerBuyerSignatureHexTextField.setText(ownerBuyerSignatureHex);
            // verify if Owner and Buyer have signed the contract by verifying if the Buyer Wallet Public Key and the Owner Wallet Public Key 
            // are contained in the signature hex of the Transaction ID of Signed Contract Sent to Registry Office Address
            if (ownerBuyerSignatureHex.contains(ownerWalletPublicKey) && ownerBuyerSignatureHex.contains(buyerWalletPublicKey)){
                // show on UI current number of node confirmations the Bitcoin network
                confirmationsTextField.setText(Long.toString(getBlockModel.getConfirmations()));
                // show on UI the block numner that the Transaction ID of Signed Contract Sent to Registry Office Address is registered               
                confirmationBlockNumberTextField.setText(Long.toString(getBlockModel.getHeight()));
                // show on UI the block hash that the Transaction ID of Signed Contract Sent to Registry Office Address is registered               
                blockHashTextField.setText(getBlockModel.getHash());
                // get the timestamp of the Transaction ID of Signed Contract Sent to Registry Office Address
                String time = RegistryServiceControl.convertUnixEpochToUtcTime(getBlockModel.getTime());
                // show on UI the timestamp of the Transaction ID of Signed Contract Sent to Registry Office Address
                timeStampTextField.setText(time);
                // get the recient address, which is the REGISTRY OFFICE'S address
                String recipientAddress = getRawTransactionModel.getResult().getVout().get(0).getScriptPubKey().getAddress();
                // show on UI the recient address, which is the REGISTRY OFFICE'S address
                recipientAddressTextField.setText(recipientAddress);
                // get the amount sent 
                String amountSent = Double.toString(getRawTransactionModel.getResult().getVout().get(0).getValue());
                
                // convert notation value to double with decimal ponctuation
                double val = new BigDecimal(amountSent).doubleValue();
                amountSent = String.valueOf(val);
                double d = Double.parseDouble(amountSent);
                NumberFormat formatter = NumberFormat.getInstance(Locale.US);
                formatter = new DecimalFormat("###.#####");
                String formated = formatter.format(d);
                String amountSentDecimalValueWithPunkt = formated.replace(",", ".");
                
                // show on UI the amount sent
                amountSentTextField.setText(amountSentDecimalValueWithPunkt);
                // show on UI message "Contract Signing Confirmed"
                paymentConfirmationMessageTextField.setText(StringsService.payment_contract_signing_confirmed);

            }else{
                // show on UI message "Contract Signing NOT Confirmed"
                paymentConfirmationMessageTextField.setText(StringsService.payment_contract_signing_not_confirmed);
            }
        }else{
            // show on UI message "Contract Signing NOT Confirmed"
            paymentConfirmationMessageTextField.setText(StringsService.payment_contract_signing_not_confirmed);
        }
    }//GEN-LAST:event_verifyPaymentButtonActionPerformed

    private void amountSentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountSentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountSentTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountSentLabel;
    private java.awt.TextField amountSentTextField;
    private javax.swing.JLabel blockHashLabel;
    private java.awt.TextField blockHashTextField;
    private javax.swing.JLabel buyerWalletPublicKeyLabel;
    private java.awt.TextField buyerWalletPublicKeyTextField;
    private javax.swing.JLabel confirmationBlockNumberLabel;
    private java.awt.TextField confirmationBlockNumberTextField;
    private javax.swing.JLabel confirmationsLabel;
    private java.awt.TextField confirmationsTextField;
    private java.awt.TextField onwerWalletPublicKeyTextField;
    private javax.swing.JLabel ownerBuyerSignatureHexLabel;
    private java.awt.TextField ownerBuyerSignatureHexTextField;
    private javax.swing.JLabel ownerWalletPublicKeyLabel;
    private java.awt.TextField paymentConfirmationMessageTextField;
    private javax.swing.JLabel recipientAddressLabel;
    private java.awt.TextField recipientAddressTextField;
    private javax.swing.JLabel signaturesConfirmationMessageLabel;
    private javax.swing.JLabel timeStampLabel;
    private java.awt.TextField timeStampTextField;
    private javax.swing.JLabel txIdOfSignedContractSentToRegistryAddressLabel;
    private java.awt.TextField txIdOfSignedContractSentToRegistryAddressTextField;
    private javax.swing.JLabel verifyContractSignaturesLabel;
    private javax.swing.JButton verifyPaymentButton;
    // End of variables declaration//GEN-END:variables
}
