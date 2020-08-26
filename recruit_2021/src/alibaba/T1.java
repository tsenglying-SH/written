package alibaba;

import java.util.*;

/**
 * @ClassName T1
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/26 9:07
 * @Version 1.0
 **/
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[T * n][2];
        for (int i = 0; i < T * n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();

    }

    public int killOne(int n, int m, int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i][1] == 0) {
                list.add(arr[i][1]);
            }
        }
        Collections.sort(list);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (m - list.get(i) > 0) {
                m -= list.get(i);
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public int killTwo(int n, int m, int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] == 0) {
                list.add(arr[i][1]);
            }
        }
        return 0;

    }

}
