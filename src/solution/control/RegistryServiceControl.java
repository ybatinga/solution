/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.control;

import com.google.gson.Gson;
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
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import solution.model.BitcoinCliStringResultModel;
import solution.model.CreateMultisigModel;
import solution.model.DecodeRawTransactionModel;
import solution.model.GetAddressInfoModel1;
import solution.model.GetRawTransactionModel;
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
        
        if(ordInscribedDataModel == null){
            OrdInscribedDataModel ordInscribedDataModelError = new OrdInscribedDataModel();
            OrdInscribedDataModel.Inscription inscription = ordInscribedDataModelError.new Inscription();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            inscription.setID(bufferedReader.readLine());
            ordInscribedDataModelError.getInscriptions().add(inscription);
           
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));    
//        String line = new String();
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
            return ordInscribedDataModelError;
        }
            
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

    public static String createRawTransaction(String txId, long vout, String recipientAddress) {
        try {
            String[] command = new String[]{"/usr/local/apps/bitcoin-25.0/bin/bitcoin-cli", "createrawtransaction",
//                        "[{\"txid\":\"" + txId + "\",\"vout\":0}]", "[{\"" + recipientAddress + "\":0.01}]"};
                        "[{\"txid\":\"" + txId + "\",\"vout\":" + txId + "}]", "[{\"" + recipientAddress + "\":0.00009000}]"};            

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

            return decodeRawTransactionModel.getTxid();
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
//            if(signRawTransactionWithWalletModel == null){
                printErrorInOutput(process);
                return null;
            }
//            return signRawTransactionWithWalletModel.getHex();
            return txIdOfTransferredContract;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
        public static void printErrorInOutput(Process process) {
            try {
                //            print error as output
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                String line = new String();
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(RegistryServiceControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    
}
