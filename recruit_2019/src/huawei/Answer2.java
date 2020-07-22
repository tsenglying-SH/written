package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Answer2
 * @Description https://www.dazhuanlan.com/2019/12/16/5df6dea953244/
 * @Author Tsenglying
 * @Date 2020/7/22 17:29
 * @Version 1.0
 *
 * 【思路】
 * 桶排序思想，因为数字无疑就是0-9，所以创建一个长度为10的数组，将每个数字依次入桶。
 * 桶中不为空代表这个常整数有该值，然后将桶内的数依次拼凑成最大的数。count[0] ~count[9]依次存放0-9
设置一个list存放一共出现了几个不同的数了，当list.size == 10,
代表所有数字都出现过了，后面再怎么出现的数都是重复的。可以提前终止while语句
 **/
public class Answer2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(solution(a));
    }
    public static long solution(long a){
        //利用桶计数方法，判断哪个值出现过
        int count[] = new int[10];
        //用来计数，如果前面出现了0-9的所有数，则提前结束循环
        List<Integer> list = new ArrayList<>();
        while (a!=0){
            int temp =(int) a%10;
            count[temp]++;
            //list里面存放没出现的值
            if(!list.contains(temp)){
                list.add(temp);
            }
            //判断是否提前结束循环
            if(list.size() == 10){
                break;
            }
            a = a / 10;
        }
        //结果的生成
        long res = 0;
        for(int i = count.length-1;i>=0;i--){
            if(count[i]!=0){
                res = res*10 + i;
            }
        }
        return res;
    }
}
