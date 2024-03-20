import java.util.Scanner;

class Student {
    String name;
    int accountNo;
    double amount;

    public void insertData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name");
        name = s.next();
        System.out.println("Enter account no");
        accountNo = s.nextInt();
        System.out.println("Enter amount");
        amount = s.nextDouble();
       
    }

    public void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit");
        double depositAmount = s.nextDouble();
        amount += depositAmount;
        showBalance();
       
    }

    public void withdraw() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        double withdrawAmount = s.nextDouble();
        if (withdrawAmount <= amount) {
            amount -= withdrawAmount;
          
        } else {
            System.out.println("not enough balance");
        }
        showBalance();
        
    }

    public void showBalance() {
        System.out.println(" Balance is "  + amount);
    }
}

public class TestAccount1 {
    public static void main(String args[]) {
        Student student = new Student();
        student.insertData();

        student.deposit();
        student.withdraw();
    }
}
