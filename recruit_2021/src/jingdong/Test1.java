package jingdong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/6 14:44
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int result= protect(arr);
        System.out.println(result);
    }

    private static int protect(int[] arr) {
        int n= arr.length;
        if (n==1) return 0;
        if(n==2) return 1;
        return 2*n-3;
    }
}
