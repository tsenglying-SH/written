package weizhongbank0927;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description 给定一个长度为n的数组a，我们定义一个数x的近似值是在数组a中与x的差值的绝对值最小，
 * 如果两个数的绝对值相等，就取较小的那个。比如说对于[2, 5, 7]，4的近似值就是5，而6的近似值应该取5，因为5更小。
    现在有q个询问，对每个询问回答近似值。
 * @Author TianTian
 * @Date 2020/9/27 19:37
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j<q; j++) {
           int x=sc.nextInt();
           int res=min(arr,x);
           list.add(res);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

    private static int min(int[] arr, int x) {
        if(arr.length<=0) return 0;
        int index=0;
        int min=Math.abs(arr[0]-x);
        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]-x)<min){
                min=Math.abs(arr[i]-x);
                index=i;
            }
        }
        return arr[index];
    }
}
