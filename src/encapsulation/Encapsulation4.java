package encapsulation;

public class Encapsulation4 {
    public static void main(String args[]){
        System.out.println("welcome to the encapsulation: ");
        Animal a1 = new Animal();
        a1.setName("Tommy");
        a1.setSpecies("Dog");
        a1.setAge(-3);
        System.out.println("Name is: " +a1.getName());
        System.out.println(("Species is: " +a1.getSpecies()));
        System.out.println("Age is: " +a1.getAge());
        a1.setAge(5);
        System.out.println("Age is: "+a1.getAge());
    }
}
class Animal{
    private String name;
    private String species;
    private int age;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setSpecies(String Species){
        this.species = species;
    }
    String getSpecies(){
        return species;
    }
    void setAge(int age){
        if(age>=0){
            this.age = age;
        }
        else {
            System.out.println("Invalidd Age:");
        }
    }
    int getAge(){
        return age;
    }

}