package wubatongcheng0914;

import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/14 19:32
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = getCount(arr);
        System.out.println(count);
    }

    public static int getCount(int[][] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) {
                    result++;
                    erase(A, i, j);
                }
            }
        }
        return result;
    }

    public static void erase(int[][] A, int i, int j) {
        A[i][j] = 0;
        while (i - 1 >= 0 && A[i - 1][j] == 1) {
            erase(A, i - 1, j);
        }
        while (i + 1 < A.length && A[i + 1][j] == 1) {
            erase(A, i + 1, j);
        }
        while (j - 1 >= 0 && A[i][j - 1] == 1) {
            erase(A, i, j - 1);
        }
        while (j + 1 < A[0].length && A[i][j + 1] == 1) {
            erase(A, i, j + 1);
        }

    }
}
