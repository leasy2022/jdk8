package _test.util.concurrent.atomic.AtomicBoolean.demo1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by wushang on 16/3/28.
 */
public class BarWorker implements Runnable {

    private static AtomicBoolean exists = new AtomicBoolean(false);

    private String name;

    public BarWorker(String name) {
        this.name = name;
    }

    public void run() {
        // 只允许一个线程去执行,其余线程不执行
        if (exists.compareAndSet(false, true)) {
            System.out.println(name + " enter");
            try {
                System.out.println(name + " working");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // do nothing
            }
            System.out.println(name + " leave");
            exists.set(false);//设置为false, 另外一个线程开始执行
        } else {
            System.out.println(name + " give up");
        }
    }

}

