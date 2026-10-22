package objectorientedprogram;

public class statickeyword1 {
    public static void main(String[] args){
        System.out.println("welcome to static keywords :");

        Student s1 = new Student("aditya",19,101);
        Student s2 = new Student("umar", 22,102);
       // Student.college = "IIT GUHAWATI";

        System.out.println(s1.name + "," +s1.age+"," +s1.rollnumber+ "," +Student.college);
        System.out.println(s2.name + "," +s2.age+"," +s2.rollnumber+ "," +Student.college);
    }
}
class Student {  //class name Student
    String name;
    int age;
    int rollnumber;
    static String college;
    //static int grade;

    Student(String name, int age, int rollnumber){   //constructor
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
    }
    //static variaables
    static{
        college = "IIT Guhawati";
    }

}
