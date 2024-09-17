
import solution.control.RegistryServiceControl;
import solution.model.GetBlockModel;
import solution.model.GetRawTransactionModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ssd
 */
public class VerifyContractSignaturesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txIdOfSignedContract = "7a7ea3e22bf0b109bcc49d0d20c21ff3c7f778b11cbb2b4f8c7fe63a64a8051f";
        
        GetBlockModel getBlockModel = RegistryServiceControl.searchTransactionInBlocks(txIdOfSignedContract);
        GetRawTransactionModel getRawTransactionModel = RegistryServiceControl.getRawTransaction(txIdOfSignedContract);
        String recipientAddress = getRawTransactionModel.getResult().getVout().get(0).getScriptPubKey().getAddress();
//        recipientAddressTextField.setText(recipientAddress);
//        String amountSent = Double.toString(getRawTransactionModel.getResult().getVout().get(0).getValue());
        
        
    }
    
}
