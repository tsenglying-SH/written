/*连续子数组的最大和
例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
* 动态规划*/
public class Q30 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==1) return array[0];
        int max=array[0];
        for (int i = 1; i <array.length ; i++) {
            array[i]+=array[i-1]>0?array[i-1]:0;
            max=Math.max(max,array[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={6,-3,-2,7,-15,1,2,3};
        int i = FindGreatestSumOfSubArray(arr);
        System.out.println(i);
    }
}
/*
* 典型的动态规划。dp[n]代表以当前元素为截止点的连续子序列的最大和，
* 如果dp[n-1]>0，dp[n]=dp[n]+dp[n-1]，因为当前数字加上一个正数一定会变大；
* 如果dp[n-1]<0，dp[n]不变，因为当前数字加上一个负数一定会变小。
* 使用一个变量max记录最大的dp值返回即可。*/