package huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName Question3
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/7/22 17:49
 * @Version 1.0
 * 【题目描述】 仿LISP运算
 *  LISP语言唯一的语法就是括号要配对。
 *  形如 (OP P1 P2 …)，括号内元素由单个空格分割。
 *  其中第一个元素OP为操作符，后续元素均为其参数，参数个数取决于操作符类型
 *  注意：参数 P1, P2 也有可能是另外一个嵌套的 (OP P1 P2 …)
 *  当前OP类型为add/sub/mul/div(全小写)，分别代表整数的加减乘除法。简单起见，所以OP参数个数为2
 * 举例
 *   输入：(mul 3 -7)输出：-21
 *   输入：(add 1 2) 输出：3
 *   输入：(sub (mul 2 4) (div 9 3)) 输出 ：5
 *   输入：(div 1 0) 输出：error
 * 输入描述：
 *   合法C字符串，字符串长度不超过512，用例保证了无语法错误
 * 输出描述：
 *   合法C字符串，字符包括’0’-‘9’及负号’-‘或者’error’
 **/
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solutionLISP(str);
        sc.close();
    }

    //(sub (mul 2 4) (div 9 3))
    private static void solutionLISP(String str) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> opraStack = new Stack<>();
        int mark = 0;
        int paramOne = 0;
        int paramTwo = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                opraStack.push(str.substring(i + 1, i + 4));
                i += 4;
                mark = i + 1;
            } else if (str.charAt(i) == ')') {
                if (mark < i) {
                    numStack.push(Integer.valueOf(str.substring(mark, i)));
                    i++;
                    mark = i + 1;
                }
                paramTwo = numStack.pop();
                paramOne = numStack.pop();
                calc(numStack, opraStack, paramOne, paramTwo);
            } else {
                if (str.charAt(i) == ' ') {
                    if (mark < i) {
                        numStack.push(Integer.valueOf(str.substring(mark, i)));
                        mark = i + 1;
                    }
                }
            }
        }
        while (!opraStack.isEmpty()) {
            paramTwo = numStack.pop();
            paramOne = numStack.pop();
            calc(numStack, opraStack, paramOne, paramTwo);
        }
        System.out.println(numStack.pop().toString());
    }


    private static void calc(Stack<Integer> numStack, Stack<String> opraStack, int paramOne, int paramTwo) {
        switch (opraStack.pop()) {
            case "add":
                numStack.push(paramOne + paramTwo);
                break;
            case "sub":
                numStack.push(paramOne - paramTwo);
                break;
            case "mul":
                numStack.push(paramOne * paramTwo);
                break;
            case "div":
                if (paramTwo == 0) {
                    System.out.println("error");
                } else {
                    numStack.push(paramOne / paramTwo);
                }
                break;
        }
    }

}
