package multiThread;

/**
 * @ClassName Thread3
 * @Description 存在并发问题
 * @Author Tsenglying
 * @Date 2020/8/22 19:48
 * @Version 1.0
 **/
public class Thread3 implements Runnable {
    int tickNum=10;
    @Override
    public void run() {
        while(true){
            if(tickNum<0){
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"买了第"+tickNum--+"张票");
        }
    }

    public static void main(String[] args) {
        Thread3 th3= new Thread3();
        new Thread(th3,"窗口1").start();
        new Thread(th3,"窗口2").start();
        new Thread(th3,"窗口2").start();
    }
}
