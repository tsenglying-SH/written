package meituan;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
         for (int i = 1; i <=N ; i++) {
            if(i*4==reverse(i)){
                count++;
                String s=String.valueOf(i)+" "+String.valueOf(reverse(i));
                list.add(s);
            }
        }
        System.out.println(count);
        for (String s : list) {
            System.out.println(s);
        }
        sc.close();
    }
    public static int reverse(int N){
        String s=String.valueOf(N);
        String rs= new StringBuilder(s).reverse().toString();
        int reverse=Integer.valueOf(rs);
        return reverse;
    }


}