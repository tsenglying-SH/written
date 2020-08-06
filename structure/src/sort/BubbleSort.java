package sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author Tsenglying
 * @Date 2020/8/6 15:09
 * @Version 1.0
 *
 * 第一趟将最大的数排在最后面
 * */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a={2,4,6,87,4,25,76};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] arr){
        int length=arr.length;
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
/*
比较相邻的元素。如果第一个比第二个大，就交换他们两个。
对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
针对所有的元素重复以上的步骤，除了最后一个。
持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较*/
