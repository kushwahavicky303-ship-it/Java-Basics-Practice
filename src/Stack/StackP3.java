package Stack;

import java.util.Stack;

public class StackP3 {
    public static void main(String args[]){
        System.out.println("welocme to the stack practice questions:");
        Stack<String> st = new Stack<>();
        st.push("Java");
        st.push("Python");
        st.push("C++");
        st.push("JavaScript");
        System.out.println("top element:" +st.peek());
        System.out.println("Removed element: " +st.pop());
        st.push("SQL");
        System.out.println("current top element: " +st.peek());
        System.out.println("Complete stack: " +st);
        System.out.println("size of stack is: " +st.size());

    }
}
