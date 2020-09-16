package aiqiyi0913;
import java.util.Scanner;
/**
 * @ClassName Main1
 * @Description 多数元素，
 *  给定一个大小为 n 的整数数组，找到其中的多数元素。多数元素是指在数组中出现次数大于『n/2』的元素。
    你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * @Author TianTian
 * @Date 2020/9/13 16:23
 * @Version 1.0
 **/
public class Main2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("\\s");
        int[] arr = new int [split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.valueOf(split[i]);
        }

        System.out.println(mostNum(arr));
    }

    public static int mostNum(int[] array) {
        int count = 1, value = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                value = array[i];
                count = 1;
            }
        }
        return value;
    }

}
