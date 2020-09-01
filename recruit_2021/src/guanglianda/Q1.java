package guanglianda;

/**
 * @ClassName Q1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/8/26 22:35
 * @Version 1.0
 *
 * 题目描述：
现在有一个跳舞机。我们用 WSAD 四个大写字母分别表示上下左右四个方向。

跳舞机的给分规则是踩对方向加20分，踩错方向扣10分，当分数为零时不会往下继续扣分（即不会存在负分）

现在第一行是跳舞机满分的舞蹈步骤，第二行是小明踩下的方向。

你的任务是输出小明的得分。
输入描述
两行字符串，完全由大写字母WSAD组成。保证两行字符串的长度相同。

输出描述
一行一个整数表示得分。


样例输入
WASDWWSAD
WASSWWAAD
样例输出
120*/
import java.util.*;

public class Q1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stra = sc.nextLine();
        String strb = sc.nextLine();
        int score = 0;
        for (int i = 0; i < stra.length(); i++) {
            if (stra.charAt(i) == strb.charAt(i)) {
                score += 20;
            } else {
                if (score > 0) {
                    score -= 10;
                }
            }
        }
        System.out.println(score);
    }

}
