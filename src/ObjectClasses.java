public class ObjectClasses {
    public static void main(String args[]){
        System.out.println("welcome to object classes:");
        Student s1 = new Student();
        s1.name = "aditya";
        s1.age =32;
        System.out.println(s1);
    }
}
class Student{
    String name;
    int age;
    @Override
    public String toString(){
        return (name+ "," +age);
    }
}
