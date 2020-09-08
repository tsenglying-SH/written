import java.util.Arrays;

/**
 * @ClassName T3
 * @Description 二分查找
 * @Author TianTian
 * @Date 2020/9/2 15:33
 * @Version 1.0
 **/
public class T3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int key=3;
        int i = binarySearch(arr, key);
        // JDK 自带的二分查找
        int a = Arrays.binarySearch(arr,key);
        System.out.println("a; "+a);
        System.out.println(i);
    }
    public static  int binarySearch(int[] arr,int key){
        int left=0,right=arr.length-1,mid=0;
        int res=0;
        while (left<=right){
            mid=(left+right)/2;
            if(arr[mid]<key){
                left=mid;
            } else if(arr[mid]>key){
                right=mid;
            }else {
               return mid;
            }
        }
        return -1;
    }
}
