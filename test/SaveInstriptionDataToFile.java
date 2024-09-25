
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import solution.control.RegistryServiceControl;
import solution.model.InscriptionModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ssd
 */
public class SaveInstriptionDataToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Writer writer = null;
        try {
            InscriptionModel inscriptionModel = RegistryServiceControl.getInscriptionData("e39367db30ee904399ec233d89653ace065219f4ed44b99d1ec1136cc4754a28i0");
            writer = new FileWriter("/home/ssd/Dropbox/thesis/ordinals_metadata_contract_signning/inscription.json");
            Gson gson = new Gson();
            gson.toJson(inscriptionModel, writer);
//            Gson gson = new Gson();
//            gson.toJson(person, writer);
        } catch (IOException ex) {
            Logger.getLogger(SaveInstriptionDataToFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(SaveInstriptionDataToFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
