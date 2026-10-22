package Abstraction1;

public class Abstraction2 {
    public static void main(String args[]) {

        System.out.println("Welcome to the abstract classes");

        Employee e1 = new FullTimeEmployee("Aditya");
        Employee e2 = new PartTimeEmployee("Rahul", 100, 200);

        e1.displayName();
        e1.calculateSalary();

        e2.displayName();
        e2.calculateSalary();
    }
}

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();

    void displayName() {
        System.out.println("Employee's name: " + name);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary: " + 50000);
    }
}

class PartTimeEmployee extends Employee {

    int hours;
    int rate;

    PartTimeEmployee(String name, int hours, int rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary: " + (hours * rate));
    }
}