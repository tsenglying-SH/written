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
public class M1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[][] res = getArray(N);
        printArray2(res);
    }
    public static int[][] getArray(int N){
        int [][] res= new int[N][N];
           int a= N/2;
            //1区
            for (int i = 0; i <a-1; i++) {
                for (int j = a; j <N -1; j++) {
                    res[i][j]=1;
                }
            }
            //2区
            for (int i = 0; i <a-1; i++) {
                for (int j = a-1; j <i; j--) {
                    res[i][j]=2;
                }
            }
            //3区
            for (int i = 0; i <a-1; i++) {
                for (int j = 0; j <i; j++) {
                    res[i][j]=3;
                }
            }
        return res;
    }
    public  static  void  printArray2(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
                if(j==arr[0].length-1){
                    System.out.println();
                }
            }
        }
    }
}
