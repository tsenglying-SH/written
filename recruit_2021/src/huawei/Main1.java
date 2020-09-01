package huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        long big= 4294967295L;
        String[] splits = s.split("\\s");
        int len = splits.length;
        long [] num = new long[len];
        for (int i = 0; i < len; i++) {
            num[i] = Long.valueOf(splits[i]);
            if(num[i]>big){
                System.out.println(-1);
            }
        }
        ArrayList<Long> list = addSome(num, len);
        for (int i = 0; i < len-1; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.get(len-1));
    }

    private static ArrayList<Long> addSome(long [] num, int len) {
        ArrayList<Long> list = new ArrayList<>();
        String[] binary = new String[len];
        for (int i = 0; i < len; i++) {
            binary[i] = toBinary(num[i]);
            binary[i] = getChange(binary[i]);
        }
        String temp=binary[len-1].substring(30);
        for (int i = 1; i < len; i++) {
            binary[i] = binary[i - 1].substring(30) + binary[i].substring(0, 30);
        }
        binary[0] = temp + binary[0].substring(0, 30);
        for (int i = 0; i < len; i++) {
            list.add(Long.parseLong(binary[i], 2));
        }
        return list;
    }

    public static String toBinary(long a) {
        String s = Long.toBinaryString(a);
        int le = 32 - s.length();
        String zero = "";
        for (int i = 0; i < le; i++) {
            zero += "0";
        }
        return zero + s;
    }

    public static String getChange(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < 32; i = i + 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
        String res = String.valueOf(chars);
        return res;
    }
}
