package bilibili;

public class Test4 {
    public static void main(String[] args) {
        int n=200;
        int i = GetCoinCount(n);
        System.out.println(i);

    }
    public static int GetCoinCount (int N) {
        if(N<=0||N>1024) return -1;
        if(N==1024) return 0;
        int m= 1024-N;
        int a=m/64;//64
        int b=(m%64)/16;//16
        int c=((m%64)%16)/4;//4
        int d= m-(a*64+b*16+c*4);
        return a+b+c+d;
    }
}
