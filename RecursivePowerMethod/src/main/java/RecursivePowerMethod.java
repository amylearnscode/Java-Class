
import javax.swing.JOptionPane;
/*
 *
 * @author amy
 */
public class RecursivePowerMethod {
    
    public static void main(String[] args){
       
        int baseNumber, expNumber;
        String input;
        
        input = JOptionPane.showInputDialog("Enter a base number"); 
        baseNumber = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter a non negative exponent: ");
        expNumber = Integer.parseInt(input);
         JOptionPane.showMessageDialog(null, baseNumber + " raised to the power of " +
                expNumber + " = " + raisePower(baseNumber, expNumber));
    }
    public static long raisePower(int base, int exp){
        if (exp > 0){
            return base * raisePower(base, exp - 1);
        }
        else {
            return 1;
        }
    }
}
