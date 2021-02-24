
import javax.swing.JOptionPane;



public class PalindromeDetector {
     private static boolean status = true;
        public static void main(String[] args)
   {
       String input;  
       input = JOptionPane.showInputDialog("Enter a string to see"
               + " if it's a palindrome!");
         String input2 = input.toLowerCase();
       if (isPalindrome(input2, 0, input.length()-1))
           JOptionPane.showMessageDialog(null,
                   input + " is a palindrome!");
       else 
            JOptionPane.showMessageDialog(null,
                   input + " is not palindrome!");
                                        
        
}
        public static boolean isPalindrome(String s, int pos, int maxSize){
            if (pos < maxSize){
                if (s.charAt(pos)== s.charAt(maxSize)){
                    status = true;
                    return isPalindrome(s, pos +1, maxSize -1);
                }else{
 
                    return false;
                        }
            }else {
                   return status;
                        
                }
            }
        }
        

