package guanglianda;

/**
 * @ClassName Q3
 * @Description TODO
 * @Author TianTian
 * @Date 2020/8/26 22:37
 * @Version 1.0
 *
 * 题目描述：
有一种排序算法定义如下，该排序算法每次只能把一个元素提到序列的开头，
例如2，1，3，4，只需要一次操作把1提到序列起始位置就可以使得原序列从小到大有序。

现在给你个乱序的1-n的排列，请你计算最少需要多少次操作才可以使得原序列从小到大有序
输入描述
输入第一行包含一个正整数n ，表示序列的长度。(1<=n<=100000)

接下来一行有n个正整数，表示序列中的n个元素，中间用空格隔开。(1<=a_i<=n)

输出描述
输出仅包含一个整数，表示最少的操作次数。
样例输入
4
2 1 3 4
样例输出
1*/
import java.util.*;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int[] sort = new int[n];
        for (int i = 0; i < n; i++) {
            sort[i] = sc.nextInt();
            numbers[i] = sort[i];
        }
        Arrays.sort(sort);
        int count = 0;
        int j = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (sort[i] == sort[j]) {
                count++;
                j--;
            }
        }
        System.out.println(n - count);
    }
}
