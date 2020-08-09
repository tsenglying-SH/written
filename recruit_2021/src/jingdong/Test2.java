package jingdong;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = palindromicString(str);
        System.out.println(s);
        sc.close();
    }

    private static String palindromicString(String str) {
        String str1 = new StringBuffer(str).reverse().toString();
        if (str.equals(str1)) return str;
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s1 = str.substring(n - 1 - i);
            String s2 = str1.substring(0, i + 1);
            if (str.substring(n - 1 - i).equals(str1.substring(0, i + 1))) {
                count = i;
            }
        }
        String str2 = str.substring(0, n - count - 1);
        String str3 = new StringBuffer(str2).reverse().toString();
        str2 = str + str3;
        return str2;
    }
}
