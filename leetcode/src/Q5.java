import java.util.Scanner;
/*给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-palindromic-substring
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = longestPalindrome(s);
        System.out.println(s1);

    }

    public static String longestPalindrome(String s) {
        if (s.equals("")) return s;
        int n = s.length();
        int max = 0, begin = 0;
        // dp[i][j] 表示子串 s[i..j] 是否为回文子串
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            // 对角线为单个字符，全部为true
            dp[i][i] = true;
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    // 两个相邻值相同肯定为回文，中间即使隔了一个也是回文
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + max);

    }
}
/*
 【思路】：利用动态规划 画一张二维表格，往里面填数字，对角线全部是true
 状态转移公式：  dp[i][j] = dp[i + 1][j - 1] when  s.charAt(i) != s.charAt(j)
 边界条件：dp[i][j]=true(j-i+1<2) when  s.charAt(i) != s.charAt(j)  */