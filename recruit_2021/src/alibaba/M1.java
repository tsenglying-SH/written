package alibaba;

/*反转单词顺序：
 * 输入“I am a student”
 * 输出:"tneduts a ma I"*/
public class M1 {
    public static void main(String[] args) {
        String s = "I am a student";
        String s1 = reverse(s);
        System.out.println(s1);
    }

    private static String reverse(String s) {
        int len = s.length();
        if (len == 0) return s;
        String res = "";
        String[] arr = s.split("\\s");
        for (int i = arr.length - 1; i >= 1; i--) {
            res += new StringBuilder(arr[i]).reverse().toString() + " ";
        }
        return res += arr[0];
    }
}
