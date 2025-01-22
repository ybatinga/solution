/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import solution.control.RegistryServiceControl;
import solution.model.GetAddressInfoModel;
import solution.model.GetRawTransactionModel;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class OwnerSignerPanelView extends javax.swing.JPanel {
    /**
     * Creates new form WalletBuyerPanelView
     */
    public OwnerSignerPanelView(String redeemScript) {
        initComponents();
        // get address info
        GetAddressInfoModel getAddressInfoModel = RegistryServiceControl.getAddressInfo(StringsService.PLATFORM.getWALLET_NAME_OWNER(), StringsService.PLATFORM.getWALLET_ADDRESS_OWNER());
        if(getAddressInfoModel != null){
            // get wallet address and inform on UI
            walletAddressTextField.setText(getAddressInfoModel.getResult().getAddress());
            // get public key and inform on UI
            walletPublicKeyTextField.setText(getAddressInfoModel.getResult().getPubkey());
        }
        // get private key 
        String privateKey = RegistryServiceControl.dumpPrivKey(StringsService.PLATFORM.getWALLET_NAME_OWNER(), StringsService.PLATFORM.getWALLET_ADDRESS_OWNER());
        if(privateKey != null){
            // inform private key on UI
            walletPrivateKeyTextField.setText(privateKey);
        }
        // inform redeem script on UI
        redeemScriptTextField.setText(redeemScript);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buyerWalletLabel = new javax.swing.JLabel();
        walletAddressLabel = new javax.swing.JLabel();
        walletAddressTextField = new java.awt.TextField();
        walletPublicKeyLabel = new javax.swing.JLabel();
        walletPublicKeyTextField = new java.awt.TextField();
        walletPrivateKeyLabel = new javax.swing.JLabel();
        walletPrivateKeyTextField = new java.awt.TextField();
        ownerSignatureHexTextField = new java.awt.TextField();
        redeemScriptLabel = new javax.swing.JLabel();
        redeemScriptTextField = new java.awt.TextField();
        multisigRawTransactionHexLabel = new javax.swing.JLabel();
        signContractButton = new javax.swing.JButton();
        ownerSignatureHexLabel = new javax.swing.JLabel();
        multisigRawTransactionHexTextField = new java.awt.TextField();

        setBackground(new java.awt.Color(247, 247, 247));

        buyerWalletLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        buyerWalletLabel.setText("Owner Signer");

        walletAddressLabel.setText("Owner Wallet Address:");

        walletAddressTextField.setBackground(new java.awt.Color(248, 248, 248));
        walletAddressTextField.setEditable(false);

        walletPublicKeyLabel.setText("Owner Wallet Address Public Key:");

        walletPublicKeyTextField.setBackground(new java.awt.Color(248, 248, 248));
        walletPublicKeyTextField.setEditable(false);

        walletPrivateKeyLabel.setText("Owner Wallet Address Private Key:");

        walletPrivateKeyTextField.setBackground(new java.awt.Color(248, 248, 248));
        walletPrivateKeyTextField.setEditable(false);

        ownerSignatureHexTextField.setBackground(new java.awt.Color(248, 248, 248));
        ownerSignatureHexTextField.setEditable(false);

        redeemScriptLabel.setText("Redeem Script:");

        redeemScriptTextField.setBackground(new java.awt.Color(248, 248, 248));
        redeemScriptTextField.setEditable(false);

        multisigRawTransactionHexLabel.setText("Multisig Raw Transaction Hex:");

        signContractButton.setText("Sign Contract ");
        signContractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signContractButtonActionPerformed(evt);
            }
        });

        ownerSignatureHexLabel.setText("Owner Signature Hex:");

        multisigRawTransactionHexTextField.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyerWalletLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(walletPublicKeyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(walletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(walletAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(walletAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(walletPrivateKeyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(walletPrivateKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(multisigRawTransactionHexLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(multisigRawTransactionHexTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(signContractButton)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ownerSignatureHexLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ownerSignatureHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(redeemScriptLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(redeemScriptTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buyerWalletLabel)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(walletAddressLabel)
                    .addComponent(walletAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(walletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(walletPublicKeyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(walletPrivateKeyLabel)
                    .addComponent(walletPrivateKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redeemScriptLabel)
                    .addComponent(redeemScriptTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multisigRawTransactionHexLabel)
                    .addComponent(multisigRawTransactionHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signContractButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerSignatureHexLabel)
                    .addComponent(ownerSignatureHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signContractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signContractButtonActionPerformed
        
        // GET ALL PARAMETERS TO signRawTransactionWithkKey
        // Multisig Raw Transaction Hex:
        String multisigRawTransactionHex = multisigRawTransactionHexTextField.getText();
        // Transaction ID of Contract Sent to Multisig:
        String transactionIdOfContractSentToMultisig = RegistryServiceControl.decodeRawTransaction(multisigRawTransactionHex);
        GetRawTransactionModel getRawTransactionModel = RegistryServiceControl.getRawTransaction(transactionIdOfContractSentToMultisig);
        // Vout of Transaction ID of Contract Sent to Multisig:
        long vout = getRawTransactionModel.getResult().getVout().get(0).getN();
        // Script that locked transaction:
        String scriptPubKeyOfContractSentToMultisig = getRawTransactionModel.getResult().getVout().get(0).getScriptPubKey().getHex();
        // Owner wallet private key:
        String walletOwnerPrivateKeyText = walletPrivateKeyTextField.getText();
        // Multisig Redeem Script 
        String redeemScript = redeemScriptTextField.getText();
        
        String ownerSignatureHex = RegistryServiceControl.signRawTransactionWithkKey(
                multisigRawTransactionHex, // Buyer Signature Hex
                walletOwnerPrivateKeyText, // Owner wallet private key
                transactionIdOfContractSentToMultisig, // Transaction ID of Contract Sent to Multisig
                vout, // Vout of Transaction ID of Contract Sent to Multisig
                scriptPubKeyOfContractSentToMultisig, // Script that locked transaction of Contract Sent to Multisig
                redeemScript // Multisig Redeem Script 
        );
        
        ownerSignatureHexTextField.setText(ownerSignatureHex);
    }//GEN-LAST:event_signContractButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buyerWalletLabel;
    private javax.swing.JLabel multisigRawTransactionHexLabel;
    private java.awt.TextField multisigRawTransactionHexTextField;
    private javax.swing.JLabel ownerSignatureHexLabel;
    private java.awt.TextField ownerSignatureHexTextField;
    private javax.swing.JLabel redeemScriptLabel;
    private java.awt.TextField redeemScriptTextField;
    private javax.swing.JButton signContractButton;
    private javax.swing.JLabel walletAddressLabel;
    private java.awt.TextField walletAddressTextField;
    private javax.swing.JLabel walletPrivateKeyLabel;
    private java.awt.TextField walletPrivateKeyTextField;
    private javax.swing.JLabel walletPublicKeyLabel;
    private java.awt.TextField walletPublicKeyTextField;
    // End of variables declaration//GEN-END:variables

}
