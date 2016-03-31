package _test.java.util.concurrent.FutureTask.demo1;

import java.util.concurrent.*;

/**
 * Created by wushang on 16/3/30.
 */
public class _2_FutureTask {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(2);
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        service.submit(futureTask);
        service.shutdown();

        System.out.println(futureTask.get());


        //2----
        FutureTask<Integer> futureTask2 = new FutureTask<Integer>(task);
        new Thread(futureTask2).start();
        System.out.println(futureTask2.get());
    }
}

