/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import solution.control.RegistryServiceControl;
import solution.model.OrdInscribedDataModel;
import solution.model.RegistryModel;
import solution.service.StringsService;

/**
 *
 * @author ssd
 */
public class RegisterNewPropertyPanelView extends javax.swing.JPanel implements RegisterContractPanelView.OnRegisterContractTextFieldInteraction{
//    static private final String newline = "\n";
//    JFileChooser fc;
//    JTextArea log;
    private String propertyInscriptionId;
    
    /**
     * Creates new form RegisterProperty
     */
    public RegisterNewPropertyPanelView() {
        initComponents();
        
        propertyAddressTextField.setText(StringsService.propertyAddress);
        propertyAreaSquareMetersTextField.setText(Long.toString(StringsService.propertyAreaSquareMeters));
        ownerNationalIdTextField.setText(StringsService.PLATFORM.getNATIONAL_ID_OWNER());
        ownerNameTextField.setText(StringsService.PLATFORM.getNAME_OWNER());
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
        registerNewPropertyButton = new javax.swing.JButton();
        propertyInscriptionIdLabel = new javax.swing.JLabel();
        propertyInscriptionIdTextField = new java.awt.TextField();
        propertyAddressLabel = new javax.swing.JLabel();
        propertyAddressTextField = new java.awt.TextField();
        propertyAreaSquareMetersTextField = new java.awt.TextField();
        propertyAreaSquareMetersLabel = new javax.swing.JLabel();
        ownerNationalIdLabel = new javax.swing.JLabel();
        ownerNationalIdTextField = new java.awt.TextField();
        ownerNameLabel = new javax.swing.JLabel();
        ownerNameTextField = new java.awt.TextField();

        setBackground(new java.awt.Color(247, 247, 247));
        setDoubleBuffered(false);

        registerNewPropertyLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        registerNewPropertyLabel.setText("Register New Property");

        registerNewPropertyButton.setText("Register");
        registerNewPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNewPropertyButtonActionPerformed(evt);
            }
        });

        propertyInscriptionIdLabel.setText("Property Inscription ID: ");

        propertyInscriptionIdTextField.setBackground(new java.awt.Color(242, 242, 242));
        propertyInscriptionIdTextField.setEditable(false);

        propertyAddressLabel.setText("Property Address:");

        propertyAreaSquareMetersLabel.setText("Property Area in Square Meters:");

        ownerNationalIdLabel.setText("Owner National ID:");

        ownerNationalIdTextField.setBackground(new java.awt.Color(248, 248, 248));
        ownerNationalIdTextField.setEditable(false);

        ownerNameLabel.setText("Owner Name:");

        ownerNameTextField.setBackground(new java.awt.Color(248, 248, 248));
        ownerNameTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(propertyAreaSquareMetersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(propertyAreaSquareMetersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerNewPropertyLabel)
                    .addComponent(registerNewPropertyButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(propertyInscriptionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(propertyAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(propertyAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ownerNationalIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerNationalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ownerNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerNewPropertyLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyAddressLabel)
                    .addComponent(propertyAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyAreaSquareMetersLabel)
                    .addComponent(propertyAreaSquareMetersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerNationalIdLabel)
                    .addComponent(ownerNationalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerNameLabel)
                    .addComponent(ownerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registerNewPropertyButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyInscriptionIdLabel)
                    .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerNewPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNewPropertyButtonActionPerformed
//        fc = new JFileChooser();
//        log = new JTextArea(5,20);
//        log.setMargin(new Insets(5,5,5,5));
//        log.setEditable(false);
////        JScrollPane logScrollPane = new JScrollPane(log);
//        if (evt.getSource() == registerNewPropertyButton) {
//            int returnVal = fc.showOpenDialog(fc);
//
//            if (returnVal == JFileChooser.APPROVE_OPTION) {
//                File file = fc.getSelectedFile();
                try {
                    // create object RegistryModel with data to register a new property
                    RegistryModel registryModel = new RegistryModel();
                    registryModel.setDocumentType(StringsService.document_type_new_property_registry);
                    RegistryModel.PropertyInfo propertyInfo = registryModel.new PropertyInfo();
                    propertyInfo.setPropertyAddress(propertyAddressTextField.getText());
                    propertyInfo.setPropertyAreaSquareMeters(Long.parseLong(propertyAreaSquareMetersTextField.getText()));
                    propertyInfo.setInscriptionNumber(null);
                    propertyInfo.setBlockHashGenesis(null);
                    registryModel.setPropertyInfo(propertyInfo);
                    RegistryModel.OwnerInfo ownerInfo = registryModel.new OwnerInfo();
                    ownerInfo.setOwnerNationalID(ownerNationalIdTextField.getText());
                    ownerInfo.setOwnerName(ownerNameTextField.getText());
                    registryModel.setOwnerInfo(ownerInfo);
                    
                    // save registryModel object in JSON file format
                    RegistryServiceControl.writeInscriptionDataToDisk(registryModel, StringsService.file_name_new_property);
                    // register object RegistryModel on Bitcoin Blockchain through Ordinals software
                    OrdInscribedDataModel ordInscribedDataModel  = RegistryServiceControl.registerNewPropertyOrContract(StringsService.file_path + StringsService.file_name_new_property);
//                    propertyTransactionIdTextField.setText(ordInscribedDataModel.getReveal());
                    
                    // get Property Inscrition ID and inform inform it on the Application interface
                    if (!ordInscribedDataModel.getInscriptions().isEmpty()){
                        propertyInscriptionId = ordInscribedDataModel.getInscriptions().get(0).getID();
                        propertyInscriptionIdTextField.setText(propertyInscriptionId);
                        
                        // generate 6 new blocks after creating new inscription 
                    List<String> blockHashList = RegistryServiceControl.generateToAddress(6);
                    }
                    
                } catch (IOException ex) {
                    Logger.getLogger(RegisterNewPropertyPanelView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RegisterNewPropertyPanelView.class.getName()).log(Level.SEVERE, null, ex);
                }
//                //This is where a real application would open the file.
//                log.append("Opening: " + file.getName() + "." + newline);
//            } else {
//                log.append("Open command cancelled by user." + newline);
//            }
//            log.setCaretPosition(log.getDocument().getLength());

        //Handle save button action.
//        }
    }//GEN-LAST:event_registerNewPropertyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ownerNameLabel;
    private java.awt.TextField ownerNameTextField;
    private javax.swing.JLabel ownerNationalIdLabel;
    private java.awt.TextField ownerNationalIdTextField;
    private javax.swing.JLabel propertyAddressLabel;
    private java.awt.TextField propertyAddressTextField;
    private javax.swing.JLabel propertyAreaSquareMetersLabel;
    private java.awt.TextField propertyAreaSquareMetersTextField;
    private javax.swing.JLabel propertyInscriptionIdLabel;
    private java.awt.TextField propertyInscriptionIdTextField;
    private javax.swing.JButton registerNewPropertyButton;
    private javax.swing.JLabel registerNewPropertyLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public String onRegisterContractInteraction() {
        if (propertyInscriptionId == null){
            return null;
        }else{
            return propertyInscriptionId;
        }
    }
}
