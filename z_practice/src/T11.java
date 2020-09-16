/**
 * @ClassName T11
 * @Description 最大公约数 最小公约数 其中最大公约数*最小公倍数=a*b
 * @Author TianTian
 * @Date 2020/9/8 23:48
 * @Version 1.0
 **/
public class T11 {
    public static void main(String[] args) {
        int i = getmaxResult(5, 7);
        System.out.println(5*7/i);
    }

    // 最大公约数-辗转相除
    public static int getmaxResult(int a ,int b){
        int m= a%b;
        while(m!=0){
            a=b;
            b=m;
            m=a%b;
        }
        return b;
    }
   /* public class SingletonDemo1 {

        //线程安全的
        //类初始化时，立即加载这个对象
        private static SingletonDemo1 instance = new SingletonDemo1();

        private SingletonDemo1() {
        }

        //方法没有加同步块，所以它效率高
        public static SingletonDemo1 getInstance() {
            return instance;
        }
    }*/
}
