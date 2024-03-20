class Employee {
    String name;
    int empid;
    double salary;

    public Employee() {
    }

    public Employee(String n, int eid, double s) {
        name = n;
        empid = eid;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }
}

class Manager extends Employee {
    String department;

    public Manager(String n, int eid, double s, String d) {
        name = n;
        empid = eid;
        salary = s;
        department = d;
    }

    public String getDepartment() {
        return department;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tushar", 1001, 150000);
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Salary: " + emp1.getSalary());
        emp1.increaseSalary(10);
        System.out.println("Employee Salary after 10% increase: " + emp1.getSalary());

        Manager mgr1 = new Manager("Vansh", 54321, 175000.0, "Engineering");
        System.out.println("\nManager Name: " + mgr1.getName());
        System.out.println("Manager Salary: " + mgr1.getSalary());
        System.out.println("Manager Department: " + mgr1.getDepartment());

		System.out.println("Vedant Solanki\nSapID: 500121550\nRoll. No. : R271223004");
}
}