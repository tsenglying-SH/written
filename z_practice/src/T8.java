import java.util.*;

/**
 * @ClassName T8
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/6 19:56
 * @Version 1.0
 **/
public class T8 {
    public static void main(String[] args) {
        String s = "aaaabbbbbbbcccccddeeffggkkjjii";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
       /* Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });*/
       Collections.sort(list,(o1,o2)->(o2.getValue()-o1.getValue()));
        for (int i = 0; i < 3; i++) {
        System.out.println(list.get(i).getKey());
    }
}
}
