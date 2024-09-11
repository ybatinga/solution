/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import solution.control.RegistryServiceControl;
import solution.model.CreateMultisigModel;
import solution.model.GetAddressInfoModel;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class CreateMultisigAddressPanel extends javax.swing.JPanel {

    private String walletBuyerPublicKey;
    private String walletOwnerPublicKey;
    private CreateMultisigModel createMultisigModel;
    /**
     * Creates new form CreateMultisigAddressPanel
     */
    public CreateMultisigAddressPanel() {
        initComponents();
        GetAddressInfoModel getBuyerAddressInfoModel = RegistryServiceControl.getAddressInfo("legacy_buyer", StringsService.PLATFORM.getWALLET_ADDRESS_BUYER());
        walletBuyerPublicKey = getBuyerAddressInfoModel.getResult().getPubkey();
        GetAddressInfoModel getOwnerAddressInfoModel = RegistryServiceControl.getAddressInfo("legacy_owner", StringsService.PLATFORM.getWALLET_ADDRESS_OWNER());
        walletOwnerPublicKey = getOwnerAddressInfoModel.getResult().getPubkey();
        buyerWalletPublicKeyTextField.setVisible(false);
        multisigAddressTextField.setVisible(false);   
        ownerWalletPublicKeyTextField.setVisible(false);
        redeemScriptTextField.setVisible(false);
        
        if(walletBuyerPublicKey != null){
            buyerWalletPublicKeyTextField.setVisible(true);
            buyerWalletPublicKeyTextField.setText(walletBuyerPublicKey);
        }
        
        if(walletOwnerPublicKey != null){
            ownerWalletPublicKeyTextField.setVisible(true);
            ownerWalletPublicKeyTextField.setText(walletOwnerPublicKey);
        }
        
        createMultisigModel = RegistryServiceControl.createMultisigAddress(
                walletBuyerPublicKey, 
                walletOwnerPublicKey);
        
        if(createMultisigModel != null){
            multisigAddressTextField.setVisible(true);   
            redeemScriptTextField.setVisible(true);
            
            multisigAddressTextField.setText(createMultisigModel.getAddress());
            redeemScriptTextField.setText(createMultisigModel.getRedeemScript());
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

        createMultisigAddressLabel = new javax.swing.JLabel();
        buyerWalletPublicKeyLabel = new javax.swing.JLabel();
        ownerWalletPublicKeyLabel = new javax.swing.JLabel();
        createMultisigAddressButton = new javax.swing.JButton();
        buyerWalletPublicKeyTextField = new java.awt.TextField();
        ownerWalletPublicKeyTextField = new java.awt.TextField();
        multisigAddressLabel = new javax.swing.JLabel();
        redeemScriptLabel = new javax.swing.JLabel();
        multisigAddressTextField = new java.awt.TextField();
        redeemScriptTextField = new java.awt.TextField();

        createMultisigAddressLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        createMultisigAddressLabel.setText("Create Multisig Address");

        buyerWalletPublicKeyLabel.setText("Buyer Wallet Public Key:");

        ownerWalletPublicKeyLabel.setText("Owner Wallet Public Key:");

        createMultisigAddressButton.setText("Create");
        createMultisigAddressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMultisigAddressButtonActionPerformed(evt);
            }
        });

        buyerWalletPublicKeyTextField.setBackground(new java.awt.Color(242, 242, 242));
        buyerWalletPublicKeyTextField.setEditable(false);

        ownerWalletPublicKeyTextField.setBackground(new java.awt.Color(242, 242, 242));
        ownerWalletPublicKeyTextField.setEditable(false);

        multisigAddressLabel.setText("Multisig Address:");

        redeemScriptLabel.setText("Redeem Script:");

        multisigAddressTextField.setBackground(new java.awt.Color(242, 242, 242));
        multisigAddressTextField.setEditable(false);

        redeemScriptTextField.setBackground(new java.awt.Color(242, 242, 242));
        redeemScriptTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createMultisigAddressLabel)
                    .addComponent(createMultisigAddressButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buyerWalletPublicKeyLabel)
                            .addComponent(ownerWalletPublicKeyLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ownerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(redeemScriptLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redeemScriptTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(multisigAddressLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(multisigAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createMultisigAddressLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buyerWalletPublicKeyLabel)
                    .addComponent(buyerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerWalletPublicKeyLabel)
                    .addComponent(ownerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createMultisigAddressButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multisigAddressLabel)
                    .addComponent(multisigAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redeemScriptLabel)
                    .addComponent(redeemScriptTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createMultisigAddressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMultisigAddressButtonActionPerformed
        createMultisigModel = RegistryServiceControl.createMultisigAddress(
                walletBuyerPublicKey, 
                walletOwnerPublicKey);
        
        if(createMultisigModel != null){
            multisigAddressTextField.setVisible(true);   
            redeemScriptTextField.setVisible(true);
            
            multisigAddressTextField.setText(createMultisigModel.getAddress());
            redeemScriptTextField.setText(createMultisigModel.getRedeemScript());
        }
        
    }//GEN-LAST:event_createMultisigAddressButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buyerWalletPublicKeyLabel;
    private java.awt.TextField buyerWalletPublicKeyTextField;
    private javax.swing.JButton createMultisigAddressButton;
    private javax.swing.JLabel createMultisigAddressLabel;
    private javax.swing.JLabel multisigAddressLabel;
    private java.awt.TextField multisigAddressTextField;
    private javax.swing.JLabel ownerWalletPublicKeyLabel;
    private java.awt.TextField ownerWalletPublicKeyTextField;
    private javax.swing.JLabel redeemScriptLabel;
    private java.awt.TextField redeemScriptTextField;
    // End of variables declaration//GEN-END:variables

    public CreateMultisigModel getCreateMultisigModel() {
        return createMultisigModel;
    }
}
