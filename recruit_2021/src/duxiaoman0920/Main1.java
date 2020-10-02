package duxiaoman0920;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/20 19:47
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        int ans = numberOfColor(first, second);
        System.out.println(ans);
    }

    private static int numberOfColor(String first, String second) {
        if (first == null || first.equals("")) return 0;
        int len1 = first.length();
        int len2 = second.length();
        int count = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < len1; i++) {
            if (!map1.containsKey(first.charAt(i))) {
                map1.put(first.charAt(i), 1);
            } else {
                map1.put(first.charAt(i), map1.get(first.charAt(i)) + 1);
            }
        }
        //System.out.println(map1);
        for (int j = 0; j < len2; j++) {
            if (map1.containsKey(second.charAt(j))) {
                if (map1.get(second.charAt(j)) > 0) {
                    count++;
                    map1.put(second.charAt(j), map1.get(second.charAt(j)) - 1);
                }
            }
        }
        return count;
    }
}
