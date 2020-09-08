import java.util.Arrays;

/**
 * @ClassName T5
 * @Description 快速排序 nlogn
 * @Author TianTian
 * @Date 2020/9/2 16:27
 * @Version 1.0
 **/
public class T5 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 4, 3, 2, 1};
        fastSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void fastSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int i = left, j = right, pivot = arr[left];
        while (i != j) {
            while (pivot <= arr[j] && i < j) j--;
            while (pivot >= arr[i] && i < j) i++;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = pivot;
        fastSort(arr, left, i - 1);
        fastSort(arr, i + 1, right);
    }
}
