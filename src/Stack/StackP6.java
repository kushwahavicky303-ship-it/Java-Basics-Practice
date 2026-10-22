package Stack;

import java.util.Stack;

public class StackP6 {
    public static void main(String args[]){
        System.out.println("welcome to the stach hard questions:");
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("original stack is: " +st);
        int store1  = st.peek();
        int removed1 = st.pop();
        st.push(60);
        st.push(70);
        int removed2 = st.pop();
        int sum = removed1+removed2;
        st.push(sum);
        System.out.println("original stack: " +st);
        System.out.println("peeked elements: " +store1);
        System.out.println("removed1 element: " +removed1);
        System.out.println("removed2 element: " +removed2);
        System.out.println("sum: " +sum);
        System.out.println("comeplete stack is:" +st);
        System.out.println("stack size: " +st.size());




    }
}
