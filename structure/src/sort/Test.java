package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        int[] hh = new int[]{1,2,3};
        System.out.println(Arrays.toString(hh));
        System.out.println(list.get(3));

    }
}
