package xiaohongshu0830;

import java.util.*;

/**
 * @ClassName M2
 * @Description TODO
 * @Author TianTian
 * @Date 2020/8/30 20:08
 * @Version 1.0
 **/
public class M2 {
    public static int maxBoxes(int[][] boxes) {
        int row= boxes.length;
        int col=boxes[0].length;
        int res=0,count=1;
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
           list1.add(boxes[i][0]);
           map.put(boxes[i][0],boxes[i][1]);

        }
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            list2.add(map.get(list1.get(i)));
        }
        for (int i = 0; i < list2.size()-1; i++) {
            if(list2.get(i)<list2.get(i+1)){
                count++;
            }
        }
        res=count;
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
        int _boxes_rows = 0;
        int _boxes_cols = 0;
        _boxes_rows = Integer.parseInt(in.nextLine().trim());
        _boxes_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _boxes = new int[_boxes_rows][_boxes_cols];
        for(int _boxes_i=0; _boxes_i<_boxes_rows; _boxes_i++) {
            for(int _boxes_j=0; _boxes_j<_boxes_cols; _boxes_j++) {
                _boxes[_boxes_i][_boxes_j] = in.nextInt();

            }
        }
        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = maxBoxes(_boxes);
        System.out.println(String.valueOf(res));

    }

}
