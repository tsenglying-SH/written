package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/*   【整数反转求和】
【题目】：请您写一个reverseAdd函数，该函数根据输入的两个正整数a和b，然后分别将他们的数字按照高位在右边的方式反转后求和。
例如：reverseAdd（123,456）== 321 + 654 == 975
程序原型：int reverseAdd(int a，int b)
输入：输入的a，b参数均为有效取值范围[1,70000]区间上的正整数。
输出：通过函数返回值输出结果；若输入的a或者b参数超出取值范围（小时1或者大于70000），则应输出-1；否则应按照要求输出数字反转后的和。*/
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int number = reverseAdd(a, b);
        System.out.println(number);
    }

    private static int reverseAdd(int a, int b) {
        if (a < 1 || a > 70000 || b < 1 || b > 70000)
            return -1;
        int ar = reverse(a);
        int br = reverse(b);
        return ar + br;
    }

    public static int reverse(int a) {
        int a1 = 0;
        int remainder = a % 10;
        int quotient = a / 10;
        ArrayList<Integer> list = new ArrayList<>();
        while (quotient != 0 || remainder != 0) {
            list.add(remainder);
            remainder = quotient % 10;
            quotient = quotient / 10;
        }
        int n = list.size();
        for (int i = 0; i < n; i++) {
            a1 = a1 + list.get(i) * (int) Math.pow(10, n - 1 - i);
        }
        return a1;
    }
}
