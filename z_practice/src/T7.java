/**
 * @ClassName T7
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/5 11:11
 * @Version 1.0
 **/
public class T7 {
    public static void main(String[] args) {
        for (int i = 1; i <1000; i++) {
            if(!contains(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean contains(int i) {
        String s= String.valueOf(i);
        int len=s.length();
        for (int j = 0; j < len; j++) {
            if(s.charAt(j)=='5'){
                return true;
            }
        }
        return false;
    }
}
