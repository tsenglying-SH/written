package sort;
/*归并排序采用的是分治(divide-and-conquer)法思想。*/
public class Merge {
    /* 基本思想:
    1. 将n个元素从中间切开，分成两部分。（左边可能比右边多1个数）
    2.将步骤1分成的两部分，再分别进行递归分解。直到所有部分的元素个数都为1。
    3.从最底层开始逐步合并两个排好序的数列。
   【时间复杂度】:nlog(n) 且为稳定排序
   缺点：需要额外的o(n)内存存放临时数组

*/
    public static void main(String[] args) {
        int [] a= {10,8,6,4,3,7,8,9,12,19};
        System.out.println("排序前："+java.util.Arrays.toString(a));

        System.out.println("排序后："+java.util.Arrays.toString(a));
    }

    public static void mergeSort(int[] a,int left, int right) {
        if(left<right){
          int mid = (left+right)/2;
            mergeSort(a,left,mid);//左边归并排序
            mergeSort(a,mid+1,right);//右边归并排序
            //merge(a,left,mid,right);//合并

        }
    }

    /*public static void merge(int []a,int left, int mid, int right){
        //a,b两个有序数列合并
        int [] temp = new int[a.length];//辅助数组
        int i,j,k;
        i=j=k=0;
        while(i<n && j<m){
            if(a[i]<b[j])
                temp[k++]=a[i++];
            else
                temp[k++]=b[j++];
        }
        while(i<n){
            temp[k++]=a[i++];
        }
        while(j<m){
            temp[k++]=b[j++];
        }

    }*/

}
