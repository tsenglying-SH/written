package aiqiyi0913;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName Main1
 * @Description 最长无重复子串，滑动窗口
 * @Author TianTian
 * @Date 2020/9/13 15:33
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);


    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, res = 0;
        while(right < s.length()){
            char c = s.charAt(right++);
            while(set.contains(c)){
                set.remove(s.charAt(left++));
            }
            set.add(c);
            res = Math.max(res, right-left);
        }
        return res;
    }
}
