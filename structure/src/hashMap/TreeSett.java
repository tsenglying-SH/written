package hashMap;

import java.util.Iterator;
import java.util.TreeSet;
/*Tree 可以自然排序*/
public class TreeSett {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(5);
        ts.add(8);
        ts.add(10);
        ts.add(1);
        ts.add(2);
        System.out.println(ts);
        //遍历 treeSet使用迭代器
        Iterator iter = ts.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
