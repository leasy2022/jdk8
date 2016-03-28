package _test.util.concurrent.atomic.AtomicBoolean.demo1;

import java.util.concurrent.TimeUnit;

/**
 * Created by wushang on 16/3/28.
 */
public class BarWorker2 implements Runnable {

    private static volatile boolean exists = false;//volatile 使变量可视

    private String name;

    public BarWorker2(String name) {
        this.name = name;
    }

    public void run() {
        // 只允许一个线程去执行,其余线程不执行
        if (exists == false) {   // 这几行组合在一起类似CAS
            synchronized (BarWorker2.class) {
                if (exists == false) {
                    exists = true;
                    System.out.println(name + " enter");
                    try {
                        System.out.println(name + " working");
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        // do nothing
                    }
                    System.out.println(name + " leave");
                } else {
                    System.out.println(name + " give up --- 1");
                }
            }
        } else {
            System.out.println(name + " give up --- 2");
        }
    }

}

