package sort;

import java.util.Arrays;

/**
 * @ClassName FastSort
 * @Description 快速排序
 * @Author Tsenglying
 * @Date 2020/8/6 15:30
 * @Version 1.0
 **/
public class FastSort {
    public static void main(String[] args) {
        int [] a= {2,3,5,67,7,8,9,99};
        System.out.println(Arrays.toString(a));
        fastSort(0,a.length-1,a);
        System.out.println(Arrays.toString(a));


    }
    public static void fastSort(int left,int right,int[] arr){
        if(left>=right) return;
        int i=left,j=right,pivot=arr[left];
        while(i!=j){
            while(pivot<=arr[j]&&i<j) j--;
            while(pivot>=arr[i]&&i<j) i++;
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // 交换基准的位置
        arr[left]=arr[i];
        arr[i]=pivot;
        // 左右递归调用
        fastSort(left,i-1,arr);
        fastSort(i+1,right,arr);
    }
}
/*1.在待排序的N个记录中任取一个元素(通常取第一个记录)作为基准，称为基准记录；
2.定义两个索引 left 和 right 分别表示“首索引” 和 “尾索引”，pivot 表示“基准值”；
3.首先，尾索引向前扫描，直到找到比基准值小的记录(left != righ)，并替换首索引对应的值；
4.然后，首索引向后扫描，直到找到比基准值大于的记录(left != righ)，并替换尾索引对应的值；
5.若在扫描过程中首索引等于尾索引(left = right),则一趟排序结束；将基准值(key)替换首索引所对应的值；
6.再进行下一趟排序时，待排序列被分成两个区:[0,left-1],[righ+1,end]
7.对每一个分区重复步骤2~6，直到所有分区中的记录都有序，排序成功。
* */