abstract class Employee {
    String name;
    double salary;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }

    void calculateSalary() {
        salary = 50000 + bonus;
    }

    void displayInfo() {
        System.out.println("Manager Name: " + name + ", Salary: " + salary);
    }
}

class Programmer extends Employee {
    int projects;

    Programmer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    void calculateSalary() {
        salary = 40000 + (projects * 2000);
    }

    void displayInfo() {
        System.out.println("Programmer Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 10000);
        manager.calculateSalary();
        manager.displayInfo();

        Employee programmer = new Programmer("Bob", 3);
        programmer.calculateSalary();
        programmer.displayInfo();
    }
}