package huawei;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String[] ss=s.split("\\[+\\]");
        System.out.println(ss.length);
        for (String s1 : ss) {
            System.out.println(s1);
        }

    }
    /*public static int Big(int[] a,int[] b){
        int len = a.length;
        int[]dp= new int[len];
        for (int i = 0; i < len; i++) {

        }
    }*/
}
