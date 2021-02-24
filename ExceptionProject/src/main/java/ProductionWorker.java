public class ProductionWorker extends Employee {
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
    
    private int shift;
    private double payRate;
    
    public ProductionWorker(String n, String num, String date,
                            int sh, double rate)
                            throws InvalidEmployeeNumber,
                                   InvalidShift,
                                   InvalidPayRate
    {
        super(n, num, date);
        
        setShift(sh);
        setPayRate(rate);
    }
    public ProductionWorker()
    {
        super();
        shift = DAY_SHIFT;
        payRate = 0.0;
    }
    public void setShift(int s) throws InvalidShift
    {
        if (s != DAY_SHIFT && s != NIGHT_SHIFT)
            throw new InvalidShift();
        else
            shift = s;
    }
    public void setPayRate(double p) throws InvalidPayRate
    {
        if (p < 0)
            throw new InvalidPayRate();
        else
            payRate = p;
    }
    public int getShift()
    {
        return shift;
    }
    public double getPayrate()
    {
        return payRate;
    }
    public String toString()
    {
        String str = super.toString();
        str += "\nShift: ";
        if (shift == DAY_SHIFT)
            str += "Day";
        else if (shift == NIGHT_SHIFT)
            str += "night";
        else
            str += "Invalid shift number.";
        str += ("\n Hourly Pay rate: $" + payRate);
        
        return str;
               
    }
}

