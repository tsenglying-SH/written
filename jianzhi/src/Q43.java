/**
 * @ClassName Q43
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/7/30 16:19
 * @Version 1.0
 **/
public class Q43 {
    public String LeftRotateString(String str,int n) {
        if (n==0) return str;
        if(str.trim().isEmpty()) return str;
        String b=str.substring(0,n);
        String d=str.substring(n);
        return d+b;

    }
}
