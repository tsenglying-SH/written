/**
 * @ClassName T2
 * @Description 最长回文子串  动态规划
 * @Author TianTian
 * @Date 2020/9/2 14:28
 * @Version 1.0
 **/
public class T2 {
    public static void main(String[] args) {
        String a = "abacd";
        String s = MaxHuiwenString(a);
        System.out.println(s);
    }

    public static String MaxHuiwenString(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int begin = 0, maxlen = 0;
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) != s.charAt(i)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxlen) {
                    begin = i;
                    maxlen = j - i + 1;
                }
            }
        }
        System.out.println(maxlen);
        return s.substring(begin, begin + maxlen);
    }
}
