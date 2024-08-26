/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ssd
 */
public class RegistrerProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("/usr/local/apps/ord-0.16.0/ord --chain regtest --bitcoin-rpc-password rpc --bitcoin-rpc-username rpc wallet inscribe --fee-rate 2 --file /home/ssd/Dropbox/thesis/ordinals_metadata/property.json"); // for Linux
            //Process process = Runtime.getRuntime().exec("cmd /c dir"); //for Windows

            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
