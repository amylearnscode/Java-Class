
import java.util.Scanner;


public class VowelsandConsonants 
{
    
    public static void main(String[] args)
    {
        do{
        String input;
        String option;
        char userChoice;
        char letter;
        char exit;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter a string of text: \n");
        input = keyboard.nextLine();
        input = input.toLowerCase();
        System.out.println();
        
        userMenu();
        
        option = keyboard.nextLine();
        option = option.toUpperCase();
        userChoice = option.charAt(0);
        
        
        
        
        switch (userChoice)
        {
          case 'A':
              System.out.println("Number of vowels: " + vowelCount(input));
              break;
          case 'B':
              System.out.println("Number of consonants: " + conCount(input));
              break;
          case 'C':
              System.out.println("Number of vowels and consonants: "
                      + conCount(input) + vowelCount(input));
              break;
          case 'D':
              System.out.println("Enter a new string: ");
              break;
          case 'E':
              System.exit(0);
              break;
          default:
              System.out.println("Please enter a valid selection");
              break;
      }
        }while (true);
       
        
}
    public static int vowelCount(String str)
    {
        int vcount = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u'){
                vcount++;
            }
            
        }
        return vcount;
    }
               
        
    public static int conCount(String str)
    {
        int ccount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u'){
                ccount++;
            }
        
        }
        return ccount;
    }
        
    
    public static void userMenu(){
        
        System.out.print("Enter A to count vowels,\n"
                + " Enter B to count consonants,\n"
                + " Enter C to count both,\n"
                + "Enter D to enter a new string. \n"
                + "Enter E to exit \n");
    }
}
