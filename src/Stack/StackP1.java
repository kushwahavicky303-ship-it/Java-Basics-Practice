package Stack;

import java.util.Stack;

public class StackP1 {
    public static void main(String args[]){
        System.out.println("welcome to the stack practices:");
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //operations
        st.push(100);
        System.out.println("remove top" +st.pop());
        System.out.println("print top" +st.peek());
        System.out.println("compelete stack is: " +st);
        System.out.println("the size of stack is: " +st.size());

    }
}
