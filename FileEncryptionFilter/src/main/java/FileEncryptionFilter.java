
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileEncryptionFilter{
    

public static void main(String [] args) throws FileNotFoundException {
    File file = new File("Programming2.txt");
    Scanner inputfile = new Scanner(file);
    
    PrintWriter outputfile = new PrintWriter("Programming3.txt");
    while (inputfile.hasNext())
    {
        String str = inputfile.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int code = (int)ch;
            char c = (char)(code - 10);
            
            outputfile.print(c);
        }
        outputfile.println();
    }
    inputfile.close();
    outputfile.close();
    
}
}
