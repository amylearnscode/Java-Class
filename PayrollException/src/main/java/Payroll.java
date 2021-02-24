/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amy
 */
public class Payroll {
    private String name;
    private int idNumber;
    private double hourlyPay;
    private double hoursWorked;
    
    public String getName(){
        return name;
    }
    public int getidNumber(){
        return idNumber;
    }
    public double gethourlyPay(){
        return hourlyPay;
    }
    public double gethoursWorked(){
        return hoursWorked;
    }
    public void setName(String nameGiven) throws InvalidEmployeeName{
        if (nameGiven.isEmpty())
            throw new InvalidEmployeeName();
        else
            name = nameGiven;
    }
     public void setidNumber(int idNumberGiven) throws InvalidEmployeeId{
         if (idNumberGiven < 0)
             throw new InvalidEmployeeId();
         else
             idNumber = idNumberGiven;
    }
     public void sethoursWorked(double hoursGiven) throws InvalidHoursWorked{
         if (hoursGiven < 0 || hoursGiven > 84)
             throw new InvalidHoursWorked();
         else
             hoursWorked = hoursGiven;
    }
     public void sethourlyPay(double payGiven) throws InvalidHourlyPay{
         if (payGiven < 0 || payGiven > 25)
             throw new InvalidHourlyPay();
         else
            hourlyPay = payGiven;
    }
    public double calculateGrossPay(){
        return hoursWorked * hourlyPay;
    }
    public Payroll(String nameGiven, int idNumberGiven,
            double payGiven, double hoursGiven) throws InvalidEmployeeName,
                                                       InvalidEmployeeId,
                                                       InvalidHoursWorked,
                                                       InvalidHourlyPay{
        //name = nameGiven;
        //idNumber = idNumberGiven;
        setName(nameGiven);
        setidNumber(idNumberGiven);
        sethourlyPay(payGiven);
        sethoursWorked(hoursGiven);
    }
    
     
    
}
