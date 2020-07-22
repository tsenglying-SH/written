package huawei;

/**
 * @ClassName Question3
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/7/22 17:49
 * @Version 1.0
 * 【题目描述】 仿LISP运算
 LISP语言唯一的语法就是括号要配对。
 形如 (OP P1 P2 …)，括号内元素由单个空格分割。
 其中第一个元素OP为操作符，后续元素均为其参数，参数个数取决于操作符类型
 注意：参数 P1, P2 也有可能是另外一个嵌套的 (OP P1 P2 …)
 当前OP类型为add/sub/mul/div(全小写)，分别代表整数的加减乘除法。简单起见，所以OP参数个数为2
举例
  输入：(mul 3 -7)输出：-21
  输入：(add 1 2) 输出：3
  输入：(sub (mul 2 4) (div 9 3)) 输出 ：5
  输入：(div 1 0) 输出：error
输入描述：
  合法C字符串，字符串长度不超过512，用例保证了无语法错误
输出描述：
  合法C字符串，字符包括’0’-‘9’及负号’-‘或者’error’
 **/
public class Question3 {
    public static void main(String[] args) {

    }

}
