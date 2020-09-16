package wubatongcheng0914;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName Main1
 * @Description 未排序数组找出其中最小正整数
 * @Author TianTian
 * @Date 2020/9/14 19:32
 * @Version 1.0
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

    }
    public int firstMissingPositive (int[] nums) {
        Set<Integer> set = new TreeSet<Integer>();
        for(int num: nums){
            set.add(num);
        }
        System.out.println(set);
        int i = 1;
        while(i < nums.length + 1){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
        return i;
    }
}
