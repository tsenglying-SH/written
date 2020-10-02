package duxiaoman0920;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Main2
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/20 20:48
 * @Version 1.0
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int T = Integer.valueOf(s);
        ArrayList<Integer> list = new ArrayList<>();
        for (int k = 0; k < T; k++) {
            String number=sc.nextLine();
            String[] split = number.split("\\s");
            int n = Integer.valueOf(split[0]);
            int m = Integer.valueOf(split[1]);
            String[] place = new String[n];
            for (int i = 0; i < n; i++) {
                place[i] = sc.nextLine();
            }
            int ans = miGong(n, m, place);
            list.add(ans);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }


    }

    private static int miGong(int n, int m, String[] place) {
        return 0;
    }
}
