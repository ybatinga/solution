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
import solution.model.GetAddressInfoModel1;

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
            OrdInscribedDataModel ordInscribedDataModel1 = new OrdInscribedDataModel();
            OrdInscribedDataModel.Inscription inscription = ordInscribedDataModel1.new Inscription();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            inscription.setID(bufferedReader.lines().toString());
           
            //            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            
//        String line = new String();
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
            return ordInscribedDataModel1;
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
    
    public static CreateMultisigModel createMultisigAddress_(String buyerPublicKey, String ownerPublicKey){
        
        try {
            HttpClient client = HttpClient.newHttpClient();
            
            String credentials = "rpc" + ":" + "rpc";
            String auth = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
            
            
            String asdf = new String();
            asdf = "{\"jsonrpc\": \"1.0\", \"id\": \"curltest\", \"method\": \"createmultisig\", \"params\": [2, [\"" + buyerPublicKey + "\\\",\\\"" + ownerPublicKey + "\"]]}";
//            asdf = "{\"jsonrpc\": \"1.0\", \"id\": \"curltest\", \"method\": \"createmultisig\", \"params\": [2, [\\\"03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd\\\",\\\"03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626\\\"]\"]}";
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:18443/"))
//                    .POST(BodyPublishers.ofString("{\"jsonrpc\": \"1.0\", \"id\": \"curltest\", \"method\": \"createmultisig\", \"params\": [2, \"keys\":\"[\\\"03eff92e93ad5443d8636da5233820426871eab2640cc3c48734a31ba388d843b2\\\",\\\"03ebbedbaf6d6b0add5de2f698631eb5b0a2b2e13f7f878cc9646c11512779d790\\\"]\"]}"))
                    .POST(BodyPublishers.ofString(asdf))
                    .setHeader("content-type", "text/plain;")
                    .setHeader("authorization", auth)
                    .build();
            
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body().toString();
            
            CreateMultisigModel createMultisigResultModel = new Gson().fromJson(json, CreateMultisigModel.class);
               
            return createMultisigResultModel;
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
    
    
    
}
