

public class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;
    
    public Employee (String n, String num, String date)
    {
        name = n;
        setEmployeeNumber(num);
        hireDate = date;
    }
    public Employee()
    {
        name = " ";
        employeeNumber = " ";
        hireDate = " ";
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setEmployeeNumber(String e)
    {
        if (isValidEmpNum(e))
            employeeNumber = e;
        else
            employeeNumber = " ";
    }
    public void setHireDate(String h)
    {
        hireDate = h;
    }
    public String getName()
    {
        return name;
    }
    public String getEmployeeNumber()
    {
        return employeeNumber;
    }
    public String getHireDate()
    {
        return hireDate;
    }
    private boolean isValidEmpNum(String e)
    {
        boolean status = true;
        if (e.length() != 5)
            status = false;
        else
        {
        
            if ((!Character.isDigit(e.charAt(0)))  ||
                (!Character.isDigit(e.charAt(1)))  ||
                (!Character.isDigit(e.charAt(2)))  ||
                (e.charAt(3) != '-')               ||
                (Character.toUpperCase(e.charAt(4)) < 'A') ||
                (Character.toUpperCase(e.charAt(4)) > 'M'))
                 status = false;
        }
            
        return status;
    }
    
    public String toString()
    {
        String str = "Name: " + name + "\nEmployee Number: ";
        if (employeeNumber == " ")
            str += "Invalid employee number";
        else
            str += employeeNumber;
        str += "\nHire Date: " + hireDate;
        return str;
    }
}
