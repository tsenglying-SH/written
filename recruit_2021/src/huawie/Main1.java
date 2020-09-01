package huawie;


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        String bi ="";
        for (int i = 1; i <=32 ; i++) {
           bi+="1";
        }
        System.out.println(bi.length());
       System.out.println(Long.parseLong(bi,2));
      /* String s1=s.substring(8);
        System.out.println(s1);
        String s2 = s.substring(0, 8);
        System.out.println(s2);*/

    }
}
