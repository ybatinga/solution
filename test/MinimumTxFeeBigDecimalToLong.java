
import java.math.BigDecimal;
import java.math.RoundingMode;
import solution.service.StringsService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ssd
 */
public class MinimumTxFeeBigDecimalToLong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigDecimal minimumAmount = new BigDecimal("0.195").setScale(5, RoundingMode.DOWN);
        BigDecimal minimumAmountConsideringTxFee = minimumAmount.add(new BigDecimal("0.00001").setScale(5, RoundingMode.DOWN));
        System.out.println(minimumAmountConsideringTxFee.doubleValue());
        
        
        
        
    }
    
}
