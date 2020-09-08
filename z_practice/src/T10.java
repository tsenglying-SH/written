import java.util.ArrayList;

/**
 * @ClassName T10
 * @Description list反向添加
 * @Author TianTian
 * @Date 2020/9/6 22:27
 * @Version 1.0
 **/
public class T10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,2);
        list.add(0,3);
        list.add(0,4);
        list.add(0,5);
        System.out.println(list);
    }
}
