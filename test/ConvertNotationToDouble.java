
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ssd
 */
public class ConvertNotationToDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String notation = "8.0E-5";
        double d = Double.parseDouble(notation);
        NumberFormat formatter = NumberFormat.getInstance(Locale.US);
        formatter = new DecimalFormat("###.#####");
        String formated = formatter.format(d);
        String formatedWithPunkt = formated.replace(",", ".");
        String t = "test";
    }
    
}
