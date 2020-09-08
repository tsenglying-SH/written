import java.util.Arrays;

/**
 * @ClassName T4
 * @Description 冒泡排序
 * @Author TianTian
 * @Date 2020/9/2 15:44
 * @Version 1.0
 **/
public class T4 {
    public static void main(String[] args) {
        int [] arr={3,6,8,9,4,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
