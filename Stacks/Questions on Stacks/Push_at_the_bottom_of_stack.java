// Question 1: Push at the bottom of stack

import java.util.*;
public class Push_at_the_bottom_of_stack {

    public static void push_bottom (Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        push_bottom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        push_bottom(st, 4);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }    
}
