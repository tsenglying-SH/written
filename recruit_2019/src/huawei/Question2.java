package huawei;

import java.util.*;
 // 【消除重复数字】
/*
【题目描述】：给定一个正整数，给出消除重复数字以后最大的整数
【输入描述】：正整数，注意考虑长整数
【输出描述】：消除重复数字以后的最大整数
【输入样例】：423234
【输出样例】：432
*/
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        int number = maxNumber(a);
        System.out.println(number);
        //  System.out.println(number);
    }

    private static int maxNumber(long a) {
        String temp = "";
        String str = String.valueOf(a);  //数值型转字符串
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(String.valueOf(str.charAt(i)));
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s : set) {
            list.add(s);
        }
        // 工具类Collections排序字符串
        Collections.sort(list);
        // 增强for循环白遍历HashSet()
        for (String s : list) {
            temp += s;
        }
        // 字符串排序中"2"比“3”要大，所以需要反转字符串
        String reverse = new StringBuffer(temp).reverse().toString();
        // 字符串转数值
        return Integer.valueOf(reverse);
    }

}
