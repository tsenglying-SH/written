package qunaer0923;

import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/23 18:07
 * @Version 1.0
 **/
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String[] split1 = s1.split("\\s");
        StringBuilder sb1= new StringBuilder("");
        for (String s : split1) {
            sb1.append(s);
        }
        String ss1 = sb1.toString();
        String[] split2 = s2.split("\\s");
        StringBuilder sb2= new StringBuilder("");
        for (String s : split2) {
            sb2.append(s);
        }
        String ss2 = sb2.toString();
        sc.close();
       int res =longestCommonSubsequence(ss1,ss2);
        System.out.println(res);
    }
    public static int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c1 = text1.charAt(i), c2 = text2.charAt(j);
                if (c1 == c2) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[m][n];
    }
}
