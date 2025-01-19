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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import solution.service.StringsService;

public class TabbedPaneView extends JPanel {

    private String multisigAddress;
    private String redeemScript;
    private RegisterNewPropertyPanelView registerNewPropertyPanelView;
    private RegisterContractPanelView registerContractPanelView;

    public TabbedPaneView() {
        super(new GridLayout(1, 1));

        JTabbedPane tabbedPane = new JTabbedPane();

        JComponent panel1 = registerNewPropertyPanel("Panel #1");
        tabbedPane.addTab("1. " + StringsService.register_new_property, null, panel1,
                "1. " + StringsService.register_new_property);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_A);

        JComponent panel2 = registerContractPanel("Panel #2");
        tabbedPane.addTab("2. " + StringsService.register_contract, null, panel2,
                "2. " + StringsService.register_contract);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_B);

        JComponent panel3 = createMultisigAddressPanel("Panel #3");
        tabbedPane.addTab("3. " + StringsService.create_multisig_address, null, panel3,
                "3. " + StringsService.create_multisig_address);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_C);

        JComponent panel4 = sendContractToMultisigAddressPanel("Panel #4");
        tabbedPane.addTab("4. " + StringsService.send_contract_to_multisig_address, null, panel4,
                "4. " + StringsService.send_contract_to_multisig_address);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_D);

        JComponent panel5 = createMultisigTransactionPanel("Panel #5");
        tabbedPane.addTab("5. " + StringsService.create_multisig_transaction, null, panel5,
                "5. " + StringsService.create_multisig_transaction);
        tabbedPane.setMnemonicAt(4, KeyEvent.VK_E);

        JComponent panel6 = ownerWalletPanel("Panel #6");
        tabbedPane.addTab("6. " + StringsService.owner_signer_wallet, null, panel6,
                StringsService.owner_signer_wallet);
        tabbedPane.setMnemonicAt(5, KeyEvent.VK_F);

        JComponent panel7 = buyerWalletPanel("Panel #7");
        tabbedPane.addTab("7. " + StringsService.buyer_signer_wallet, null, panel7,
                StringsService.buyer_signer_wallet);
        tabbedPane.setMnemonicAt(6, KeyEvent.VK_G);

        JComponent panel8 = sendSignedContractToRegistryAddressPanel("Panel #8");
        tabbedPane.addTab("8. " + StringsService.send_signed_contract_to_registry_address, null, panel8,
                "8. " + StringsService.send_signed_contract_to_registry_address);
        tabbedPane.setMnemonicAt(7, KeyEvent.VK_H);

        JComponent panel9 = verifyContractSignaturesPanel("Panel #9");
        tabbedPane.addTab("9. " + StringsService.verify_contract_signatures, null, panel9,
                "9. " + StringsService.verify_contract_signatures);
        tabbedPane.setMnemonicAt(8, KeyEvent.VK_I);

        JComponent panel10 = sendPaymentFromBuyerToOwnerPanel("Panel #10");
        tabbedPane.addTab("10. " + StringsService.send_payment_from_buyer_to_owner, null, panel10,
                "10. " + StringsService.send_payment_from_buyer_to_owner);
        tabbedPane.setMnemonicAt(9, KeyEvent.VK_J);

        JComponent panel11 = verifyTransactionsPanel("Panel #11");
        tabbedPane.addTab("11. " + StringsService.verify_payment, null, panel11,
                "11. " + StringsService.verify_payment);
        tabbedPane.setMnemonicAt(10, KeyEvent.VK_K);

        JComponent panel12 = tranferPropertyToBuyerAddressPanel("Panel #12");
        tabbedPane.addTab("12. " + StringsService.register_property_transfer, null, panel12,
                "12. " + StringsService.register_property_transfer);
        tabbedPane.setMnemonicAt(11, KeyEvent.VK_L);

        //Add the tabbed pane to this panel.
        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    protected JComponent tranferPropertyToBuyerAddressPanel(String text) {
        RegisterPropertyTransferPanelView panel = new RegisterPropertyTransferPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent verifyTransactionsPanel(String text) {
        VerifyPaymentPanelView panel = new VerifyPaymentPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent sendPaymentFromBuyerToOwnerPanel(String text) {
        SendPaymentFromBuyerToOwnerPanelView panel = new SendPaymentFromBuyerToOwnerPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent verifyContractSignaturesPanel(String text) {
        VerifyContractSignaturesPanelView panel = new VerifyContractSignaturesPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent sendSignedContractToRegistryAddressPanel(String text) {
        SendSignedContractToRegistryPanelView panel = new SendSignedContractToRegistryPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent createMultisigTransactionPanel(String text) {
        CreateMultisigTransactionPanelView panel = new CreateMultisigTransactionPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent sendContractToMultisigAddressPanel(String text) {
        SendContractToMultisigPanelView panel = new SendContractToMultisigPanelView(multisigAddress, registerContractPanelView);
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent createMultisigAddressPanel(String text) {
        CreateMultisigAddressPanelView panel = new CreateMultisigAddressPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        multisigAddress = panel.getCreateMultisigModel().getAddress();
        redeemScript = panel.getCreateMultisigModel().getRedeemScript();
        
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent buyerWalletPanel(String text) {
        BuyerSignerPanelView panel = new BuyerSignerPanelView(redeemScript);
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent ownerWalletPanel(String text) {
        OwnerSignerPanelView panel = new OwnerSignerPanelView(redeemScript);
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        JScrollPane scroller = new JScrollPane(panel);
        return scroller;
    }

    protected JComponent registerNewPropertyPanel(String text) {
        registerNewPropertyPanelView = new RegisterNewPropertyPanelView();
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        registerNewPropertyPanelView.add(filler);
        JScrollPane scroller = new JScrollPane(registerNewPropertyPanelView);
        return scroller;
    }

    protected JComponent registerContractPanel(String text) {
        registerContractPanelView = new RegisterContractPanelView(registerNewPropertyPanelView);
        JLabel filler = new JLabel(text);
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        registerContractPanelView.add(filler);
        JScrollPane scroller = new JScrollPane(registerContractPanelView);
        return scroller;
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event dispatch thread.
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
