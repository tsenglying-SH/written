package eastMoney;

        import java.util.ArrayList;
        import java.util.Scanner;
        import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int N = 0, n = 0, k = 0;
        N = in.nextInt();
        n = in.nextInt();
        k = in.nextInt();
        in.close();
        Stack<Integer> stack= new Stack<>();
        getPath(N, n,1,stack,res);
        if(k>res.size()) {
            System.out.println(-1);
        }
        System.out.println(res.get(k-1));
    }

    public static void getPath(int N, int n,int start, Stack<Integer> path,
                               ArrayList<ArrayList<Integer>> res) {
        if(path.size()==n){
            res.add(new ArrayList<>(path));
            return ;
        }
        for (int j = start; j <=N ; j++) {
            path.push(j);
            getPath(N,n,start+1,path,res);
            path.pop();
        }
    }
}
