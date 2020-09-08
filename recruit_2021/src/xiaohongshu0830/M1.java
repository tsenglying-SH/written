package xiaohongshu0830;

import java.util.Scanner;

/**
 * @ClassName M1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/8/30 18:31
 * @Version 1.0
 **/
public class M1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] res;
        StringBuffer sb = new StringBuffer();
        while (in.hasNextLine()){
            String line = in.nextLine() ;
            if (line.length()==0)break;
            sb.append(line +"\n");
        }

        res = splitMsg(sb.toString());
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.format("msg%d:%s",res_i+1,res[res_i]));
        }
    }

    public static String[] splitMsg(String text) {
        int MAX_SIZE = 1024;
        String[] split = text.split("\n");
        return split;

    }

}
