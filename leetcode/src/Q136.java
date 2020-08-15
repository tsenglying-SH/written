/**
 * @ClassName Q136
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/12 17:52
 * @Version 1.0
 **
 * 给定一个非空整数数组，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。*/

public class Q136 {
    public static void main(String[] args) {
       int[] a ={1,2,3,4,5,4,3,2,1};
        int i = singleNumber(a);
        System.out.println(i);
    }
    public static int singleNumber(int[] arr){
        int L= arr.length;
        int num=0;
        for (int i = 0; i <L; i++) {
            num =num^arr[i];
        }
        return num;
    }
}
/*【思路】
* Java中的^按位异或
* |是按位或
^是按位抑或
&是按位与*/