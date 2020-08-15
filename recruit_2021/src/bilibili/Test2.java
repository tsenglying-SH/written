package bilibili;

import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        String ss="{[]}";
        boolean b = IsValidExp(ss);
        System.out.println(b);
    }

    public static boolean IsValidExp(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }


}
