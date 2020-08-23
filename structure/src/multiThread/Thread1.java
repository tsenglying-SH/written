package multiThread;

/**
 * @ClassName Thread1
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/22 16:34
 * @Version 1.0
 **/
public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("从线程执行" + i);
        }
    }

    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("主线程执行" + i);
        }
    }
}
