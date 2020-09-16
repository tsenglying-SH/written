package wangyi0912;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/12 14:36
 * @Version 1.0Main1
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String [] arr= new String[n];
        for (int i = 0; i < n; i++) {
            String ss=sc.nextLine();
            arr[i]=ss;
        }
        System.out.println(Arrays.toString(arr));
        List<List<String>> list= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] split = arr[i].split("\\s");
            List<String> line= new ArrayList<>();
            for (int j = 0; j < split.length; j++) {
                line.add(split[j]);
            }
            list.add(line);
        }
        
        
    }
    public static ArrayList<String> paiLie(  List<List<String>> list,int n){
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i <n ; i++) {


        }
        
        
        return res;
    }
}
