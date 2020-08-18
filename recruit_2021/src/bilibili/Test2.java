package bilibili;

import java.util.Stack;

<<<<<<< HEAD
public class Test2 {
    public static void main(String[] args) {
        String ss="{[]}";
        boolean b = IsValidExp(ss);
        System.out.println(b);
    }

    public static boolean IsValidExp(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
=======
/**
 * @ClassName Test2
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/14 8:58
 * @Version 1.0
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 来源：力扣（LeetCode）20
 */
public class Test2 {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
>>>>>>> acf08fa6a0ed2c9a865add7a2efeac1099143210
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
<<<<<<< HEAD


}
=======
}
//思路：用辅助栈结构进行判断
>>>>>>> acf08fa6a0ed2c9a865add7a2efeac1099143210
