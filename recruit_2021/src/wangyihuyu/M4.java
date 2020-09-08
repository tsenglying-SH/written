package wangyihuyu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName M1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/5 15:02
 * @Version 1.0
 **/
public class M4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] res=getPaixu(n,arr);
        for (int i = 0; i < res.length-1; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.print(res[n-1]);
    }

    private static int[] getPaixu(int n, int[] arr) {
        int[] res= new int[n];
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-2; j++) {
                if(arr[j]*arr[j+1]>arr[j+1]*arr[j+2]){
                    int temp=arr[j];
                    arr[j]=arr[j+2];
                    arr[j+2]=temp;
                }
            }
        }
        res=arr;
        return res;
    }
}
