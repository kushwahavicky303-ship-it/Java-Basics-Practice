package encapsulation;

public class Encapsulation6 {
    public static void main(String args[]){
        System.out.println("welcome to the encapsulation hard questions:");
        Employee e1 = new Employee();

        e1.setName("Aditya");
        e1.setDepartment("IT");
        e1.setSalary(50000);

        e1.addBonus(10000);
        e1.deductSalary(5000);

        System.out.println("Name: " + e1.getName());
        System.out.println("Department: " + e1.getDepartment());
        System.out.println("Final Salary: " + e1.getSalary());

        // Invalid tests
        e1.addBonus(-2000);
        e1.deductSalary(100000);
    }
}
class Employee{
    private String name;
    private double salary;
    private String department;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setSalary(double salary){
        if(salary>0){
            this.salary = salary;
        }
        else{
            System.out.println("Invalid salary");
        }
    }
    double getSalary(){
        return salary;
    }
    void setDepartment(String department) {
        this.department = department;
    }

    // Getter
    String getDepartment() {
        return department;
    }
    //behavious:
    void addBonus(double bonus) {
        if (bonus > 0) {
            salary = salary + bonus;
        } else {
            System.out.println("Invalid bonus");
        }
    }
    void deductSalary(double amount) {
        if (amount > 0 && amount <= salary) {
            salary = salary - amount;
        } else {
            System.out.println("Invalid deduction");
        }
    }
}
