package wangyihuyu;

import java.util.ArrayList;
import java.util.Scanner;
public class M3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] size= new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            size[i] = sc.nextInt();
            int[][]input = new int[size[i]][2];
            for (int j = 0; j < size[i]; j++) {
                input[j][0]=sc.nextInt();
                input[j][1]=sc.nextInt();
            }
            int res= getMiGong(size[i],input);
            list.add(res);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

    private static int getMiGong(int size, int[][] input) {
        int countU=0;
        int countR=0;
        for (int i = 0; i < size; i++) {
            if(input[i][1]==1){
                if(input[i][0]==0){
                    countU++;
                }else if(input[i][0]==1){
                    countU--;
                }else if(input[i][0]==2){
                    countR--;
                }else if(input[i][0]==3){
                    countR++;
                }
            }
        }
        return countU+countR;
    }

}
