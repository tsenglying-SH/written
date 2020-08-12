package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*1.HashMap是一个散列表，它存储的是键值对（key-value）映射；

2.HashMap继承AbstractMap，实现了Map，Cloneable，Serializable接口；

3.HashMap的实现不是同步的，线程不安全，但是效率高；

4.HashMap允许null键和null值，是基于哈希表的Map接口实现；

5.哈希表的作用是用来保证键的唯一性；

6.HashMap的实例有两个参数影响其性能：初试容量和加载因子，
当哈希表中的条目数超出加载因子与当前容量的乘积时，
要对哈希表进行rehash操作（即重建内部数据结构），容量扩大约为之前的两倍，加载因子默认值为0.75；*/
public class HashMapp {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("三月",1);
        map.put("猫三月",2);
        map.put("小三猫",3);

        // 遍历hashMap

        // 1.采用keySet（）集合取值二次遍历
        long start = System.currentTimeMillis();
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println("key: "+s+" value: "+map.get(s));
        }
        long end =System.currentTimeMillis();
        System.out.println("用时："+(end-start)+"ms");

        // 2.采用entrySet()分别取getKey()和getValue()取值，效率高
        long startTime = System.currentTimeMillis();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print("key: "+entry.getKey());
            System.out.println(" value: "+entry.getValue());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-startTime)+"ms");
    }
}
