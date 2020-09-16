package xiecheng0908;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Q1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/8 20:04
 * @Version 1.0
 **/
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] split1 = s1.split("\\s");
        String[] split2 = s2.split("\\s");
        int[] employee = new int[split1.length];
        int[] task = new int[split2.length];
        for (int i = 0; i < split1.length; i++) {
            employee[i] = Integer.valueOf(split1[i]);
        }
        for (int i = 0; i < split2.length; i++) {
            task[i] = Integer.valueOf(split2[i]);
        }
        int res = employeeNum(employee, task);
        System.out.println(res);
    }

    private static int employeeNum(int[] employee, int[] task) {
        if (employee.length == 0 || task.length == 0) return 0;
        Arrays.sort(employee);
        Arrays.sort(task);
        int x = employee.length;
        int y = task.length;
        int count = 0;
        if (task[0] < employee[0]) return 0;
        if (x >= y) {
            for (int j = 0; j < y; j++) {
                if (task[j] >= employee[j]) {
                     count++;
                }
            }
        }else {
            for (int i = 0; i < x; i++) {
                if(task[i]>=employee[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
