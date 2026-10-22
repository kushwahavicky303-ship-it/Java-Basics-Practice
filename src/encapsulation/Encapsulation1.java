package encapsulation;

public class Encapsulation1 {
    public static void main(String args[]){
        System.out.println("welcomew to the Encapsultaion: ");
        Student s1 = new Student();
        s1.setName("aditya");
        s1.setAge(21);
        s1.setMarks(88.4);
        System.out.println("name is: " +s1.getName());
        System.out.println("Age is: " +s1.getAge());
        System.out.println("marks are: " +s1.getMarks());
    }
}
class Student{
    private String name;
    private int age;
    private double marks;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void   setMarks(double marks){
        this.marks = marks;
    }
    double getMarks(){
        return marks;
    }

}
