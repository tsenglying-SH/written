package bilibili;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {7, 2, 1, 10};
        boolean b = Game24Points(a);
        System.out.println(b);
    }

    public static boolean Game24Points(int[] arr) {
        if (arr.length != 4) return false;
        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
        }
=======
/**
 * @ClassName Test1
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/14 8:57
 * @Version 1.0
 *链接：https://www.nowcoder.com/questionTerminal/fbc417f314f745b1978fc751a54ac8cb?f=discussion
来源：牛客网

问题描述：给出4个1-10的数字，通过加减乘除，得到数字为24就算胜利
输入：
4个1-10的数字。[数字允许重复，但每个数字仅允许使用一次，测试用例保证无异常数字]
输出：
true or false
输入描述:
输入4个int整数
输出描述:
返回能否得到24点，能输出true，不能输出false*/
public class Test1 {
    public static void main(String[] args) {

    }
    public static boolean is24(int[] arr){
        if(arr.length!=4) return false;

>>>>>>> acf08fa6a0ed2c9a865add7a2efeac1099143210
        return false;
    }
}
