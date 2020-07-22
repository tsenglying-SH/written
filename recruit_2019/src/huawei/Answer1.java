package huawei;

import java.util.Scanner;

/**
 * @ClassName Answer1
 * @Description 利用字符串反转解决整数反转  String str = new StringBuffer(str1).reverse().toString()
 * @Author Tsenglying
 * @Date 2020/7/22 17:12
 * @Version 1.0
 **/
public class Answer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int number = reverseAdd(a, b);
        System.out.println(number);
    }

    private static int reverseAdd(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        int a1 = Integer.valueOf(new StringBuffer(str1).reverse().toString());
        int b1 = Integer.valueOf(new StringBuffer(str2).reverse().toString());
        return a1 + b1;
    }
}
