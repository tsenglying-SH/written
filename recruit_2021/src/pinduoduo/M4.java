package pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName M4
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/1 19:13
 * @Version 1.0
 **/
public class M4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean[] used = new boolean[N + 1];
        int aCount = getListCount(N, arr, used);
        System.out.println(aCount);

    }

    public static int getListCount(int N, int[] arr, boolean[] used) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= N; j++) {
                if (!used[j] && j % arr[i] == 0) {
                    count++;
                    used[j] = true;
                }
            }
        }
        return count;
    }


}
