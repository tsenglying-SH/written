package sike0907;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Q1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/7 20:27
 * @Version 1.0
 **/
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                list.add(Integer.valueOf(s.charAt(i)));
            }
        }
        int [] arr= new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            arr[i]=list.get(i)-48;
        }
        boolean ans = getAns(arr, list.size());
        System.out.println(ans);
    }

    public static boolean getAns(int[] arr, int len) {
        int max = 0;
        if (len <= 1) return true;
        for (int i = 0; i < len && i <= max; i++) {
            max = Math.max(max, i+arr[i]);
        }
        if (max < len - 1) {
            return false;
        }
        return true;
    }
}
