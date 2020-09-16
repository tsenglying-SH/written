    package xiaomi0915;

    import java.util.HashSet;
    import java.util.Scanner;
    import java.util.Set;

    /**
     * @ClassName Main2
     * @Description TODO
     * @Author TianTian
     * @Date 2020/9/15 18:49
     * @Version 1.0
     **/
    public class Main2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String res= removeRepeat(s);
            System.out.println(res);
        }

        private static String removeRepeat(String s) {
            Set<Character> set = new HashSet<>();
            String res="";
            int len=s.length();
            for (int i = 0; i < len; i++) {
                if(!set.contains(s.charAt(i))){
                    set.add(s.charAt(i));
                    res+=s.charAt(i);
                }
            }

            return res;
        }
    }
