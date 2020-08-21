package eastMoney;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        sc.close();
        String [] array=s.split(",");
        int[] num = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            num[i]=Integer.valueOf(array[i]);
        }
        int i = maxSub(num);
        System.out.println(i);
    }

    public static int maxSub(int[] arr) {
        int max=arr[0],len =arr.length;
        int[] dp = new int[len];
        dp[0]=arr[0];
        for (int i = 1; i < len; i++) {

        }
        return max;
    }
}
