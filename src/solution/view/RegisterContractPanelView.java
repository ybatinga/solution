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
import solution.model.GetAddressInfoModel;
import solution.model.InscriptionModel;
import solution.model.OrdInscribedDataModel;
import solution.model.RegistryModel;
import solution.model.RegistryModel.SaleAgreementContractInfo;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
//        interface code
//public class RegisterContractPanelView extends javax.swing.JPanel implements TransferContractToMultisigPanelView.ShareContractTransactionId{
public class RegisterContractPanelView extends javax.swing.JPanel {

//    static private final String newline = "\n";
//    private JFileChooser fc;
//    private JTextArea log;
    private OnRegisterContractTextFieldInteraction onRegisterContractTextFieldInteraction;
    private RegistryModel registryModel;

    /**
     * Creates new form RegisterProperty
     */
    public RegisterContractPanelView(RegisterNewPropertyPanelView registerNewPropertyPanelView) {
        initComponents();
        onRegisterContractTextFieldInteraction = (OnRegisterContractTextFieldInteraction) registerNewPropertyPanelView;
        
        registryModel = new RegistryModel();
        registryModel.setDocumentType(StringsService.document_type_property_sale_agreement_contract);
//        propertyAddressTextField.setText(registryModelInscriptionContent.getPropertyInfo().getPropertyAddress());
//        propertyAreaSquareMetersTextField.setText(Long.toString(registryModelInscriptionContent.getPropertyInfo().getPropertyAreaSquareMeters()));
        ownerNationalIdTextField.setText(StringsService.PLATFORM.getNATIONAL_ID_OWNER());
        ownerNameTextField.setText(StringsService.PLATFORM.getNAME_OWNER());
        ownerWalletAddressTextField.setText(StringsService.PLATFORM.getWALLET_ADDRESS_OWNER());
        GetAddressInfoModel getAddressInfoModelOwner = RegistryServiceControl.getAddressInfo(StringsService.PLATFORM.getWALLET_NAME_OWNER(), StringsService.PLATFORM.getWALLET_ADDRESS_OWNER());
        ownerWalletPublicKeyTextField.setText(getAddressInfoModelOwner.getResult().getPubkey());
        buyerNationalIdTextField.setText(StringsService.PLATFORM.getNATIONAL_ID_BUYER());
        buyerNameTextField.setText(StringsService.PLATFORM.getNAME_BUYER());
        buyerWalletAddressTextField.setText(StringsService.PLATFORM.getWALLET_ADDRESS_BUYER());
        GetAddressInfoModel getAddressInfoModelBuyer = RegistryServiceControl.getAddressInfo(StringsService.PLATFORM.getWALLET_NAME_BUYER(), StringsService.PLATFORM.getWALLET_ADDRESS_BUYER());
        buyerWalletPublicKeyTextField.setText(getAddressInfoModelBuyer.getResult().getPubkey());
        paymentAmountTextField.setText(Double.toString(StringsService.paymentAmount));
        
        RegistryModel.OwnerInfo ownerInfo = registryModel.new OwnerInfo();
        ownerInfo.setOwnerNationalID(StringsService.PLATFORM.getNATIONAL_ID_OWNER());
        ownerInfo.setOwnerName(StringsService.PLATFORM.getNAME_OWNER());
        ownerInfo.setOwnerWalletAddress(StringsService.PLATFORM.getWALLET_ADDRESS_OWNER());
        ownerInfo.setOwnerWalletPublicKeyAddress(getAddressInfoModelOwner.getResult().getPubkey());
        registryModel.setOwnerInfo(ownerInfo);
        
        RegistryModel.BuyerInfo buyerInfo = registryModel.new BuyerInfo();
        buyerInfo.setBuyerNationalID(StringsService.PLATFORM.getNATIONAL_ID_BUYER());
        buyerInfo.setBuyerName(StringsService.PLATFORM.getNAME_BUYER());
        buyerInfo.setBuyerWalletAddress(StringsService.PLATFORM.getWALLET_ADDRESS_BUYER());
        buyerInfo.setBuyerWalletPublicKeyAddress(getAddressInfoModelBuyer.getResult().getPubkey());
        registryModel.setBuyerInfo(buyerInfo);
        
        RegistryModel.SaleAgreementContractInfo saleAgreementContractInfo = registryModel.new SaleAgreementContractInfo();
        registryModel.setSaleAgreementContractInfo(saleAgreementContractInfo);
        registryModel.getSaleAgreementContractInfo().setSalePrice(StringsService.paymentAmount);
        
        // save registryModel object in JSON file format
        RegistryServiceControl.writeInscriptionDataToDisk(registryModel, StringsService.file_name_property_sale_contract);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerNewPropertyLabel = new javax.swing.JLabel();
        regContractButton = new javax.swing.JButton();
        contractTransactionIdTextField = new java.awt.TextField();
        contractTransactionIdLabel = new javax.swing.JLabel();
        contractInscriptionIdTextField = new java.awt.TextField();
        contractInscriptionIdLabel = new javax.swing.JLabel();
        propertyInscriptionIdLabel = new javax.swing.JLabel();
        propertyInscriptionIdTextField = new java.awt.TextField();
        ownerNationalIdLabel = new javax.swing.JLabel();
        ownerNationalIdTextField = new java.awt.TextField();
        ownerNameLabel = new javax.swing.JLabel();
        ownerNameTextField = new java.awt.TextField();
        ownerWalletAddressLabel = new javax.swing.JLabel();
        ownerWalletPublicKeyLabel = new javax.swing.JLabel();
        ownerWalletAddressTextField = new java.awt.TextField();
        ownerWalletPublicKeyTextField = new java.awt.TextField();
        buyerNationalIdLabel = new javax.swing.JLabel();
        buyerWalletAddressLabel = new javax.swing.JLabel();
        buyerNationalIdTextField = new java.awt.TextField();
        buyerNameLabel = new javax.swing.JLabel();
        buyerWalletPublicKeyLabel = new javax.swing.JLabel();
        buyerNameTextField = new java.awt.TextField();
        buyerWalletAddressTextField = new java.awt.TextField();
        buyerWalletPublicKeyTextField = new java.awt.TextField();
        paymentAmountLabel = new javax.swing.JLabel();
        paymentAmountTextField = new java.awt.TextField();

        setBackground(new java.awt.Color(247, 247, 247));

        registerNewPropertyLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        registerNewPropertyLabel.setText("Register Contract");

        regContractButton.setText("Register");
        regContractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regContractButtonActionPerformed(evt);
            }
        });

        contractTransactionIdTextField.setBackground(new java.awt.Color(248, 248, 248));
        contractTransactionIdTextField.setEditable(false);

        contractTransactionIdLabel.setText("Contract Transaction ID: ");

        contractInscriptionIdTextField.setBackground(new java.awt.Color(248, 248, 248));
        contractInscriptionIdTextField.setEditable(false);

        contractInscriptionIdLabel.setText("Contract Inscription ID: ");

        propertyInscriptionIdLabel.setText("Property Inscription ID: ");

        propertyInscriptionIdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                propertyInscriptionIdTextFieldFocusGained(evt);
            }
        });

        ownerNationalIdLabel.setText("Owner National ID:");

        ownerNationalIdTextField.setBackground(new java.awt.Color(248, 248, 248));
        ownerNationalIdTextField.setEditable(false);

        ownerNameLabel.setText("Owner Name:");

        ownerNameTextField.setBackground(new java.awt.Color(248, 248, 248));
        ownerNameTextField.setEditable(false);

        ownerWalletAddressLabel.setText("Owner Wallet Address:");

        ownerWalletPublicKeyLabel.setText("Onwer Wallet Public Key:");

        ownerWalletAddressTextField.setBackground(new java.awt.Color(248, 248, 248));
        ownerWalletAddressTextField.setEditable(false);

        ownerWalletPublicKeyTextField.setBackground(new java.awt.Color(248, 248, 248));
        ownerWalletPublicKeyTextField.setEditable(false);

        buyerNationalIdLabel.setText("Buyer National ID:");

        buyerWalletAddressLabel.setText("Buyer Wallet Address:");

        buyerNationalIdTextField.setBackground(new java.awt.Color(248, 248, 248));
        buyerNationalIdTextField.setEditable(false);

        buyerNameLabel.setText("Buyer Name:");

        buyerWalletPublicKeyLabel.setText("Buyer Wallet Public Key:");

        buyerNameTextField.setBackground(new java.awt.Color(248, 248, 248));
        buyerNameTextField.setEditable(false);

        buyerWalletAddressTextField.setBackground(new java.awt.Color(248, 248, 248));
        buyerWalletAddressTextField.setEditable(false);

        buyerWalletPublicKeyTextField.setBackground(new java.awt.Color(248, 248, 248));
        buyerWalletPublicKeyTextField.setEditable(false);

        paymentAmountLabel.setText("Payment Amount:");

        paymentAmountTextField.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paymentAmountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buyerWalletPublicKeyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buyerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ownerWalletPublicKeyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ownerWalletAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerWalletAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerNewPropertyLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(propertyInscriptionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(regContractButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ownerNationalIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerNationalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ownerNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contractTransactionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contractTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contractInscriptionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contractInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buyerNationalIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buyerNationalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buyerNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buyerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buyerWalletAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buyerWalletAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerNewPropertyLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyInscriptionIdLabel)
                    .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerNationalIdLabel)
                    .addComponent(ownerNationalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerNameLabel)
                    .addComponent(ownerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerWalletAddressLabel)
                    .addComponent(ownerWalletAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerWalletPublicKeyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ownerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyerNationalIdLabel)
                    .addComponent(buyerNationalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyerNameLabel)
                    .addComponent(buyerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyerWalletAddressLabel)
                    .addComponent(buyerWalletAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyerWalletPublicKeyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyerWalletPublicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentAmountLabel)
                    .addComponent(paymentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(regContractButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contractTransactionIdLabel)
                    .addComponent(contractTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contractInscriptionIdLabel)
                    .addComponent(contractInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regContractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regContractButtonActionPerformed
        try {
            // load contract in JSON file that contains buyer and owner data, including their wallet info, and price of property
//                    File file = fc.getSelectedFile();
//                    Reader reader = new FileReader(file);
//                    RegistryModel registryModel = new Gson().fromJson(reader, RegistryModel.class);
            
            // create object RegistryModel with data to register a contract
            RegistryModel.PropertyInfo propertyInfo = registryModel.new PropertyInfo();
            registryModel.setPropertyInfo(propertyInfo);

            //retrieve and save data from property inscription into the contract
            InscriptionModel inscriptionModel = RegistryServiceControl.getInscriptionData(propertyInscriptionIdTextField.getText());
            registryModel.getPropertyInfo().setInscriptionNumber(new BigDecimal(inscriptionModel.getNumber()));
            registryModel.getPropertyInfo().setInscriptionID(inscriptionModel.getID());
            registryModel.getPropertyInfo().setInscriptionAddress(inscriptionModel.getAddress());
            registryModel.getPropertyInfo().setBlockHeightGenesis(new BigDecimal(inscriptionModel.getHeight()));
            String timestamp = RegistryServiceControl.convertUnixEpochToUtcTime(inscriptionModel.getTimestamp());
            registryModel.getPropertyInfo().setTimestamp(timestamp);

            // get property address and property square meters
            RegistryModel registryModelInscriptionContent = RegistryServiceControl.getInscriptionContent(propertyInscriptionIdTextField.getText());
            registryModel.getPropertyInfo().setPropertyAddress(registryModelInscriptionContent.getPropertyInfo().getPropertyAddress());
            registryModel.getPropertyInfo().setPropertyAreaSquareMeters(registryModelInscriptionContent.getPropertyInfo().getPropertyAreaSquareMeters());
                        
            // save registryModel object in JSON file format
            RegistryServiceControl.writeInscriptionDataToDisk(registryModel, StringsService.file_name_property_sale_contract);
            // register object RegistryModel on Bitcoin Blockchain through Ordinals software
            OrdInscribedDataModel ordInscribedDataModel = RegistryServiceControl.registerNewPropertyOrContract(StringsService.file_path + StringsService.file_name_property_sale_contract); //This is where a real application would open the file.
//                    log.append("Opening: " + file.getName() + "." + newline);

            // get Contract TransactionID and inform inform it on the Application interface
            contractTransactionIdTextField.setText(ordInscribedDataModel.getReveal());
            if (!ordInscribedDataModel.getInscriptions().isEmpty()) {
                // get Contract Incription ID and inform inform it on the Application interface
                contractInscriptionIdTextField.setText(ordInscribedDataModel.getInscriptions().get(0).getID());

                // generate 6 new blocks after creating new inscription
                List<String> blockHashList = RegistryServiceControl.generateToAddress(6);
            }
        } catch (IOException ex) {
            Logger.getLogger(RegisterContractPanelView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(RegisterContractPanelView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_regContractButtonActionPerformed

    private void propertyInscriptionIdTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_propertyInscriptionIdTextFieldFocusGained
        String propertyInscriptionId = onRegisterContractTextFieldInteraction.onRegisterContractInteraction();
        if (propertyInscriptionId != null){
            propertyInscriptionIdTextField.setText(propertyInscriptionId);
        }

    }//GEN-LAST:event_propertyInscriptionIdTextFieldFocusGained

    public interface OnRegisterContractTextFieldInteraction {
        // TODO: Update argument type and name
        public String onRegisterContractInteraction();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buyerNameLabel;
    private java.awt.TextField buyerNameTextField;
    private javax.swing.JLabel buyerNationalIdLabel;
    private java.awt.TextField buyerNationalIdTextField;
    private javax.swing.JLabel buyerWalletAddressLabel;
    private java.awt.TextField buyerWalletAddressTextField;
    private javax.swing.JLabel buyerWalletPublicKeyLabel;
    private java.awt.TextField buyerWalletPublicKeyTextField;
    private javax.swing.JLabel contractInscriptionIdLabel;
    private java.awt.TextField contractInscriptionIdTextField;
    private javax.swing.JLabel contractTransactionIdLabel;
    private java.awt.TextField contractTransactionIdTextField;
    private javax.swing.JLabel ownerNameLabel;
    private java.awt.TextField ownerNameTextField;
    private javax.swing.JLabel ownerNationalIdLabel;
    private java.awt.TextField ownerNationalIdTextField;
    private javax.swing.JLabel ownerWalletAddressLabel;
    private java.awt.TextField ownerWalletAddressTextField;
    private javax.swing.JLabel ownerWalletPublicKeyLabel;
    private java.awt.TextField ownerWalletPublicKeyTextField;
    private javax.swing.JLabel paymentAmountLabel;
    private java.awt.TextField paymentAmountTextField;
    private javax.swing.JLabel propertyInscriptionIdLabel;
    private java.awt.TextField propertyInscriptionIdTextField;
    private javax.swing.JButton regContractButton;
    private javax.swing.JLabel registerNewPropertyLabel;
    // End of variables declaration//GEN-END:variables

}
