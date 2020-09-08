package pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName M1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/1 19:00
 * @Version 1.0
 **/
public class M3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] size = new int[N];
        int[] value = new int[N];
        for (int i = 0; i < N; i++) {
            size[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        int i = ZeroOnePack2(M, N, size, value);
        System.out.println(i);

    }
    public static int ZeroOnePack2(int V,int N,int[] weight,int[] value){
        //动态规划
        int[] dp = new int[V+1];
        for(int i=1;i<N+1;i++){
            //逆序实现
            for(int j=V;j>=weight[i-1];j--){
                dp[j] = Math.max(dp[j-weight[i-1]]+value[i-1],dp[j]);
            }
        }
        return dp[V];
    }

}
