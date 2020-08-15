package meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> sta = new ArrayList<>();
        ArrayList<String> end = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sta.add(sc.next());
            end.add(sc.next());
        }
        sc.close();
        ArrayList<String> lujin = new ArrayList<>();
        if (sta.size() > 0) {
            int count = 0;
            for (int i = 0; i < sta.size(); i++) {
                String s = sta.get(i);
                String s1 = end.get(i);
                lujin.add(sta.get(i));
                lujin.add(end.get(i));
                sta.remove(i);
                end.remove(i);
                int drawback = drawback(sta, end, s, lujin);
                sta.add(i, s);
                end.add(i, s1);
                count = Math.max(count, drawback);
            }
            System.out.println(count);
        } else {
            System.out.println(0);
        }
    }

    public static int drawback(List<String> start, List<String> end,
                               String startPiont, List<String> path) {
        if (start.isEmpty()) {
            if (path.isEmpty())
                return 0;
            int count = 0;
            String tempStart = path.get(0);
            for (int i = 1; i < path.size(); i++) {
                if (path.get(i).equals(tempStart)) {
                    count++;
                    if (i < path.size() - 1) {
                        tempStart = path.get(i + 1);
                        i++;
                    }
                }
            }
            return count;
        }
        int count = 0;
        for (int i = 0; i < start.size(); i++) {
            if (start.get(i).equals(path.get(path.size() - 1))) {
                String s = start.get(i);
                String s1 = end.get(i);
                path.add(end.get(i));
                start.remove(i);
                end.remove(i);
                if (s1.equals(startPiont)) {
                    if (i < start.size() - 1) {
                        startPiont = start.get(i);
                        path.add(startPiont);
                        path.add(end.get(i));
                    }
                }
                int drawback = drawback(start,end,startPiont,path);
                if(drawback!=0){
                    count=Math.max(count,drawback);
                    break;
                }
                start.add(i,s);
                end.add(i,s1);
                count=Math.max(count,drawback);
            }
        }
        return count;
    }

}
