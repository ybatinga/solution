/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.util.List;
import solution.control.RegistryServiceControl;
import solution.model.GetRawTransactionModel;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class SendContractToMultisigPanelView extends javax.swing.JPanel {
    private String multisigAddress;
//    private OnSendContractToMultisigTextFieldInteraction onSendContractToMultisigTextFieldInteraction;
    /**
     * Creates new form SendContractToMultisigPanelView
     */
    public SendContractToMultisigPanelView(String multisigAddress, RegisterContractPanelView registerContractPanelView) {
        initComponents();
        // get Multisig address 
        this.multisigAddress = multisigAddress;
        // set Multisig address on UI
        multisigAddressTextField.setText(multisigAddress);
//        onSendContractToMultisigTextFieldInteraction = (OnSendContractToMultisigTextFieldInteraction) registerContractPanelView;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sentContractToMultisigAddressLabel = new javax.swing.JLabel();
        contractTransactionIdLabel = new javax.swing.JLabel();
        contractTransactionIdTextField = new java.awt.TextField();
        sendContractToMultisigButton = new javax.swing.JButton();
        multisigAddressLabel = new javax.swing.JLabel();
        multisigAddressTextField = new java.awt.TextField();
        txIdOfContractSentToMultisigLabel = new javax.swing.JLabel();
        txIdOfContractSentToMultisigTextField = new java.awt.TextField();

        setBackground(new java.awt.Color(247, 247, 247));

        sentContractToMultisigAddressLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        sentContractToMultisigAddressLabel.setText("Send Contract to Multisig");

        contractTransactionIdLabel.setText("Contract Transaction ID:");

        sendContractToMultisigButton.setText("Send");
        sendContractToMultisigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendContractToMultisigButtonActionPerformed(evt);
            }
        });

        multisigAddressLabel.setText("Multisig Address:");

        multisigAddressTextField.setBackground(new java.awt.Color(248, 248, 248));
        multisigAddressTextField.setEditable(false);

        txIdOfContractSentToMultisigLabel.setText("Transaction ID of Contract Sent to Multisig:");

        txIdOfContractSentToMultisigTextField.setBackground(new java.awt.Color(248, 248, 248));
        txIdOfContractSentToMultisigTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txIdOfContractSentToMultisigLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txIdOfContractSentToMultisigTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sentContractToMultisigAddressLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contractTransactionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contractTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sendContractToMultisigButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multisigAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multisigAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sentContractToMultisigAddressLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contractTransactionIdLabel)
                    .addComponent(contractTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multisigAddressLabel)
                    .addComponent(multisigAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(sendContractToMultisigButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txIdOfContractSentToMultisigLabel)
                    .addComponent(txIdOfContractSentToMultisigTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // on Butter pressed, send contract to Multisig
    private void sendContractToMultisigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendContractToMultisigButtonActionPerformed
                    
        long vout = -1;
        // get raw transaction info from Contract Transaction ID that the Registry Office created through Ordinals
        GetRawTransactionModel getRawTransactionModel = RegistryServiceControl.getRawTransaction(contractTransactionIdTextField.getText());
        // get vout from Contract Transaction ID that the Registry Office created through Ordinals if there is no error
        if(getRawTransactionModel.getError() == null){
            vout = getRawTransactionModel.getResult().getVout().get(0).getN();
        }
        // create raw transaction that sends 9000 sats or 0.00009 BTC (and the contract that is registered on the sat at position 0 among the 9000 sasts) to and get rawTxHex from created raw transaction
        String rawTxHex = RegistryServiceControl.createRawTransaction(contractTransactionIdTextField.getText(), vout, multisigAddress, 0.00009000);
        String txIdOfSentContractToMultisig = RegistryServiceControl.decodeRawTransaction(rawTxHex);// not used; just for reference
        // get signed transaction from Registry Office
        String signedTx = RegistryServiceControl.signRawTransactionWithWallet(rawTxHex, StringsService.wallet_name_ord);
        // get transaction ID of contract sent to Multisig 
        String txIdOfSentContract = RegistryServiceControl.sendRawTransaction(signedTx, StringsService.wallet_name_ord);
        
        // show error message on UI if sending contract to Multisig failed
        if (vout == -1){
            txIdOfContractSentToMultisigTextField.setText(StringsService.invalid_contract_transaction_ID);
        // show transaction ID of contract sent to Multisig on UI
        }else {
            txIdOfContractSentToMultisigTextField.setText(txIdOfSentContract);
            
            // generate 6 new blocks after sending contract inscription to multisig address
            List<String> blockHashList = RegistryServiceControl.generateToAddress(6);
        }
    }//GEN-LAST:event_sendContractToMultisigButtonActionPerformed

//    public interface OnSendContractToMultisigTextFieldInteraction {
//        // TODO: Update argument type and name
//        public String onSendContractToMultisigInteraction();
//
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contractTransactionIdLabel;
    private java.awt.TextField contractTransactionIdTextField;
    private javax.swing.JLabel multisigAddressLabel;
    private java.awt.TextField multisigAddressTextField;
    private javax.swing.JButton sendContractToMultisigButton;
    private javax.swing.JLabel sentContractToMultisigAddressLabel;
    private javax.swing.JLabel txIdOfContractSentToMultisigLabel;
    private java.awt.TextField txIdOfContractSentToMultisigTextField;
    // End of variables declaration//GEN-END:variables
}
