package jingdong;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = palindromicString(str);
        System.out.println(s);

    }
    private static String palindromicString(String str) {
        String str1 = new StringBuffer(str).reverse().toString();
        if (str.equals(str1)) return str;
        int n = str.length();
        int count=0;
        for (int i = 0; i <n ; i++) {
            String s1=str.substring(n-1-i);
            String s2=str1.substring(0,i+1);
            if(isPalindrome(s1,s2)){
                count++;
            }
        }
        String str2=str.substring(0,n-count);
        String str3=new StringBuffer(str2).reverse().toString();
        str2=str+str3;
        return str2;
    }
    public static boolean isPalindrome(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        int len=0;
        for (int i = 0; i <str1.length() ; i++) {
            if(str1.charAt(i)==str2.charAt(i)){
                len++;
            }
        }
        if(len==str1.length()) return true;
        return false;
    }

}
