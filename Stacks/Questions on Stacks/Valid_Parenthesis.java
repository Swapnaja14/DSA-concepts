import java.util.*;

public class Valid_Parenthesis {

    public static boolean isValid (String str) {
        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                // closing
                if (st.isEmpty()) {
                    return false;
                }
                if ((ch==')' && st.peek() == '(') || (ch=='}' && st.peek() == '{') || (ch==']' && st.peek() == '[')) {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        String str = "({[]}())";
        System.out.println(isValid(str));
    }
}
