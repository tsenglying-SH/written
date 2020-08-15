package bilibili;

import java.math.BigInteger;

/**
 * @ClassName Test
 * @Description 大数相加
 * @Author Tsenglying
 * @Date 2020/8/14 17:14
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        BigInteger a= new BigInteger("1231213347845713824718237489123748343246217489132");
        BigInteger b = new BigInteger("623478573127438912743892017489132748172341324132");
        String sum=a.add(b).toString();
        String sub=a.subtract(b).toString();
        String mul=a.multiply(b).toString();
        String div=a.divide(b).toString();
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        char c='2';
        Integer integer = Integer.valueOf(c);
        System.out.println(c);

    }
}
