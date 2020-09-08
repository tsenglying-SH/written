import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName T9
 * @Description 数组中第K小的数
 * @Author TianTian
 * @Date 2020/9/6 21:42
 * @Version 1.0
 **/
public class T9 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 6, 5, 4, 3, 8, 1};
        int res = findKth(arr, 2);
        System.out.println(res);
    }

    private static int findKth(int[] arr, int k) {
        //lamd表达式实现大根堆
        PriorityQueue<Integer> que = new PriorityQueue<>((o1,o2)->(o2-o1));
        for (int val : arr) {
            que.add(val);
            if(que.size()>k){
                que.poll();
            }
        }
        System.out.println(que);

        return que.peek();
    }
}
