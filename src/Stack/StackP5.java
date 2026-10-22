package Stack;

import java.util.Stack;

public class StackP5 {
    public static void main(String args[]){
        System.out.println("Welcome to the hard stack questions:");
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        int first = st.pop();
//        int add= first;
//        st.push(add);

        System.out.println("Cheking stack " +st.isEmpty());
        st.push(100);
        st.push(200);
        int second = st.pop();
        int third = st.pop();
        int sum = first+second+third;
        st.push(sum);
        System.out.println("first removed element: " +first);
        System.out.println("second reoved element: " +second);
        System.out.println("third removed element: " +third);
        System.out.println("total sum is: " +sum);
        System.out.println("Complete stack is: " +st);
        System.out.println("size is:" +st.size());




    }
}
