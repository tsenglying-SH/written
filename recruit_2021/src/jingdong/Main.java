package jingdong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        double result = 0L;
        int sign = 1;
        for (int i = 1; i <= n; i++) {
            result += sign * (1.0000) / (5L * 2L * i);
            sign = -sign;
        }
        System.out.println(String.format("%.4f", result));

    }
}