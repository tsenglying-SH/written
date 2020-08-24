package search;

import java.util.Arrays;

/**
 * @ClassName BiSearch
 * @Description 二分查找
 * @Author Tsenglying
 * @Date 2020/8/6 15:46
 * @Version 1.0
 **/
public class BiSearch {
    public static int biSearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1, mid = 0;
        if (key < arr[left] || key > arr[right] || left > right)
            return -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < key) {
                left = mid;
            } else if (arr[mid] > key) {
                right = mid;
            } else {
                return mid;
            }
        }
        return -1; //没有找到
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 15, 17};
        int index = biSearch(array, 5);
        System.out.println(index);

        // JDK 自带的二分查找算法
        int i = Arrays.binarySearch(array, 5);
        System.out.println(i);

    }
}
