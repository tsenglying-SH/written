package weizhongbank0927;

import java.util.ArrayList;
import java.util.Scanner;

/*
*
1 1 1
4 5
3
1 1
3 4
2 5
*/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int Q = sc.nextInt();
        sc.nextLine();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int xx = sc.nextInt();
            int yy = sc.nextInt();
            swapClass sxx = new swapClass(xx);
            swapClass syy = new swapClass(yy);
            ArrayList<Integer> tem = option(sxx, syy, x, y, z, n, m);
            res.add(tem);
        }
        for (ArrayList<Integer> re : res) {
            System.out.print(re.get(0) + " ");
            System.out.println(re.get(1));
        }
    }

    private static ArrayList<Integer> option(swapClass sxx, swapClass syy, int x, int y, int z, int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            shun(sxx, syy, n, m);
        }
        for (int j = 0; j < y; j++) {
            reverse(sxx, syy, n, m);
        }
        for (int k = 0; k < z; k++) {
            ni(sxx, syy, n, m);
        }
        list.add(sxx.getNum());
        list.add(syy.getNum());
        return list;
    }

    private static void shun(swapClass sxx, swapClass syy, int n, int m) {
        sxx.setNum(syy.getNum());
        syy.setNum(m - sxx.getNum());
    }

    private static void reverse(swapClass sxx, swapClass syy, int n, int m) {
        syy.setNum(m - syy.getNum());
    }

    private static void ni(swapClass sxx, swapClass syy, int n, int m) {
        int temp = sxx.getNum();
        sxx.setNum(m - syy.getNum());
        syy.setNum(temp);
    }

    public static class swapClass {
        private int num;

        public swapClass(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
