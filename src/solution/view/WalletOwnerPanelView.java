/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import solution.control.RegistryServiceControl;
import solution.model.GetAddressInfoModel;

/**
 *
 * @author ssd
 */
public class WalletOwnerPanelView extends javax.swing.JPanel {
    private GetAddressInfoModel getAddressInfoModel;
    /**
     * Creates new form WalletBuyerPanelView
     */
    public WalletOwnerPanelView() {
        initComponents();
        walletAddressTextField.setVisible(false);
        walletPrivateKeyTextField.setVisible(false);
        walletPublicKeyTextField.setVisible(false);
        
        getAddressInfoModel = RegistryServiceControl.getAddressInfo("legacy_owner", "mq2ujk9tzw2EVr111GMxb2uekHqhwG5LiF");
        if(getAddressInfoModel != null){
            walletAddressTextField.setText(getAddressInfoModel.getResult().getAddress());
            walletAddressTextField.setVisible(true);
            walletPublicKeyTextField.setText(getAddressInfoModel.getResult().getPubkey());
            walletPublicKeyTextField.setVisible(true);
        }
        
        String privateKey = RegistryServiceControl.dumpPrivKey("legacy_owner", "mq2ujk9tzw2EVr111GMxb2uekHqhwG5LiF");
        if(privateKey != null){
            walletPrivateKeyTextField.setText(privateKey);
            walletPrivateKeyTextField.setVisible(true);
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

        buyerWalletLabel = new javax.swing.JLabel();
        walletAddressLabel = new javax.swing.JLabel();
        walletAddressTextField = new java.awt.TextField();
        walletPublicKeyLabel = new javax.swing.JLabel();
        walletPublicKeyTextField = new java.awt.TextField();
        walletPrivateKeyLabel = new javax.swing.JLabel();
        walletPrivateKeyTextField = new java.awt.TextField();

        buyerWalletLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        buyerWalletLabel.setText("Owner Wallet");

        walletAddressLabel.setText("Address:");

        walletAddressTextField.setEditable(false);
        walletAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletAddressTextFieldActionPerformed(evt);
            }
        });

        walletPublicKeyLabel.setText("Public Key:");

        walletPublicKeyTextField.setEditable(false);
        walletPublicKeyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletPublicKeyTextFieldActionPerformed(evt);
            }
        });

        walletPrivateKeyLabel.setText("Private Key:");

        walletPrivateKeyTextField.setEditable(false);

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
                        .addComponent(walletPrivateKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
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
                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void walletPublicKeyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletPublicKeyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_walletPublicKeyTextFieldActionPerformed

    private void walletAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_walletAddressTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buyerWalletLabel;
    private javax.swing.JLabel walletAddressLabel;
    private java.awt.TextField walletAddressTextField;
    private javax.swing.JLabel walletPrivateKeyLabel;
    private java.awt.TextField walletPrivateKeyTextField;
    private javax.swing.JLabel walletPublicKeyLabel;
    private java.awt.TextField walletPublicKeyTextField;
    // End of variables declaration//GEN-END:variables

    public GetAddressInfoModel getGetAddressInfoModel() {
        return getAddressInfoModel;
    }

    public void setGetAddressInfoModel(GetAddressInfoModel getAddressInfoModel) {
        this.getAddressInfoModel = getAddressInfoModel;
    }
}
