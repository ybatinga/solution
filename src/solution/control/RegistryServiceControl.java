/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.control;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import solution.model.OrdInscribedDataModel;

/**
 *
 * @author ssd
 */
public class RegistryServiceControl {
    
    public static void registerNewPropertyOrContract(String filePath) throws IOException, InterruptedException {

        Process process = Runtime.getRuntime().exec("/usr/local/apps/ord-0.16.0/ord --chain regtest --bitcoin-rpc-password rpc --bitcoin-rpc-username rpc wallet inscribe --fee-rate 2 --file " + filePath); // for Linux
            //Process process = Runtime.getRuntime().exec("cmd /c dir"); //for Windows

            process.waitFor();
            
            InputStreamReader reader =
                    new InputStreamReader(process.getInputStream());
            OrdInscribedDataModel ordInscribedDataModel = new Gson().fromJson(reader, OrdInscribedDataModel.class);
            
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = new String();
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
    }
}
