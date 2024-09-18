/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import solution.control.RegistryServiceControl;
import solution.model.OrdInscribedDataModel;

/**
 *
 * @author ssd
 */
public class RegisterNewPropertyPanelView extends javax.swing.JPanel {
    static private final String newline = "\n";
    JFileChooser fc;
    JTextArea log;
    /**
     * Creates new form RegisterProperty
     */
    public RegisterNewPropertyPanelView() {
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

        registerNewPropertyLabel = new javax.swing.JLabel();
        registerNewPropertyButton = new javax.swing.JButton();
        propertyTransactionIdLabel = new javax.swing.JLabel();
        propertyTransactionIdTextField = new java.awt.TextField();
        propertyInscriptionIdLabel = new javax.swing.JLabel();
        propertyInscriptionIdTextField = new java.awt.TextField();

        setDoubleBuffered(false);

        registerNewPropertyLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        registerNewPropertyLabel.setText("Register New Property");

        registerNewPropertyButton.setText("Register");
        registerNewPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNewPropertyButtonActionPerformed(evt);
            }
        });

        propertyTransactionIdLabel.setText("Property Transaction ID: ");

        propertyTransactionIdTextField.setBackground(new java.awt.Color(242, 242, 242));
        propertyTransactionIdTextField.setEditable(false);

        propertyInscriptionIdLabel.setText("Property Inscription ID: ");

        propertyInscriptionIdTextField.setBackground(new java.awt.Color(242, 242, 242));
        propertyInscriptionIdTextField.setEditable(false);
        propertyInscriptionIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyInscriptionIdTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerNewPropertyLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(propertyTransactionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(propertyTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerNewPropertyButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(propertyInscriptionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerNewPropertyLabel)
                .addGap(18, 18, 18)
                .addComponent(registerNewPropertyButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyTransactionIdLabel)
                    .addComponent(propertyTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyInscriptionIdLabel)
                    .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerNewPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNewPropertyButtonActionPerformed
        fc = new JFileChooser();
        log = new JTextArea(5,20);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
//        JScrollPane logScrollPane = new JScrollPane(log);
        if (evt.getSource() == registerNewPropertyButton) {
            int returnVal = fc.showOpenDialog(fc);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                                
                    OrdInscribedDataModel ordInscribedDataModel  = RegistryServiceControl.registerNewPropertyOrContract(file.getPath());
                    propertyTransactionIdTextField.setText(ordInscribedDataModel.getReveal());
                    if (!ordInscribedDataModel.getInscriptions().isEmpty()){
                        propertyInscriptionIdTextField.setText(ordInscribedDataModel.getInscriptions().get(0).getID());
                        
                        // generate 6 new blocks after creating new inscription
                    List<String> blockHashList = RegistryServiceControl.generateToAddress(6);
                    }
                    
                } catch (IOException ex) {
                    propertyTransactionIdLabel.setText(ex.getMessage());
                    Logger.getLogger(RegisterNewPropertyPanelView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    propertyTransactionIdLabel.setText(ex.getMessage());
                    Logger.getLogger(RegisterNewPropertyPanelView.class.getName()).log(Level.SEVERE, null, ex);
                }
                //This is where a real application would open the file.
                log.append("Opening: " + file.getName() + "." + newline);
            } else {
                log.append("Open command cancelled by user." + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());

        //Handle save button action.
        }
    }//GEN-LAST:event_registerNewPropertyButtonActionPerformed

    private void propertyInscriptionIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyInscriptionIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertyInscriptionIdTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel propertyInscriptionIdLabel;
    private java.awt.TextField propertyInscriptionIdTextField;
    private javax.swing.JLabel propertyTransactionIdLabel;
    private java.awt.TextField propertyTransactionIdTextField;
    private javax.swing.JButton registerNewPropertyButton;
    private javax.swing.JLabel registerNewPropertyLabel;
    // End of variables declaration//GEN-END:variables
}
