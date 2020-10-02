package qunaer0923;

import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/23 18:07
 * @Version 1.0
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        String s = sc.nextLine();
        String[] split = s.split("\\s");
        String res = puke(num, split);
        System.out.println(res);
    }

    private static String puke(int num, String[] split) {
        String[] huase = new String[num];
        String[] number = new String[num];
        for (int i = 0; i < num; i++) {
            huase[i] = split[i].substring(0, 1);
            number[i] = split[i].substring(1, 2);
        }
        for (int i = 0; i < num-1; i++) {
            if(huase[i]==huase[i+1]){
                return "TongHua";
            }
        }
        return "GaoPai";
    }
}
