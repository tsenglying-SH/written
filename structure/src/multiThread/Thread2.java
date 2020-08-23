package multiThread;

/**
 * @ClassName Threa2
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/22 17:08
 * @Version 1.0
 **/
public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("从线程"+i);
        }
    }

    public static void main(String[] args) {

       Thread2 thread2= new Thread2();
        new Thread(thread2).start();

        for (int i = 0; i < 5000; i++) {
            System.out.println("主线程"+i);
        }
    }
}
