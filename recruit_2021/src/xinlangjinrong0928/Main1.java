package xinlangjinrong0928;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author TianTian
 * @Date 2020/9/28 19:54
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
    }
}
