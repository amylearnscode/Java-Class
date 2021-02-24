
public class WorkerDemo {

    public static void main(String[] args)
    {
        ProductionWorker pw =
        new ProductionWorker ("Homer Simpson", "123-A", "2-14-2020",
                                ProductionWorker.DAY_SHIFT, 16.50);
        
        System.out.println("First worker: ");
        System.out.println(pw);
        
        ProductionWorker pw2 =
                new ProductionWorker();
        pw2.setName("Marge Simpson");
        pw2.setEmployeeNumber("123-B");
        pw2.setHireDate("1-23-2020");
        pw2.setShift(ProductionWorker.NIGHT_SHIFT);
        pw2.setPayRate(20.00);
        
        System.out.println("Second worker: ");
        System.out.println(pw2);
        
    }
}
