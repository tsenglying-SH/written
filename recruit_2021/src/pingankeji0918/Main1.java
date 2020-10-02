package pingankeji0918;

import java.text.DecimalFormat;
import java.util.Scanner;
/*关键在于保留两位小数的格式
       DecimalFormat df = new DecimalFormat("0.00");
        String res=df.format((float)fenzi/fenmu);
* */

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String ans = function(a,b,c);
        System.out.println(ans);

    }

    private static String function(int a, int b, int c) {
        int fenzi=getMax3(a+b,b,c);
        int fenmu=getMax3(a,b+c,c)+getMax3(a,b,b+c);
        // System.out.println((float)fenzi/fenmu);// 0.3
        if(fenmu==0) return "ERROR";
        DecimalFormat df = new DecimalFormat("0.00");
        String res=df.format((float)fenzi/fenmu);
        return res;
    }
    public static int getMax3(int a, int b, int c){
        int res =0;
        if(a>b){
            res=a>c?a:c;
        }else {
            res=b>c?b:c;
        }
        return res;
    }
}
