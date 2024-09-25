
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import solution.control.RegistryServiceControl;
import solution.model.InscriptionModel;
import solution.model.OrdInscribedDataModel;
import solution.model.RegistryModel;
import solution.service.StringsService;
import solution.view.RegisterContractPanelView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ssd
 */
public class TransferPropertyTest {

    private static JFileChooser fc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        fc = new JFileChooser();

        int returnVal = fc.showOpenDialog(fc);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String propertyInscriptionId = "ffc3183484b173fd3d748c62ad1f54b1b17011eb9526e5abc05cfb1e3af5575ci0"; //This is where a real application would open the file.
            String paymentTxId = "6619fd683cc2ddb186d356058657a1f786e795aaf97b58547a9490ddd4a1697a";
            String txIdOfSignedContractSentToRegistryAddress = "f207abf115f076d73d0fb9146f83ca1aff960e2b1b95d922bed8921c972d4f20";
            String contractInscriptionId = "727051d80563b94b597c1868161c5b92c7239df285d67453baf728c13eca477ei0";
            //save data from property inscription into the contract
            InscriptionModel inscriptionModel = RegistryServiceControl.getInscriptionData(contractInscriptionId);
            RegistryModel registryModel = RegistryServiceControl.getInscriptionContent(contractInscriptionId);
            registryModel.getSaleAgreementContractInfo().setInscriptionNumber(inscriptionModel.getNumber());
            registryModel.getSaleAgreementContractInfo().setInscriptionID(inscriptionModel.getID());
            registryModel.getSaleAgreementContractInfo().setInscriptionAddress(inscriptionModel.getAddress());
            //                    registryModel.getPropertyInfo().setRevealTransactionGenesisID(inscriptionModel.get);//inscriptionModel does not contain it
            registryModel.getSaleAgreementContractInfo().setBlockHeightGenesis(inscriptionModel.getHeight());
            //                    registryModel.getPropertyInfo().setBlockHashGenesis(inscriptionModel.get);//inscriptionModel does not contain it
            String timestamp = RegistryServiceControl.convertUnixEpochToUtcTime(inscriptionModel.getTimestamp());
            registryModel.getSaleAgreementContractInfo().setTimestamp(timestamp);
            RegistryServiceControl.writeInscriptionDataToDisk(registryModel, StringsService.file_name_property_transfer);
            try {

                OrdInscribedDataModel ordInscribedDataModel = RegistryServiceControl.registerPropertyTransfer(file.getPath(), propertyInscriptionId);

                String contractTransactionIdTextField = ordInscribedDataModel.getReveal();
                if (!ordInscribedDataModel.getInscriptions().isEmpty()) {
                    String contractInscriptionIdTextField = ordInscribedDataModel.getInscriptions().get(0).getID();

                    // generate 6 new blocks after creating new inscription
                    List<String> blockHashList = RegistryServiceControl.generateToAddress(6);
                }
            } catch (IOException ex) {
                String message = ex.getMessage();
                Logger.getLogger(RegisterContractPanelView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                String message = ex.getMessage();
                Logger.getLogger(RegisterContractPanelView.class.getName()).log(Level.SEVERE, null, ex);
            }

//                    transferPropertyTransactionIdTextField.setText(ordInscribedDataModel.getReveal());
//                    if (!ordInscribedDataModel.getInscriptions().isEmpty()){
//                        transferPropertyInscriptionIdTextField.setText(ordInscribedDataModel.getInscriptions().get(0).getID());
//                        // generate 6 new blocks after creating new inscription
//                        List<String> blockHashList = RegistryServiceControl.generateToAddress(6);
//                    }
        }

    }
}
