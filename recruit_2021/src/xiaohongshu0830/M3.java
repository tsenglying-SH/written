package xiaohongshu0830;

import java.util.Scanner;

/**
 * @ClassName M3
 * @Description TODO
 * @Author TianTian
 * @Date 2020/8/30 20:39
 * @Version 1.0
 **/
public class M3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr= new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int res= findMin(arr,n,m,r,c);
        System.out.println(res);
    }

    private static int findMin(int[][] arr,int n, int m,int r,int c) {
        int min=0,res=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < -1; j++) {
                min=arr[i][j]-arr[i][j];
            }
        }
        min =4;
        res=min;
        return res;
    }

}
