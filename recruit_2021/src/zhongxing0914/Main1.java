package zhongxing0914;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/14 10:00
 * @Version 1.0
 **/
public class Main1 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = moFang(N, arr);
        System.out.println(Arrays.toString(res));
    }*/

    /*private static int[] moFang(int n, int[] arr) {
        int[] res = new int[2];
        if(n==0){
            res[0]=0;
            res[1]=0;
            return res;
        }
        if(n==1){
            res[0]=arr[0];
            res[1]=0;
            return res;
        }
        if(n==2){
            if(arr[0]>arr[1]){
                res[0]=arr[0]+arr[1];
                res[1]=0;
                return res;
            }else{
                res[0]=arr[1]*2;
                res[1]=1;
                return res;
            }
        }

        int max = 0, index = 0,count=0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        if(max>arr[0]){
            int[] ints = Arrays.copyOfRange(arr, index + 1, n - 1);
            int[] ints1 = moFang( n - 1 - index,ints);
            res[0]=max*(index+1)+ints1[0];
            res[1]=index+ints1[1];
        }else{
            int[] ints = Arrays.copyOfRange(arr, index + 1, n - 1);
            int[] ints2 = moFang( n - 1 - index,ints);
            res[0]=max*(index)+arr[0]+ints2[0];
            res[1]=index+ints2[1]-1;
        }
        return res;
    }
*/

}
