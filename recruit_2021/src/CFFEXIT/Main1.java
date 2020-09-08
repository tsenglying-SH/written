package CFFEXIT;

/*面值为{1,5,10,20,50,100}的人名币，组合为N元的组合共有多少种组合
* 思路：运用动态规划
* */
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int number = sumNumber(n);
        System.out.println(number);
        }

    private static int sumNumber(int n) {
        int [] money={1,5,10,20,50,100};
        int[] dp = new int[n+1];
        dp[0]=1;
        for (int i = 0; i < 6; i++) {
            for (int j = money[i]; j <=n ; j++) {
                dp[j]=dp[j]+dp[j-money[i]];
            }
        }
        return dp[n];

    }

}

