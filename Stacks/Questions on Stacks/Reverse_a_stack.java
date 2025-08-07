import java.util.*;

public class Reverse_a_stack {

    public static void reverse (Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverse (st);
        push_bottom(st, top);
    }

    public static void push_bottom (Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        push_bottom(st, data);
        st.push(top);
    }

    public static void print (Stack<Integer> st) {
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        reverse(st);
        System.out.println("After reversing- ");
        print(st);
    }
}
