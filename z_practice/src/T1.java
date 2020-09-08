import java.util.Arrays;

/**
 * @ClassName T1
 * @Description 01背包问题 动态规划
 * @Author TianTian
 * @Date 2020/9/2 10:00
 * @Version 1.0
 *现有一个容量为V的背包，以及N件物品，其分别占据的容量为Ci,其分别带来的价值为Wi,（i=1,2,...,ni=1,2,...,n）
要求：这N件物品只能放入背包0次或1次（即，不放入或者放入）
问：背包的最大价值为多少？*/
public class T1 {
    public static void main(String[] args) {
        int V=4;
        int N=3;
        int[] C={1,2,3};
        int[] W={1,2,4};
        int mxValue = getMxValue(V, N, C, W);
        System.out.println(mxValue);
    }
    public static int getMxValue(int V,int N,int[] C,int[] W){
        int[][] dp= new int[N+1][V+1];
        for (int i = 0; i <=V; i++) {
            dp[0][i]=0;
        }
        for (int i = 0; i <=N; i++) {
            dp[i][0]=0;
        }
        for (int i = 1; i <=N ; i++) {
            for (int j = C[i-1]; j <=V ; j++) {
                // c[i-1]是因为c是从0开始的，i-1表示的为第i个，w[i-1]同理
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-C[i-1]]+W[i-1]);
            }
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        return dp[N][V];
    }
}
/*子问题定义状态：
dp[i][j]表示 前i件物品，放入容量为j的背包中，可以获得的最大价值。

状态转移方程：

dp[i][j]=max(dp[i−1][j],dp[i−1][j−ci]+wi )

其中 dp[i−1][j]dp[i−1][j] 表示：第i个物品不放入背包时的最大价值（即，将前 i−1 个物品放入容量为j的背包中的最大价值）。

dp[i−1][j−ci]+wi 表示：第i个物品放入背包时的最大价值（即，将前 i−1 个物品放入容量为 j−ci

​的背包中的最大价值 + wi

最终需要的答案为dp[n][V]*/