/*
 
 */
package SentenceCapitalizer;

import javax.swing.JOptionPane;

/**
 *
 * @author amy
 */
public class SentenceCapitalizer 
{
    public static void main(String[] args)
    {
        String input;
        input = JOptionPane.showInputDialog("Enter a string");
        JOptionPane.showMessageDialog(null, sentenceCap(input));
        
        System.exit(0);
        
    }
    

public static String sentenceCap(String str)
{
    int i;
    StringBuilder temp = new StringBuilder(str);
    if (temp.length() > 0)
        temp.setCharAt(0, Character.toUpperCase(temp.charAt(0)));
    i = temp.indexOf(". ");
    while (i != -1)
    {
        i++;
        while (i < temp.length() && temp.charAt(i) == ' ')
            i++;
         temp.setCharAt(i, Character.toUpperCase(temp.charAt(i)));
         i = temp.indexOf(". ", i);
    }
    return temp.toString();
}
}
