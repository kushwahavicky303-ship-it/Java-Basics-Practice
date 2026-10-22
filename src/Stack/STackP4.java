package Stack;

import java.util.Stack;

public class STackP4 {
    public static void main(String args[]){
        System.out.println("welocme to the stack hard questions:");
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int first = st.pop();
        int second = st.pop();
        int sum = first +second;
        st.push(sum);
        System.out.println("First removed element: " +first);
        System.out.println("second removed element: " +second);
        System.out.println("sum: " +sum);
        System.out.println("complete stack:" +st);
        System.out.println("size of the stack: " +st.size());
    }
}
