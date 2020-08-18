package alibaba;

<<<<<<< HEAD
public class Q1 {
    public static void main(String[] args) {
       int a=Integer.MIN_VALUE;
       int b=Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(b);
=======
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class Q1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        //左边为数字，右边为count
        Map<Integer, Integer> numCount = new HashMap<>();
        int temp;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp = scanner.nextInt();
                if (numCount.get(temp)!=null){
                    numCount.put(temp,numCount.get(temp)+1);
                }else {
                    numCount.put(temp,1);
                }
            }
        }
        List<Integer> nums = new ArrayList<>(numCount.keySet());
        Collections.sort(nums);
        int count = 0,maxNum = nums.get(nums.size()-1);
        for (int i = 0;i < nums.size() - 1;i++){
            temp = maxNum - nums.get(i);
            if (temp%d!=0){
                count = -1;
                break;
            }else {
                count += numCount.get(nums.get(i)) * (temp / d);
            }
        }
        System.out.println(count);
>>>>>>> 8714c85ff0d5c991b6cebbb60c16ad3d5f23daef
    }
}