package _test.java.util.concurrent.FutureTask.demo1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by wushang on 16/3/30.
 */
//http://www.cnblogs.com/dolphin0520/p/3949310.html
public class _1_Callable_Future {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> result = service.submit(new Task());
        service.shutdown();

        System.out.println(result.get()); // get 阻塞函数

    }
}

class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在运行");
        Thread.sleep(2000);
        int sum = 0;
        for (int i = 0; i < 100; ++i) {
            sum += i;
        }
        return sum;
    }
}
