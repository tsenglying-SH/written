package alibaba;

import java.util.PriorityQueue;

/*给定一个数组，以及整数K，返回第K大的数*/
public class M2 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 6, 7, 3, 8};
        int a = findK(nums, 2);
        System.out.println(a);
    }

    private static int findK(int[] nums, int K) {
        int len = nums.length;
        if (K > len) return -1;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int val : nums) {
            que.add(val);
            if (que.size() > K) {
                que.poll();
            }
        }
        return que.peek();
    }
}
/*用优先队列PriorityQueue实现一个小顶堆，通过保留队列的大小，到最后返回堆的根节点即为第K大的数*/