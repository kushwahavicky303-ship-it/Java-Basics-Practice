package collectionFramework;


import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("python");
        list1.add("c++");

        System.out.println("Before clone() method");
        System.out.println(list1);

        //creating a copy of arraylist
        ArrayList<String> list2 = (ArrayList<String>) list1.clone();
        System.out.println("after cloned()");
        System.out.println(list2);
    }
}
//Q1.the return type of clone() is Object.
//Q2.It returns an Object, so we type cast it to ArrayList<String>.
