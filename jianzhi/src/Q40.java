import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Q40
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/13 17:07
 * @Version 1.0
 * <p>
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class Q40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], 2);
            }
        }
        int count = 0;
        // 用entrySet遍历hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                if (count == 0) {
                    num1[0] = entry.getKey();
                    count++;
                } else {
                    num2[0] = entry.getKey();
                }
            }
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a&b;
        System.out.println(c);

    }
}

/*思路：
 * 1.Hash表的方法
 * 2.按位异或*/