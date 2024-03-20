package Experiment5;

class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return 0;
    }
}

class DailyWorker extends Worker {
    int daysWorked;

    public DailyWorker(String name, double salaryRate, int daysWorked) {
        super(name, salaryRate);
        this.daysWorked = daysWorked;
    }

    public double computePay(int hours) {
        return salaryRate * daysWorked;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double computePay(int hours) {
        return salaryRate * 40;
    }
}

public class Solution3 {
    public static void main(String[] args) {
        System.out.println("Vedant Solanki \n Sapid=500121550");
        Worker dailyWorker = new DailyWorker("Pradumb", 100000.0, 5);
        Worker salariedWorker = new SalariedWorker("Dhyani", 15000.0);

        System.out.println("pay for daily worker" + dailyWorker.computePay(0));
        System.out.println(" pay for Salaried Worker" + salariedWorker.computePay(0));
    }
}
