package permutationAndCombination;

/**
 * @ClassName Premutation
 * @Description 排列数
 * @Author Tsenglying
 * @Date 2020/8/18 9:17
 * @Version 1.0
 *A(n,m)=n(n-1)(n-2)……(n-m+1)= n!/(n-m)!(当n=m时，上述式子分母为0!=1).*/
public class Premutation {
    public static int premutation(int n,int m){
        int result=1;
        for (int i = m; i >0 ; i--) {
            result*=n;
            n--;
        }
        return result;
}

    public static void main(String[] args) {
        int a=premutation(100,2);
        System.out.println(a);//9900
    }
}
