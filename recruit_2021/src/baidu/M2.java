package baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName M2
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/3 20:04
 * @Version 1.0
 **/
public class M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//数量
        int m=sc.nextInt();//最多能拿的物品重量
        int k=sc.nextInt();//预算k
        int[][] goods= new int[n][3];
        for (int i = 0; i < n; i++) {
            goods[i][0]=sc.nextInt();
            goods[i][1]=sc.nextInt();
            goods[i][2]=sc.nextInt();
        }
        getNum(n,m,k,goods);
    }

    private static void getNum(int n, int m, int k, int[][] goods) {
        int[] W =new int[n];// 质量
        int[] V =new int[n];;// 心动值
        int[] P =new int[n];;// 价格
        for (int i = 0; i < n; i++) {
            W[i]=goods[i][1];
            V[i]=goods[i][2];
            P[i]=goods[i][0];
        }
        int[][] dp = new int[n+1][m+1];
        for (int i = 0; i <=m; i++) {
            dp[0][i]=0;
        }
        for (int i = 0; i <=n; i++) {
            dp[i][0]=0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = W[i-1]; j <= m ; j++) {
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-W[i-1]]+V[i-1]);
            }

        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(dp[n][m]);

    }
}
