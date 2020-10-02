package pingankeji0918;

import java.util.Scanner;

/*
母牛每年生一只小牛，三年后成熟，给定整数年份n，求n年后牛的数量。
**/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countCows(n);
        System.out.println(res);
    }

    private static int countCows(int n) {
        if (n <= 3) return n;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3];
        }
        return dp[n - 1];
    }
}
