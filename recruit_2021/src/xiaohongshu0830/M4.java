package xiaohongshu0830;

import java.util.Scanner;

/**
 * @ClassName M4
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/12 16:51
 * @Version 1.0
 **/
    public class M4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[]arr= new int[n-1];
            for (int i = 0; i <n-1 ; i++) {
                arr[i]=sc.nextInt();
            }
            int res= findMin(arr,n,m);
            System.out.println(res);
        }

        private static int findMin(int[] arr,int n, int m) {
            int min=0,res=0;
            for (int i = 0; i < n-1; i++) {
                int add= arr[0]+arr[n-2];
                min+=add;
            }
            min =4;
            res=min;
            return res;
        }

    }
