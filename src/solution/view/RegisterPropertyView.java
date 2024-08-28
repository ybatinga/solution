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
public class RegisterPropertyView extends javax.swing.JPanel {
    static private final String newline = "\n";
    JFileChooser fc;
    JTextArea log;
    OrdInscribedDataModel ordInscribedDataModel;
    /**
     * Creates new form RegisterProperty
     */
    public RegisterPropertyView() {
        initComponents();
        propertyIdTextField.setEditable(false);
        propertyIdTextField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectFileButton = new javax.swing.JButton();
        regNewPropLabel = new javax.swing.JLabel();
        regPropButton = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        propertyIdLabel = new javax.swing.JLabel();
        propertyIdTextField = new java.awt.TextField();

        selectFileButton.setText("Select file");
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });

        regNewPropLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        regNewPropLabel.setText("Register New Property");

        regPropButton.setText("Register property");

        fileNameLabel.setText("New Property: ");

        propertyIdLabel.setText("Property ID: ");

        propertyIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyIdTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regNewPropLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectFileButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regPropButton))
                            .addComponent(fileNameLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(propertyIdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(propertyIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 153, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regNewPropLabel)
                .addGap(12, 12, 12)
                .addComponent(fileNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectFileButton)
                    .addComponent(regPropButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyIdLabel)
                    .addComponent(propertyIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        fc = new JFileChooser();
        log = new JTextArea(5,20);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);
        if (evt.getSource() == selectFileButton) {
            int returnVal = fc.showOpenDialog(fc);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                    ordInscribedDataModel = RegistryServiceControl.registerNewPropertyOrContract(file.getPath());
                    propertyIdTextField.setVisible(true);                    
                    propertyIdTextField.setText(ordInscribedDataModel.getInscriptions().get(0).getID());
                    
                } catch (IOException ex) {
                    propertyIdLabel.setText(ex.getMessage());
                    Logger.getLogger(RegisterPropertyView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    propertyIdLabel.setText(ex.getMessage());
                    Logger.getLogger(RegisterPropertyView.class.getName()).log(Level.SEVERE, null, ex);
                }
                //This is where a real application would open the file.
                log.append("Opening: " + file.getName() + "." + newline);
            } else {
                log.append("Open command cancelled by user." + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());

        //Handle save button action.
        }
    }//GEN-LAST:event_selectFileButtonActionPerformed

    private void propertyIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertyIdTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JLabel propertyIdLabel;
    private java.awt.TextField propertyIdTextField;
    private javax.swing.JLabel regNewPropLabel;
    private javax.swing.JButton regPropButton;
    private javax.swing.JButton selectFileButton;
    // End of variables declaration//GEN-END:variables
}
