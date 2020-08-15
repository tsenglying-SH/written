package bilibili;

import java.util.Scanner;

/**
 * @ClassName Test3
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/14 8:58
 * @Version 1.0
 *假设货币系统包含面值1元、4元、16元、64元共计4种硬币，以及面值1024元的纸币。
 * 现在小明使用1024元的纸币购买了一件价值为N（0＜N＜=1024）的商品,请问最少他会收到多少硬币？

输入示例：

200
输出示例：

17
样例解释：
花200，需要找零824
824 = 12 * 64 + 3 * 16 + 2 * 4

花200，需要找零824块，找12个64元硬币，3个16元硬币，2个4元硬币即可。*/
public class Test3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int num = minCoin(i);
        System.out.println(num);
        sc.close();
    }
    public static int minCoin(int N){
        if(N<=0||N>1024) return -1;
        int m=1024-N;
        int a=m/64;
        int b=(m%64)/16;
        int c=((m%64)%16)/4;
        int d=m-(64*a+16*b+4*c);
        return a+b+c+d;
    }
}
