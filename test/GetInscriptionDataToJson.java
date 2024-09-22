
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import solution.model.InscriptionModel;
import solution.model.RegModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ssd
 */
public class GetInscriptionDataToJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
//            bufferedReader = new BufferedReader(new FileReader("/home/ssd/Dropbox/thesis/ordinals_metadata_contract_signning/inscription.json"));
//            InscriptionModel inscriptionModel = new Gson().fromJson(bufferedReader, InscriptionModel.class);
            bufferedReader = new BufferedReader(new FileReader("/home/ssd/Dropbox/thesis/ordinals_metadata_contract_signning/property_sale_contract.json"));
            RegModel regModel = new Gson().fromJson(bufferedReader, RegModel.class);
            String asdf = null;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GetInscriptionDataToJson.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                Logger.getLogger(GetInscriptionDataToJson.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
