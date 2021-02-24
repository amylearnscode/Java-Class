public class WorkerDemo {

    public static void main(String[] args)
            
    {
       createWorker("John Smith", "123-A", "11-25-2017",
                    ProductionWorker.DAY_SHIFT, 16.50);
       System.out.println();
       System.out.println("Attempting an invalid employee number.");
       
       createWorker("Homer Simpson", "123", "02-12-2020",
                   ProductionWorker.DAY_SHIFT, 16.50);
       
       System.out.println();
       System.out.println("Attempting an invalid shift number.");
       
       createWorker("Homer Simpson", "123-A", "02-12-2020",
                   35, 16.50);
       
       System.out.println();
       System.out.println("Attempting an invalid pay rate.");
       
       createWorker("Homer Simpson", "123-A", "02-12-2020",
                   ProductionWorker.DAY_SHIFT, -47.00);
    }

       






public static void createWorker(String n, String num, String date,
                                        int sh, double rate)
       {
           ProductionWorker pw;
           try
           {
               pw = new ProductionWorker(n, num, date, sh, rate);
               System.out.println("Object created");
               System.out.println(pw);
           }
           catch (InvalidEmployeeNumber e)
           {
               System.out.println(e.getMessage());
           }
           catch (InvalidShift e)
           {
               System.out.println(e.getMessage());
           }
           catch (InvalidPayRate e)
           {
               System.out.println(e.getMessage());
           }
       }
                                            
    }

