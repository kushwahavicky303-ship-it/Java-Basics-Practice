package constructors;

public class Constructor1 {
    public static void main(String args[]){
        System.out.println("welcome to the oops class and consttructors: ");
        Student s1 = new Student();
        System.out.println("Name is: " +s1.name);
        System.out.println("age is: " +s1.age);
        s1.study();
    }
}
class Student{
    String name;
    int age;
    // No-Argument Constructor creation
    Student(){
        name = "aditya";
        age = 21;
    }
    //method/behaviour
    void study(){
        System.out.println("Student is studying:");
    }
}