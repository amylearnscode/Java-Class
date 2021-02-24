/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amy
 */
import javax.swing.JOptionPane;

public class PayrollDemo {
    public static void main (String [] args) throws InvalidHourlyPay,
                                                    InvalidHoursWorked,
                                                    InvalidEmployeeName,
                                                    InvalidEmployeeId{
     
        String userInputString;
        String userName;
        int userId;
        double userHourlyPay;
        double userHoursWorked;
        userName = JOptionPane.showInputDialog("Enter the name: ");
        userInputString = JOptionPane.showInputDialog("Enter the Id number: ");
        userId = Integer.parseInt(userInputString);
        userInputString = JOptionPane.showInputDialog("Enter the hourly pay rate: ");
        userHourlyPay = Double.parseDouble(userInputString);
        userInputString = JOptionPane.showInputDialog("Enter the number of hours worked: ");
        userHoursWorked = Double.parseDouble(userInputString);
        Payroll payroll;
        try{
            
        payroll = new Payroll(userName, userId, userHourlyPay, userHoursWorked);
        }
        catch (InvalidEmployeeName e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidEmployeeId e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidHourlyPay e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidHoursWorked e)
        {
            System.out.println(e.getMessage());
        }
       // System.out.println(payroll1.getName() + 
                //" has a gross pay of: " + payroll1.calculateGrossPay());*/
        
        
    }
}
