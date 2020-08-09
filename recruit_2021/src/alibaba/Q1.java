package alibaba;

public class Q1 {
    public static void main(String[] args) {
        String s1 = "111",s2 = "10";
        // 二进制转十进制  int n= Integer.valueOf(s1,2);
        // 十进制转二进制  String ss = Integer.toBinaryString(num);
        int num = Integer.valueOf(s1,2)+Integer.valueOf(s2,2);
        // 十进制转为二进制
      /*  String s= "";
        while(num!=0){
            s=num%2+s;
            num=num/2;
        }
        int res=Integer.valueOf(s);
        System.out.println(res);*/

        // 十进制转二进制第二种
        String ss = Integer.toBinaryString(num);
        int res2=Integer.valueOf(ss);
        System.out.println(res2);
    }
}
