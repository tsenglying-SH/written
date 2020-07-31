/**
 * @ClassName Q34
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/7/30 16:54
 * @Version 1.0
 **/
import java.util.*;
public class Q34 {
    public static void main(String[] args) {
        int google = FirstNotRepeatingChar("google") ;
        System.out.println(google);
    }
    public static int FirstNotRepeatingChar(String str) {
        int count=1;
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            if ( map.containsKey(String.valueOf(str.charAt(i)))){
                count+=1;
                map.remove(String.valueOf(str.charAt(i)));
            }
            map.put(String.valueOf(str.charAt(i)),count);
        }
        for (int i=0;i<str.length();i++){
            int num=map.get(String.valueOf(str.charAt(i)));
            if(num==1) return i;
            break;
        }
        return -1;
    }
}
