package collectionFramework;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(10);
        st.push(15);

        System.out.println(st.pop());

        st.push(20);

        System.out.println(st.peek());

        System.out.println(st.pop());

        System.out.println(st);

}
}
