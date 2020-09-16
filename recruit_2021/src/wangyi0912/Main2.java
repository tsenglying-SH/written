package wangyi0912;

import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/12 14:36
 * @Version 1.0
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int number = getNumber(s);
        System.out.println(number);

    }
    public static int getNumber(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String ss=s.substring(i,j+1);
               if(palindromeNumber(ss)){
                   count++;
               }
            }
        }
        return count;
    }
    private static boolean palindromeNumber(String x) {
        if(x.length()<=1) return false;
        String s1= new StringBuffer(x).reverse().toString();
        if(x.equals(s1)) return true;
        return false;
    }
}
