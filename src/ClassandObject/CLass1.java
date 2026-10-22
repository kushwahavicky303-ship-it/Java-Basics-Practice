package ClassandObject;

public class CLass1 {
        public static void main(String args[]){
            System.out.println("welcome to the oops class:");
            //objects creation
            Student s1 = new Student();
            s1.name ="Aditya";
            s1.age = 21;

            Student s2 = new Student();
            s2.name = "Vishal";
            s2.age = 22;

            System.out.println(s1.name);
            System.out.println(s1.age);
            s1.study();

            System.out.println(s2.name);
            System.out.println(s2.age);
            s2.study();

        }
    }
    class Student {
        String name;
        int age;
        void study(){
            System.out.println("Students are studying: ");
        }
    }
    
