package guanglianda;

/**
 * @ClassName Q2
 * @Description TODO
 * @Author TianTian
 * @Date 2020/8/26 22:35
 * @Version 1.0
 *
 * 题目描述：
《XX魔法书》中记载，只有魔法师体内地火水风四种元素平衡的时候才是绝对安全的。
某魔法师在给自己做了一个体检，发现自己体内的四种元素数量分别是A，B，C，D，
魔法师慌了，这时他看到魔法书中记载了一种转换魔法，
可以把任意两个单位的元素转换成任意一种元素。

请问魔法师是否可以通过这种魔法，在保证自己体内的元素总量尽可能多的情况下，
使得自己体内的四种元素数量完全相同？如果可以，请输出平衡后体内元素总量，
如果不能请输出-1。
样例输入
1 2 2 4
样例输出
8
 */
import java.util.*;
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long[] nums = new long[]{A,B,C,D};
        if(A+B+C+D<4)  {
            System.out.print(-1) ;
            return;
        }
        long sumary = 0;
        for (long num : nums) {
            sumary += num;
        }

        long avg = (sumary / 4) + 1;
        int load;
        do {
            avg--;
            load = 0;
            long aa = 0;
            for (long num : nums) {
                if (num <= avg) {
                    load += (num - avg);

                } else {
                    //   load += ((num - avg) >> 1);
                    aa+=(num - avg);

                }
            }
            load+=(aa>>1);
        } while (load < 0);

        System.out.print(avg);
    }
}