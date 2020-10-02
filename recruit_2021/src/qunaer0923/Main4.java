package qunaer0923;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/23 18:07
 * @Version 1.0
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String[] split1 = s1.split("\\s");
        StringBuilder sb1= new StringBuilder("");
        for (String s : split1) {
            sb1.append(s);
        }
        String ss1 = sb1.toString();
        String[] split2 = s2.split("\\s");
        StringBuilder sb2= new StringBuilder("");
        for (String s : split2) {
            sb2.append(s);
        }
        String ss2 = sb2.toString();
        sc.close();
        String res =findComString(ss1,ss2);
        int len = res.length();
        System.out.println(res);
        System.out.println(len);
    }
    public static String findComString(String a, String b) {
        int[][] matrix = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    int maxLen = (i == 0 || j == 0) ? 0 : matrix[i - 1][j - 1];
                    matrix[i][j] = maxLen + 1;
                } else {
                    int maxLen = (i == 0 || j == 0) ? 0 : Math.max(
                            matrix[i - 1][j], matrix[i][j - 1]);
                    matrix[i][j] = maxLen;
                }
            }
        }

        int i = a.length() - 1;
        int j = b.length() - 1;
        ArrayList<Character> restList = new ArrayList<Character>();
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == b.charAt(j)) {
                restList.add(a.charAt(i));
                i--;
                j--;
            } else {
                if (matrix[i - 1][j] >= matrix[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        StringBuilder reBuilder = new StringBuilder(restList.size());
        for (int k = restList.size() - 1; k >= 0; k--) {
            reBuilder.append(restList.get(k));
        }
        return reBuilder.toString();
    }
}
