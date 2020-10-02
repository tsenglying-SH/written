package weizhongbank0927;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long res = countAns(n, arr);
        System.out.println(res);

    }

    private static long countAns(int n, int[] arr) {
        if (n < 3) return 0;
        if (n == 3) {
            if (arr[2] >= arr[1] && arr[1] >= arr[0]) {
                return 1;
            } else {
                return 0;
            }
        }
        long count = 0L;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] >= arr[j] && arr[j] >= arr[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


}
