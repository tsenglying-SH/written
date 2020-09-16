package aiqiyi0913;
import java.util.*;
/**
 * @ClassName Main1
 * @Description 三数之和
 * @Author TianTian
 * @Date 2020/9/13 16:23
 * @Version 1.0
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("\\s");
        int[] arr = new int [split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.valueOf(split[i]);
        }
        List<List<Integer>> lists = threeSum(arr);
        for (List<Integer> list : lists) {
            for (int i = 0; i < 3; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }

}
