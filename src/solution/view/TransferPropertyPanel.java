/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package solution.view;

import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import solution.control.RegistryServiceControl;
import solution.model.OrdInscribedDataModel;

/**
 *
 * @author ssd
 */
public class TransferPropertyPanel extends javax.swing.JPanel {
    static private final String newline = "\n";
    private JFileChooser fc;
    private JTextArea log;
    /**
     * Creates new form TransferPropertyPanel
     */
    public TransferPropertyPanel() {
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
        transferPropertytButton = new javax.swing.JButton();
        transferPropertyTransactionIdTextField = new java.awt.TextField();
        transferPropertyTransactionIdLabel = new javax.swing.JLabel();
        propertyInscriptionIdLabel = new javax.swing.JLabel();
        propertyInscriptionIdTextField = new java.awt.TextField();

        transferPropertyLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        transferPropertyLabel.setText("Transfer Property");

        transferPropertyInscriptionIdTextField.setBackground(new java.awt.Color(242, 242, 242));
        transferPropertyInscriptionIdTextField.setEditable(false);
        transferPropertyInscriptionIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferPropertyInscriptionIdTextFieldActionPerformed(evt);
            }
        });

        transferPropertyInscriptionIdLabel.setText("Transfer Property Inscription ID: ");

        transferPropertytButton.setText("Transfer");
        transferPropertytButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferPropertytButtonActionPerformed(evt);
            }
        });

        transferPropertyTransactionIdTextField.setBackground(new java.awt.Color(242, 242, 242));
        transferPropertyTransactionIdTextField.setEditable(false);

        transferPropertyTransactionIdLabel.setText("Transfer Property Transaction ID: ");

        propertyInscriptionIdLabel.setText("Property Inscription ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transferPropertyLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(propertyInscriptionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(propertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transferPropertyInscriptionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferPropertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(transferPropertytButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transferPropertyTransactionIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferPropertyTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addGap(19, 19, 19)
                .addComponent(transferPropertytButton)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transferPropertyTransactionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferPropertyTransactionIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transferPropertyInscriptionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferPropertyInscriptionIdLabel))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transferPropertytButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferPropertytButtonActionPerformed
       fc = new JFileChooser();
        log = new JTextArea(5,20);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);
        if (evt.getSource() == transferPropertytButton) {
            int returnVal = fc.showOpenDialog(fc);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                    String propertyInscriptionId = propertyInscriptionIdTextField.getText();
                    OrdInscribedDataModel ordInscribedDataModel = RegistryServiceControl.registerPropertyTransfer(file.getPath(), propertyInscriptionId);
                            
                    transferPropertyTransactionIdTextField.setText(ordInscribedDataModel.getReveal());
                    transferPropertyInscriptionIdTextField.setText(ordInscribedDataModel.getInscriptions().get(0).getID());
                } catch (IOException ex) {
                    transferPropertyTransactionIdTextField.setText(ex.getMessage());
                    Logger.getLogger(RegisterContractPanelView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    transferPropertyTransactionIdTextField.setText(ex.getMessage());
                    Logger.getLogger(RegisterContractPanelView.class.getName()).log(Level.SEVERE, null, ex);
                }
                //This is where a real application would open the file.
                log.append("Opening: " + file.getName() + "." + newline);
            } else {
                log.append("Open command cancelled by user." + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());

        //Handle save button action.
        }
    }//GEN-LAST:event_transferPropertytButtonActionPerformed

    private void transferPropertyInscriptionIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferPropertyInscriptionIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferPropertyInscriptionIdTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel propertyInscriptionIdLabel;
    private java.awt.TextField propertyInscriptionIdTextField;
    private javax.swing.JLabel transferPropertyInscriptionIdLabel;
    private java.awt.TextField transferPropertyInscriptionIdTextField;
    private javax.swing.JLabel transferPropertyLabel;
    private javax.swing.JLabel transferPropertyTransactionIdLabel;
    private java.awt.TextField transferPropertyTransactionIdTextField;
    private javax.swing.JButton transferPropertytButton;
    // End of variables declaration//GEN-END:variables
}
