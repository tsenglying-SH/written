package guanglianda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        int score = judge(s1, s2);
        System.out.println(score);
    }

    private static int judge(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 != len2) return 0;
        ArrayList<Character> list = new ArrayList<>();
        list.add('W');
        list.add('S');
        list.add('A');
        list.add('D');
        int count = 0;
        int error = 0;
        int res = 0;
        for (int i = 0; i < len1; i++) {
            if (list.contains(s1.charAt(i)) && list.contains(s2.charAt(i))) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    count++;
                } else {
                    error++;
                }
            } else {
                return 0;
            }
        }
        res = 20 * count - 10 * error;
        return res >= 0 ? res : 0;
    }

}
