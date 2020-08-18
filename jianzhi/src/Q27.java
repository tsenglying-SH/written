import java.util.*;

/**
 * @ClassName Q27
 * @Description 字符串的排列
 * @Author Tsenglying
 * @Date 2020/8/18 20:48
 * @Version 1.0
 **/
public class Q27 {
    public static ArrayList<String> Permutation(String str) {
        int len=str.length();
        Map<Character,Integer> map= new HashMap<>();
        ArrayList<String> list= new ArrayList<>();
        ArrayList<String> res= new ArrayList<>();
        for(int i=0;i<len;i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
                list.add(String.valueOf(str.charAt(i)));
            }
        }
        Collections.sort(list);
        int n= list.size();
        boolean[] used= new boolean[n];
        bfs(list,n,0,used,res);
        return res;
    }
    public static void bfs(List<String> list,int n,int depth,boolean[] used,ArrayList<String> res){
        if(depth==n){
            return ;
        }
        for(int j=0;j<n;j++){
            if(!used[j]){
                res.add(list.get(j));
                used[j]=true;
                bfs(list,n,depth+1,used,res);
                res.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        String s="ababc";
        ArrayList<String> permutation = Permutation(s);
        System.out.println(permutation);
    }
}
