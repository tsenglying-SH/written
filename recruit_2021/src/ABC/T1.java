package ABC;

/**
 * @ClassName T1
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/29 10:13
 * @Version 1.0
 **/
public class T1 {
    public static void main(String[] args) {

        String s1 = toThree(123);
        System.out.println(s1);
        String s = triCoding(123);
        System.out.println(s);

    }


    public static String toThree(int n) {
        String str = "";
        while (n != 0) {
            str = n % 3 + str;
            n = n / 3;
        }
        return str;
    }
    public static String triCoding(int num){
        String s=toThree(num);
        String res= "";
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='0'){
                res+="@";
            }else if(s.charAt(i)=='1'){
                res+="$";
            }else{
                res+="&";
            }
        }
        return res;
    }


}
