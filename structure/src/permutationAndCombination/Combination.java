package permutationAndCombination;

/**
 * @ClassName Combination
 * @Description 组合数
 * @Author Tsenglying
 * @Date 2020/8/18 9:48
 * @Version 1.0
 * <p>
 * c（n,m)=A(n,m)/m!  并且C(n,m)=C(n,n-m)，运用排列数除以m的阶乘
 *
 */
public class Combination {
    public static int combination(int n, int m) {
        m = m > (n - m) ? (n - m) : m;
        int numerator = 1;// 分子
        int denominator=1; // 分母

        for(int i=m;i>0;i--){
            numerator*=n;
            n--;
            denominator*=i;
        }

        return numerator/denominator;
    }

    public static void main(String[] args) {
        int a= combination(1000,3);
        System.out.println(a);//
    }
}
