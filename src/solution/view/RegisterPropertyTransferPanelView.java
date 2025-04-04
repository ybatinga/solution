/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import solution.control.RegistryServiceControl;
import solution.model.GetBlockModel;
import solution.model.GetRawTransactionModel;
import solution.model.InscriptionModel;
import solution.model.OrdInscribedDataModel;
import solution.model.RegistryModel;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class RegisterPropertyTransferPanelView extends javax.swing.JPanel {

     /**
     * Creates new form TransferPropertyPanel
     */
    public RegisterPropertyTransferPanelView() {
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

        transferPropertyLabel = new javax.swing.JLabel();
        transferPropertyInscriptionIdTextField = new java.awt.TextField();
        transferPropertyInscriptionIdLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        transferPropertyTransactionIdTextField = new java.awt.TextField();
        transferPropertyTransactionIdLabel = new javax.swing.JLabel();
        propertyInscriptionIdLabel = new javax.swing.JLabel();
        propertyInscriptionIdTextField = new java.awt.TextField();
        contractInscriptionIdLabel = new javax.swing.JLabel();
        txIdOfSignedContractSentToRegistryAddressLabel = new javax.swing.JLabel();
        transactionIdOfPaymentSentToOwnerAddressLabel = new javax.swing.JLabel();
        contractInscriptionIdTextField = new java.awt.TextField();
        txIdOfSignedContractSentToRegistryAddressTextField = new java.awt.TextField();
        transactionIdOfPaymentSentToOwnerAddressTextField = new java.awt.TextField();

        setBackground(new java.awt.Color(247, 247, 247));

        transferPropertyLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        transferPropertyLabel.setText("Register Property Transfer");

        transferPropertyInscriptionIdTextField.setBackground(new java.awt.Color(248, 248, 248));
        transferPropertyInscriptionIdTextField.setEditable(false);

        transferPropertyInscriptionIdLabel.setText("Transfer Property Inscription ID: ");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        transferPropertyTransactionIdTextField.setBackground(new java.awt.Color(248, 248, 248));
        transferPropertyTransactionIdTextField.setEditable(false);

        transferPropertyTransactionIdLabel.setText("Transfer Property Transaction ID: ");

        propertyInscriptionIdLabel.setText("Property Inscription ID:");

        contractInscriptionIdLabel.setText("Contract Inscription ID: ");

        txIdOfSignedContractSentToRegistryAddressLabel.setText("Transaction ID of Signed Contract Sent to Registry Office Address:");

        transactionIdOfPaymentSentToOwnerAddressLabel.setText("Transaction ID of Payment Sent to Owner Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transferPropertyLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transferPropertyInscriptionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferPropertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transferPropertyTransactionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferPropertyTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transactionIdOfPaymentSentToOwnerAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionIdOfPaymentSentToOwnerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txIdOfSignedContractSentToRegistryAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txIdOfSignedContractSentToRegistryAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(propertyInscriptionIdLabel)
                            .addComponent(contractInscriptionIdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contractInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transferPropertyLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(propertyInscriptionIdLabel)
                    .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contractInscriptionIdLabel)
                    .addComponent(contractInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txIdOfSignedContractSentToRegistryAddressLabel)
                    .addComponent(txIdOfSignedContractSentToRegistryAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transactionIdOfPaymentSentToOwnerAddressLabel)
                        .addGap(18, 18, 18)
                        .addComponent(registerButton)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(transferPropertyTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transferPropertyTransactionIdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(transferPropertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transferPropertyInscriptionIdLabel)))
                    .addComponent(transactionIdOfPaymentSentToOwnerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        try {
//            String propertyInscriptionId = "ffc3183484b173fd3d748c62ad1f54b1b17011eb9526e5abc05cfb1e3af5575ci0"; //This is where a real application would open the file.
//            String contractInscriptionId = "727051d80563b94b597c1868161c5b92c7239df285d67453baf728c13eca477ei0";
//            String txIdOfSignedContractSentToRegistryAddress = "f207abf115f076d73d0fb9146f83ca1aff960e2b1b95d922bed8921c972d4f20";
//            String paymentTransactionId = "6619fd683cc2ddb186d356058657a1f786e795aaf97b58547a9490ddd4a1697a";
            
            // get property inscription id from UI
            String propertyInscriptionId = propertyInscriptionIdTextField.getText();
            // get contract inscription id from UI
            String contractInscriptionId = contractInscriptionIdTextField.getText();
            // get Transaction ID of Signed Contract Sent to Registry Office Address from UI
            String txIdOfSignedContractSentToRegistryAddress = txIdOfSignedContractSentToRegistryAddressTextField.getText();
            // get Transaction ID of Payment Sent to Owner Address from UI
            String paymentTransactionId = transactionIdOfPaymentSentToOwnerAddressTextField.getText();

            //save data from contract inscription into property transfer inscription
            // get inscription model from contract inscription id
            InscriptionModel inscriptionModel = RegistryServiceControl.getInscriptionData(contractInscriptionId);
            // get registry model from contract inscription id
            RegistryModel registryModel = RegistryServiceControl.getInscriptionContent(contractInscriptionId);            
            // update registry status to "Property Transfer Registry"
            registryModel.setDocumentType(StringsService.document_type_property_transfer_registry);
            // save contract inscription number into registryModel 
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().setInscriptionNumber(new BigDecimal(inscriptionModel.getNumber()));
            // save contract inscription id into registryModel
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().setInscriptionID(inscriptionModel.getID());
            // save registry office address 
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().setInscriptionAddress(inscriptionModel.getAddress());
            // save block height genesis
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().setBlockHeightGenesis(new BigDecimal(inscriptionModel.getHeight()));
            // save timestamp of public deed of sale and purchase registration
            String timestamp = RegistryServiceControl.convertUnixEpochToUtcTime(inscriptionModel.getTimestamp());
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().setTimestamp(timestamp);

            // get Signed Contract Sent to Registry Office info
            GetBlockModel getBlockModel1 = RegistryServiceControl.searchTransactionInBlocks(txIdOfSignedContractSentToRegistryAddress);
            // create an TransactionInfo object for signedContractSentToRegistryOfficeInfo
            RegistryModel.TransactionInfo signedContractSentToRegistryOfficeInfo = registryModel.new TransactionInfo();
            // set TransactionInfo signedContractSentToRegistryOfficeInfo on getSaleAgreementContractInfo().setSignedContractSentToRegistryOfficeInfo
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().setSignedContractSentToRegistryOfficeInfo(signedContractSentToRegistryOfficeInfo);
            // save transaction id of txIdOfSignedContractSentToRegistryAddress
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().getSignedContractSentToRegistryOfficeInfo().setTransactionID(txIdOfSignedContractSentToRegistryAddress);
            // save block hash 
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().getSignedContractSentToRegistryOfficeInfo().setBlockHash(getBlockModel1.getHash());
            // save block height
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().getSignedContractSentToRegistryOfficeInfo().setBlockHeight(getBlockModel1.getHeight());
            // save timestamp
            String time1 = RegistryServiceControl.convertUnixEpochToUtcTime(getBlockModel1.getTime());
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().getSignedContractSentToRegistryOfficeInfo().setTimestamp(time1);
            // get raw transaction model for txIdOfSignedContractSentToRegistryAddress
            GetRawTransactionModel getRawTransactionModel1 = RegistryServiceControl.getRawTransaction(txIdOfSignedContractSentToRegistryAddress);
            // get registry office address 
            String recipientAddress1 = getRawTransactionModel1.getResult().getVout().get(0).getScriptPubKey().getAddress();
            // save registry office address 
            registryModel.getPublicDeedOfSaleAndPurchaseInfo().getSignedContractSentToRegistryOfficeInfo().setRecipientAddress(recipientAddress1);
//            double amountSent1 = getRawTransactionModel1.getResult().getVout().get(0).getValue();
//            registryModel.getSaleAgreementContractInfo().getSignedContractSentToRegistryOfficeInfo().setPaymentAmount(new BigDecimal(amountSent1));

            // get payment info
            GetBlockModel getBlockModel = RegistryServiceControl.searchTransactionInBlocks(paymentTransactionId);
            // create an TransactionInfo object for paymentInfo
            RegistryModel.TransactionInfo paymentInfo = registryModel.new TransactionInfo();
            // set TransactionInfo paymentInfo on getSaleAgreementContractInfo()
            registryModel.setPaymentInfo(paymentInfo);
            // save transaction id of paymentTransactionId
            registryModel.getPaymentInfo().setTransactionID(paymentTransactionId);
            // save block hash
            registryModel.getPaymentInfo().setBlockHash(getBlockModel.getHash());
            // save block height
            registryModel.getPaymentInfo().setBlockHeight(getBlockModel.getHeight());
            // save timestamp
            String time = RegistryServiceControl.convertUnixEpochToUtcTime(getBlockModel.getTime());
            registryModel.getPaymentInfo().setTimestamp(time);
            // get raw transaction model for paymentTransactionId
            GetRawTransactionModel getRawTransactionModel = RegistryServiceControl.getRawTransaction(paymentTransactionId);
            // get property owner address
            String recipientAddress = getRawTransactionModel.getResult().getVout().get(0).getScriptPubKey().getAddress();
            // save property owner address
            registryModel.getPaymentInfo().setRecipientAddress(recipientAddress);
            // get amount sent to property owner address
            double amountSent = getRawTransactionModel.getResult().getVout().get(0).getValue();
            // save amount sent to property owner address
            registryModel.getPaymentInfo().setPaymentAmount(new BigDecimal(amountSent));

            // save registryModel object in JSON file format
            RegistryServiceControl.writeInscriptionDataToDisk(registryModel, StringsService.file_name_property_transfer);
            // register object RegistryModel on Bitcoin Blockchain through Ordinals software
            OrdInscribedDataModel ordInscribedDataModel = RegistryServiceControl.registerPropertyTransfer(StringsService.file_path + StringsService.file_name_property_transfer, propertyInscriptionId);
            
            //set transaction ID of Property Transfer
            transferPropertyTransactionIdTextField.setText(ordInscribedDataModel.getReveal());
            //set inscription ID of Property Transfer
            transferPropertyInscriptionIdTextField.setText(ordInscribedDataModel.getInscriptions().get(0).getID());
            
            if (!ordInscribedDataModel.getInscriptions().isEmpty()) {

                // generate 6 new blocks after creating new inscription
                List<String> blockHashList = RegistryServiceControl.generateToAddress(6);
            }
        } catch (IOException ex) {
            Logger.getLogger(RegisterPropertyTransferPanelView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(RegisterPropertyTransferPanelView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contractInscriptionIdLabel;
    private java.awt.TextField contractInscriptionIdTextField;
    private javax.swing.JLabel propertyInscriptionIdLabel;
    private java.awt.TextField propertyInscriptionIdTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel transactionIdOfPaymentSentToOwnerAddressLabel;
    private java.awt.TextField transactionIdOfPaymentSentToOwnerAddressTextField;
    private javax.swing.JLabel transferPropertyInscriptionIdLabel;
    private java.awt.TextField transferPropertyInscriptionIdTextField;
    private javax.swing.JLabel transferPropertyLabel;
    private javax.swing.JLabel transferPropertyTransactionIdLabel;
    private java.awt.TextField transferPropertyTransactionIdTextField;
    private javax.swing.JLabel txIdOfSignedContractSentToRegistryAddressLabel;
    private java.awt.TextField txIdOfSignedContractSentToRegistryAddressTextField;
    // End of variables declaration//GEN-END:variables
}
