package didi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] score = new String[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                score[i][j] = sc.next();
            }
        }
        sc.close();
        int a = findGood(score);
        a+=1;
        int b = findBad(score);
        b=10-b;
        System.out.print(a+" "+b);

    }

    private static int findBad(String[][] score) {
        int len =score[0].length;
        int a=findX(score[0]);
        if(a==len-1) return 0;
        int b=findX(score[1]);
        if(b==len-1) return 0;
        int count=0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = a+1; i < len; i++) {
            map.put(score[0][i],1);
        }
        for (int i = b+1; i < len; i++) {
            if(map.containsKey(score[1][i])){
                count++;
            }
        }
        return count;
    }

    private static int findGood(String[][] score) {
        int a=findX(score[0]);
        if(a==0) return 0;
        int b=findX(score[1]);
        int count=0;
        if(b==0) return 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            map.put(score[0][i],1);
        }
        for (int i = 0; i < b; i++) {
            if(map.containsKey(score[1][i])){
                count++;
            }
        }
        return count;
    }
    private static int findX(String[] arr) {
        int len=arr.length;
        if(len==1) return 1;
        for (int i = 0; i < len; i++) {
            if(arr[i].equals("X")){
                return i;
            }
        }
        return 0;
    }
}
