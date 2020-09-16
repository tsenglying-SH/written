package xiaomi0915;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/15 19:40
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            boolean valid = isValid(s);
            System.out.println(valid);
        }
    }

    public static  boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
                stack.push(s.charAt(i));

            }else {
                if(stack.isEmpty()) {
                    return false;
                }
                if(s.charAt(i)==')'&&stack.pop()!='(') {
                    return false;
                }
                if(s.charAt(i)==']'&&stack.pop()!='[') {
                    return false;
                }
                if(s.charAt(i)=='}'&&stack.pop()!='{') {
                    return false;
                }
            }

        }

        return stack.isEmpty();

    }
}
