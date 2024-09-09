/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.control;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import solution.model.GetAddressInfoModel;
import solution.model.OrdInscribedDataModel;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import solution.model.BitcoinCliStringResultModel;
import solution.model.CreateMultisigModel;
import solution.model.DecodeRawTransactionModel;
import solution.model.GetRawTransactionModel;
import solution.model.ListUnspentModel;
import solution.model.SignRawTransactionWithKeyModel;
import solution.model.SignRawTransactionWithWalletModel;

/**
 *
 * @author ssd
 */
public class RegistryServiceControl {
    
    public static OrdInscribedDataModel registerNewPropertyOrContract(String filePath) throws IOException, InterruptedException {

        Process process = Runtime.getRuntime().exec("/usr/local/apps/ord-0.19.1/ord --chain regtest --bitcoin-rpc-password rpc --bitcoin-rpc-username rpc wallet inscribe --fee-rate 2 --file " + filePath); // for Linux
            //Process process = Runtime.getRuntime().exec("cmd /c dir"); //for Windows

        process.waitFor();

        InputStreamReader reader =
                new InputStreamReader(process.getInputStream());
        OrdInscribedDataModel ordInscribedDataModel = new Gson().fromJson(reader, OrdInscribedDataModel.class);
        
        if(ordInscribedDataModel == null || ordInscribedDataModel.equals("")){
//            if(signRawTransactionWithWalletModel == null){
                String concatErrorMsg = printErrorInOutput(process);
                ordInscribedDataModel = new OrdInscribedDataModel();
                ordInscribedDataModel.setReveal(concatErrorMsg);
                return ordInscribedDataModel;
            }
        
//        if(ordInscribedDataModel == null){
//            OrdInscribedDataModel ordInscribedDataModelError = new OrdInscribedDataModel();
//            OrdInscribedDataModel.Inscription inscription = ordInscribedDataModelError.new Inscription();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//            inscription.setID(bufferedReader.readLine());
//            ordInscribedDataModelError.getInscriptions().add(inscription);
           
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));    
//        String line = new String();
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//            return ordInscribedDataModelError;
//        }
            
        return ordInscribedDataModel;
    }
    
    public static OrdInscribedDataModel registerPropertyTransfer(String filePath, String parentInscriptionID) throws IOException, InterruptedException {

        Process process = Runtime.getRuntime().exec("/usr/local/apps/ord-0.19.1/ord --chain regtest --bitcoin-rpc-password rpc --bitcoin-rpc-username rpc wallet inscribe --fee-rate 2 --parent " + parentInscriptionID + " --file " + filePath); // for Linux
            //Process process = Runtime.getRuntime().exec("cmd /c dir"); //for Windows

        process.waitFor();

        InputStreamReader reader =
                new InputStreamReader(process.getInputStream());
        OrdInscribedDataModel ordInscribedDataModel = new Gson().fromJson(reader, OrdInscribedDataModel.class);
        
        if(ordInscribedDataModel == null || ordInscribedDataModel.equals("")){
//            if(signRawTransactionWithWalletModel == null){
                String concatErrorMsg = printErrorInOutput(process);
                ordInscribedDataModel = new OrdInscribedDataModel();
                ordInscribedDataModel.setReveal(concatErrorMsg);
                return ordInscribedDataModel;
            }
        
//        if(ordInscribedDataModel == null){
//            OrdInscribedDataModel ordInscribedDataModelError = new OrdInscribedDataModel();
//            OrdInscribedDataModel.Inscription inscription = ordInscribedDataModelError.new Inscription();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//            inscription.setID(bufferedReader.readLine());
//            ordInscribedDataModelError.getInscriptions().add(inscription);
           
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));    
//        String line = new String();
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//            return ordInscribedDataModelError;
//        }
            
        return ordInscribedDataModel;
    }
    
    public static GetAddressInfoModel getAddressInfo(String walletName, String walletAddress) {
        
        try {
            HttpClient client = HttpClient.newHttpClient();
            
            String credentials = "rpc" + ":" + "rpc";
            String auth = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
            
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:18443/wallet/" + walletName))
                    .POST(BodyPublishers.ofString("{\"jsonrpc\": \"1.0\", \"id\": \"curltest\", \"method\": \"getaddressinfo\", \"params\": [\"" + walletAddress + "\"]}"))
                    .setHeader("content-type", "text/plain;")
                    .setHeader("authorization", auth)
                    .build();
            
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body().toString();
            GetAddressInfoModel getAddressInfoModel = new Gson().fromJson(json, GetAddressInfoModel.class);
            return getAddressInfoModel;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static String dumpPrivKey(String walletName, String walletAddress){
        try {
            HttpClient client = HttpClient.newHttpClient();
            
            String credentials = "rpc" + ":" + "rpc";
            String auth = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
            
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:18443/wallet/" + walletName))
                    .POST(BodyPublishers.ofString("{\"jsonrpc\": \"1.0\", \"id\": \"curltest\", \"method\": \"dumpprivkey\", \"params\": [\"" + walletAddress + "\"]}"))
                    .setHeader("content-type", "text/plain;")
                    .setHeader("authorization", auth)
                    .build();
            
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body().toString();
            BitcoinCliStringResultModel bitcoinCliStringResultModel = new Gson().fromJson(json, BitcoinCliStringResultModel.class);
               
            return bitcoinCliStringResultModel.getResult();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static CreateMultisigModel createMultisigAddress(String buyerPublicKey, String ownerPublicKey)  {
        try {
            
            Process process = Runtime.getRuntime().exec(new String[]{"/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli", "createmultisig", "2", "[\""+ buyerPublicKey+ "\", \""+ ownerPublicKey+ "\"]"}); // for Linux

            process.waitFor();

        InputStreamReader reader =
                new InputStreamReader(process.getInputStream());
        CreateMultisigModel createMultisigModel = new Gson().fromJson(reader, CreateMultisigModel.class);
        
//            print error as output
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//            String line = new String();
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }

        return createMultisigModel;
//            return null;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static GetRawTransactionModel getRawTransaction(String txId) {
        
        try {
            HttpClient client = HttpClient.newHttpClient();
            
            String credentials = "rpc" + ":" + "rpc";
            String auth = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
            
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:18443/wallet/ord"))
                    .POST(BodyPublishers.ofString("{\"jsonrpc\": \"1.0\", \"id\": \"curltest\", \"method\": \"getrawtransaction\", \"params\": [\""+ txId +"\", true]}"))
                    .setHeader("content-type", "text/plain;")
                    .setHeader("authorization", auth)
                    .build();
            
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body().toString();
            GetRawTransactionModel getRawTransactionModel = new Gson().fromJson(json, GetRawTransactionModel.class);
            return getRawTransactionModel;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


    public static String createRawTransaction(String txId, long vout, String recipientAddress, double amount) {
        try {
            //                        "[{\"txid\":\"" + txId + "\",\"vout\":0}]", "[{\"" + recipientAddress + "\":0.01}]"};
            String[] command = new String[]{
                "/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli",
                "createrawtransaction",
                "[{\"txid\":\"" + txId + "\",\"vout\":" + vout + "}]",
                "[{\"" + recipientAddress + "\":" + amount + "}]"
            };            

            Process process = Runtime.getRuntime().exec(command); // for Linux

            process.waitFor();

        InputStreamReader reader =
                new InputStreamReader(process.getInputStream());
        String rawTxHex = new Gson().fromJson(reader, String.class);
//            print error as output
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//            String line = new String();
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }

            return rawTxHex;
//            return null;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static String createRawTransactionWithChangeAddress(String txId, 
            long vout, 
            String recipientAddress, 
            double amount, 
            String changeAddress, 
            double changeAmount) {
        try {
//                        "[{\"txid\":\"" + txId + "\",\"vout\":0}]", "[{\"" + recipientAddress + "\":0.01}]"};
             String[] command = new String[]{
                 "/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli", 
                 "createrawtransaction",
                 "[{\"txid\":\"" + txId + "\",\"vout\":" + vout + "}]", 
                 "{\"" + recipientAddress + "\":" + amount + ",\"" + changeAddress + "\":" + changeAmount + "}"};            
            
            Process process = Runtime.getRuntime().exec(command); // for Linux

            process.waitFor();

        InputStreamReader reader =
                new InputStreamReader(process.getInputStream());
        String rawTxHex = new Gson().fromJson(reader, String.class);
        
        if (rawTxHex == null || rawTxHex.equals("")) {
                String concatErrorMsg = printErrorInOutput(process);
                return concatErrorMsg;
            }
  
            return rawTxHex;

        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static String decodeRawTransaction(String rawTxHex) {
        try {
            String[] command = new String[]{"/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli", "decoderawtransaction",
                rawTxHex};

            Process process = Runtime.getRuntime().exec(command); // for Linux

            process.waitFor();

            InputStreamReader reader
                    = new InputStreamReader(process.getInputStream());
            DecodeRawTransactionModel decodeRawTransactionModel = new Gson().fromJson(reader, DecodeRawTransactionModel.class);
//            print error as output
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//            String line = new String();
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }

            return decodeRawTransactionModel.getVin().get(0).getTxid();
//            return null;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static String signRawTransactionWithWallet(String rawTxHex, String walletName) {
        try {
            String[] command = new String[]{"/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli", "-rpcwallet=" + walletName, 
                "signrawtransactionwithwallet", rawTxHex};

            Process process = Runtime.getRuntime().exec(command); // for Linux

            process.waitFor();

            InputStreamReader reader
                    = new InputStreamReader(process.getInputStream());
            
            SignRawTransactionWithWalletModel signRawTransactionWithWalletModel = new Gson().fromJson(reader, SignRawTransactionWithWalletModel.class);
//            print error as output
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//            String line = new String();
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
            
            String signedTx = signRawTransactionWithWalletModel.getHex();
            return signedTx;
//            return null;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static String sendRawTransaction(String signedTx, String walletName) {
        try {
            String[] command = new String[]{"/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli", "-rpcwallet=" + walletName, 
                "sendrawtransaction", signedTx};

            Process process = Runtime.getRuntime().exec(command); // for Linux

            process.waitFor();

            //this code block gets result of object that does not have a Model object yet
//            String newLine = System.getProperty("line.separator");
//            BufferedReader reader = new BufferedReader(
//                    new InputStreamReader(process.getInputStream()));
//            StringBuilder result = new StringBuilder();
//            for (String line; (line = reader.readLine()) != null; ) {
//                if (result.length() > 0) {
//                    result.append(newLine);
//                }
//                result.append(line);
//            }            
//            String txIdOfTransferredContract = result.toString();
            
            InputStreamReader reader
                    = new InputStreamReader(process.getInputStream());
            String txIdOfTransferredContract = new Gson().fromJson(reader, String.class);
            

            if(txIdOfTransferredContract == null || txIdOfTransferredContract.equals("")){
                String concatErrorMsg = printErrorInOutput(process);
                return concatErrorMsg;
            }
//            return signRawTransactionWithWalletModel.getHex();
            return txIdOfTransferredContract;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
        public static String printErrorInOutput(Process process) {
            String concatErrorMsg = new String();
            try {
                //            print error as output
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                
                String line = new String();
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    concatErrorMsg = concatErrorMsg + line + " ";
                }
                return concatErrorMsg; 
            } catch (IOException ex) {
                Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
                return concatErrorMsg; 
            }
        }

    public static String signRawTransactionWithkKey(
            String rawTxHex, // Multisig Raw Transaction Hex
            String walletPrivateKeyLabel, // Buyer/Owner Wallet private key
            String transactionId, // Transaction ID of Contract Sent to Multisig
            long vout, // Vout of Transaction ID of Contract Sent to Multisig
            String scriptPubKey, // Script that locked transaction of Contract Sent to Multisig
            String redeemScript // Multisig Redeem Script 
    ) {
        try {
//            ./bitcoin-cli signrawtransactionwithkey  [ { "txid": "'$utxo_txid'", "vout": '$utxo_vout', "scriptPubKey": "'$utxo_spk'", "redeemScript": "'$redeem_script'" } ] ["cN9bnTYK1ob98Tgy9e43wLJfnEXuo5ZK1T9fYfKdnoRkjm8ie4Ho"]
//            $ ./bitcoin-cli -named signrawtransactionwithkey hexstring=$rawtxhex 
//              prevtxs='''[ { "txid": "'$utxo_txid'", "vout": '$utxo_vout', "scriptPubKey": "'$utxo_spk'", "redeemScript": "'$redeem_script'" } ]''' 
            
            String[] command = new String[]{"/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli",
                "signrawtransactionwithkey", rawTxHex, "[\"" + walletPrivateKeyLabel + "\"]", 
                "[{\"txid\":\"" + transactionId + "\",\"vout\":" + vout + ",\"scriptPubKey\":\"" + scriptPubKey + "\",\"redeemScript\":\"" + redeemScript + "\"}]"};
            
            Process process = Runtime.getRuntime().exec(command); // for Linux

            process.waitFor();

            InputStreamReader reader
                    = new InputStreamReader(process.getInputStream());
            
            SignRawTransactionWithKeyModel signRawTransactionWithKeyModel = new Gson().fromJson(reader, SignRawTransactionWithKeyModel.class);
//            print error as output
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//            String line = new String();
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
            
            if(signRawTransactionWithKeyModel == null){
//            if(signRawTransactionWithWalletModel == null){
                String concatErrorMsg = printErrorInOutput(process);
                return concatErrorMsg;
            }
            
            String signedTx = signRawTransactionWithKeyModel.getHex();
            return signedTx;
//            return null;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static List<ListUnspentModel> listUnspent(String walletName, String walletAddress, double minimumAmount) {
        try {
            
//            "./bitcoin-cli -rpcwallet=legacy_buyer listunspent 6 9999999 [\"midFKFXtqdSN8pRTvdqyqRwx9DUnRgezR5\"] false { \"minimumAmount\": 10 }"
            
//          source of command comments: https://developer.bitcoin.org/reference/rpc/listunspent.html
            String[] command = new String[]{
                "/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli", 
                "-rpcwallet=" + walletName, //wallet name being used
                "listunspent", // command name
                "6", // The minimum confirmations to filter
                "9999999", // The maximum confirmations to filter
                "[\""+ walletAddress+ "\"]", // wallet address to list unspent transactions
                "false", // boolean to "Include outputs that are not safe to spend"
                "{ \"minimumAmount\": " + minimumAmount + "}" // JSON with query options with "minimumAmount" query (Minimum value of each UTXO in BTC)
            };

            Process process = Runtime.getRuntime().exec(command); // for Linux

            process.waitFor();

            InputStreamReader reader
                    = new InputStreamReader(process.getInputStream());
            java.lang.reflect.Type listOfMyClassObject = new TypeToken<ArrayList<ListUnspentModel>>() {}.getType();
            List<ListUnspentModel>  listUnspentModelList = new Gson().fromJson(reader, listOfMyClassObject);
           
            if (listUnspentModelList == null) {
                String concatErrorMsg = printErrorInOutput(process);
                return null;
            }
            
            return listUnspentModelList;
//            return null;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
