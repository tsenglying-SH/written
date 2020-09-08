package baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName M1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/3 19:51
 * @Version 1.0
 **/
public class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num =sc.nextLine();
        String[] split = num.split("\\s");
        int a=Integer.valueOf(split[0]);
        int b=Integer.valueOf(split[1]);
        String s=sc.nextLine();
        sc.close();
        int[] arr =findPosition(a,b,s);
        System.out.print(arr[0]+" "+arr[1]);
    }

    private static int[] findPosition(int a, int b, String s) {
        int[] res= new int[2];
        int countU=0;
        int countR=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='U'){
                countU++;
            }else if(s.charAt(i)=='D'){
                countU--;
            }else if(s.charAt(i)=='L'){
                countR--;
            }else if(s.charAt(i)=='R'){
                countR++;
            }
        }
        res[0]=a+countR;
        res[1]=b+countU;
        return res;

    }
}
