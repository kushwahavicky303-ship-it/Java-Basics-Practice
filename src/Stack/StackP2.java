package Stack;

import java.util.Stack;

public class StackP2 {
    public static void main(String args[]){
        System.out.println("welcome to the stack questions:");
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        System.out.println("removed top element: " +st.pop());
        st.push(100);
        System.out.println("Removed elements: " +st.pop());
        System.out.println("Current top element: " +st.peek());
        System.out.println("comeplete stack is: " +st);
        System.out.println("the size is: " +st.size());

        



    }
}
