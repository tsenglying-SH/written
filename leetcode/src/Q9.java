import java.util.Scanner;
/*判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。*/
public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        boolean isTrue=palindromeNumber(num);
        System.out.println(isTrue);
    }

    private static boolean palindromeNumber(int x) {
        if(x<0) return false;
        if(0<=x&&x<=9) return true;
        String s= String.valueOf(x);
        String s1= new StringBuffer(s).reverse().toString();
        if(s.equals(s1)) return true;
        return false;
    }
}
