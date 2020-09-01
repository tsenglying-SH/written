package ABC;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName T3
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/29 10:47
 * @Version 1.0
 **/
public class T3 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list1.add("k2");
        list1.add("k1");
        list1.add("k3");
        list1.add("k5");
        Collections.sort(list1);
        System.out.println(list1);

        for (int i = 0; i <list1.size() ; i++) {
            list2.add(list1.get(i));
        }
        System.out.println(list2);
    }
}
