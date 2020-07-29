package byteDance;

/**
 * @ClassName Answer1
 * @Description https://www.nowcoder.com/questionTerminal/c0803540c94848baac03096745b55b9b
 * @Author Tsenglying
 * @Date 2020/7/29 13:52
 * @Version 1.0
 **/
/*我是向右边探索的呀，你让王大锤每次都站right上。
第一次固定3，（1，2）里边选俩；
第二次固定4，（1，2，3）里边选俩，虽然也有（1，2），但固定的数是新的，不会重。
*/

import java.util.*;

public class Answer1 {

    private int mod = 99997867;

    private void sln() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), D = sc.nextInt();
        long cnt = 0;
        if (N <= 2) {
            System.out.println(-1);
            return;
        }
        int[] locs = new int[N];
        for (int i = 0; i < N; i++) {
            locs[i] = sc.nextInt();
        }
        sc.close();
        int left = 0, right = 2;
        // 右边用来固定
        while (right < N) {
            if (locs[right] - locs[left] > D) left++;
            else if (right - left < 2) right++;
            else {
                cnt += calC(right - left);
                right++;
            }
        }
        cnt %= mod;
        System.out.println(cnt);
    }
    // 计算C n 2
    private long calC(long num) {
        return num * (num - 1) / 2;
    }


    public static void main(String[] args) {
        new Answer1().sln();
    }
}

