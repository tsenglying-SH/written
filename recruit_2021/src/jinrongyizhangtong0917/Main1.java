package jinrongyizhangtong0917;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int res= getFriends(n,arr);
        System.out.println(res+1);
    }

    private static int getFriends(int n, int[] arr) {
        int count=0;
        if(n==1){
            if(arr[0]>=2) return count;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(arr[i]-1<=i){
                count++;
            }
        }
        return count;
    }
}
