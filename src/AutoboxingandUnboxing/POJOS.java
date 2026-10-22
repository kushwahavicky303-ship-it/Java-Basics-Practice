package AutoboxingandUnboxing;

public class POJOS {
    public static void main(String[] args) {
        System.out.println("welcome to pojos classes:");
        Student s1 = new Student();
        s1.setName("aditya");
        s1.setCollege("iit kanpur:");
        s1.setAge(19);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getCollege());
    }
}
class Student{
    private String name;
    private String college;
    private int age;
    Student(){
    }
    //getters method
    public String getName(){
        return name;
    }
    public String getCollege(){
        return college;
    }
    public int getAge(){
        return age;
    }
    //setters method
    void setName(String name){
        this.name = name;
    }
    public void setCollege(String college){
        this.college = college;

    }
    public void setAge(int age){
        this.age = age;
    }

}
