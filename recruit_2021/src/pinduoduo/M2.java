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
public class M2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        int M =sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int i =getBig(N,M,arr);
        System.out.println(i);
    }

    private static int getBig(int n, int m, int[][] arr) {

        return 9;
    }
}
