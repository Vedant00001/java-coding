class worker{
    String name;
    double salaryRate;
    double Pay;
    void set(String n, double r){
        name = n;
        salaryRate = r;
    }

    void  display(){
        System.out.println("Name: "+name);
        System.out.println("Salary Rate: "+salaryRate);
        System.out.println("Pay: "+Pay);
        System.out.println();
    }
}

class DailyWorker extends worker{
    public DailyWorker(String n, double r){
        set(n, r);
    }
    public void ComPay(int days){
        Pay = salaryRate * days;
        System.out.println("No. of Working days: "+days);
    }
}

class SalariedWorker extends worker{
    public SalariedWorker(String n, double r){
        set(n, r);
    }
    public void ComPay(int hours){
        if(hours < 40){
            Pay = salaryRate * hours;
        }
        else{
            Pay = salaryRate * 40;
        }
        System.out.println("No. of Working hours in a week: "+hours);

    }
}

class TestWorker{
    public static void main(String[] args) {
        DailyWorker w1 = new DailyWorker("Tushar",100);
        w1.ComPay(10);
        w1.display();
        SalariedWorker w2 = new SalariedWorker("Tushar",100);
        w2.ComPay(70);
        w2.display();
		System.out.println("Vedant Solanki\nSapID: 500121550\nRoll. No. : R271223004");
   }
}
