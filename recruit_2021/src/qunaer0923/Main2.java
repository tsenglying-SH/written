package qunaer0923;

import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/23 18:07
 * @Version 1.0
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sc.close();
        int res = findLongestCS(s1, n, s2);
        System.out.println(res);
    }
    public static int findLongestCS(String A, int n, String B) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j] > dp[i][j - 1] ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }
        return dp[n][n];
    }

}
