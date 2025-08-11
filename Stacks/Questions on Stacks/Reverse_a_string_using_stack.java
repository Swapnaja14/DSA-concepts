// Question 2- Reverse a string using stack

import java.util.*;

public class Reverse_a_string_using_stack {

    public static String reverse_string (Stack<Character> st, String str) {
        int idx = 0;
        while (idx < str.length()) {
            st.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            char curr = st.pop();
            result.append(curr);
        }
        str = result.toString();
        return str;
    }
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String str = "abc";
        String result = reverse_string(st, str);
        System.out.println(result);
    }
}

