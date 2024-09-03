/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package solution.view;

/*
 * TabbedPaneDemo.java requires one additional file:
 *   images/middle.gif.
 */

import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import solution.service.StringsService;

public class TabbedPaneView extends JPanel {
    
    String walletBuyerPublicKey;
    String walletOwnerPublicKey;
    String multisigAddress;
    
    public TabbedPaneView() {
        super(new GridLayout(1, 1));
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JComponent panel1 = buyerWalletPanel("Panel #1");
        tabbedPane.addTab("Buyer Wallet", null, panel1,
                "Buyer Wallet");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        
        JComponent panel2 = ownerWalletPanel("Panel #2");
        tabbedPane.addTab("Owner Wallet", null, panel2,
                "Owner Wallet");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        
        JComponent panel3 = registerNewPropertyPanel("Panel #3");
        tabbedPane.addTab("1. " + StringsService.register_new_property, null, panel3,
                "1. " + StringsService.register_new_property);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        
        JComponent panel4 = registerContractPanel("Panel #4");
        tabbedPane.addTab("2. " + StringsService.register_contract, null, panel4,
                "2. " + StringsService.register_contract);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
        
        JComponent panel5 = createMultisigAddressPanel("Panel #5");
        tabbedPane.addTab("3. Create Multisig Address", null, panel5,
                "3. Create Multisig Address");
        tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);
        
        JComponent panel6 = transferContractToMultisigAddressPanel("Panel #6");
        tabbedPane.addTab("4. " + StringsService.transfer_contract_to_multisig_address, null, panel6,
                "4. " + StringsService.transfer_contract_to_multisig_address);
        tabbedPane.setMnemonicAt(5, KeyEvent.VK_6);
        
        //Add the tabbed pane to this panel.
        add(tabbedPane);
        
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
        
    protected JComponent transferContractToMultisigAddressPanel(String text) {
        TransferContractToMultisigPanelView panel = new TransferContractToMultisigPanelView(multisigAddress);
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
            
    protected JComponent createMultisigAddressPanel(String text) {
        CreateMultisigAddressPanel panel = new CreateMultisigAddressPanel(walletBuyerPublicKey, walletOwnerPublicKey);
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        multisigAddress = panel.getCreateMultisigModel().getAddress();
        return panel;
    }
    
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    protected JComponent buyerWalletPanel(String text) {
        WalletBuyerPanelView walletBuyerPanelView = new WalletBuyerPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        walletBuyerPanelView.add(filler);
        walletBuyerPublicKey = walletBuyerPanelView.getAddressInfoModel.getResult().getPubkey();
        return walletBuyerPanelView;
    }
    
    protected JComponent ownerWalletPanel(String text) {
        WalletOwnerPanelView walletOwnerPanelView = new WalletOwnerPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        walletOwnerPanelView.add(filler);
        walletOwnerPublicKey = walletOwnerPanelView.getAddressInfoModel.getResult().getPubkey();
        return walletOwnerPanelView;
    }
    
    protected JComponent registerNewPropertyPanel(String text) {
        RegisterPropertyPanelView panel = new RegisterPropertyPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
    
    protected JComponent registerContractPanel(String text) {
        RegisterContractPanelView registerContractPanelView = new RegisterContractPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        registerContractPanelView.add(filler);
        return registerContractPanelView;
    }
    
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TabbedPaneView.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from
     * the event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame(StringsService.real_estate_registry_system);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add content to the window.
        frame.add(new TabbedPaneView(), BorderLayout.CENTER);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		createAndShowGUI();
            }
        });
    }
}
