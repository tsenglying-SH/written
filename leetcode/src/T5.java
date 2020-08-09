import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String sub= palindrome(s);
        System.out.println(sub);
    }

    private static String palindrome(String s) {
        if(s.equals("")) return s;
        int N=s.length();
        boolean[][] dp =new boolean[N][N];
        int max=0,begin=0;
        for (int i = 0; i < N; i++) {
            dp[i][i]=true;
        }
        for (int j = 0; j <N ; j++) {
            for (int i = 0; i < N; i++) {
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else{
                    if(j-i<3){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if(dp[i][j]&&j-i+1>max){
                    max=j-i+1;
                    begin=i;
                }
            }
        }
       return s.substring(begin,begin+max);
    }
}
