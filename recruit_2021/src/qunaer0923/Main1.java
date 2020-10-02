package qunaer0923;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/23 18:07
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BigInteger res=combination( n, m);
        System.out.println(res);
    }
    public static BigInteger combination(int n, int m) {
        m = m > (n - m) ? (n - m) : m;
        BigInteger numerator =new BigInteger("1") ;
        BigInteger denominator =new BigInteger("1") ;


        for(int i=m;i>0;i--){
            String number =String.valueOf(n);
            BigInteger temp= new BigInteger(number);
            numerator=numerator.multiply(temp);
            //numerator*=n;
            n--;
            String number2 =String.valueOf(i);
            BigInteger temp2= new BigInteger(number2);
            denominator= denominator.multiply(temp2);
        }
        BigInteger res=numerator.divide(denominator);
        return res;
    }
}
