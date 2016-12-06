package _test.关于线程;

/**
 * Created by wushang on 16/4/15.
 */
import java.util.concurrent.TimeUnit;
//​网上找的例子：模拟忙等待过程
class MyObject implements Runnable {
    private Monitor monitor;

    public MyObject(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("i'm going.");
            monitor.gotMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Monitor implements Runnable {
    private volatile boolean go = false;

    public synchronized void gotMessage() throws InterruptedException {
        go = true;
        notify();
    }

    public synchronized void watching() throws InterruptedException {
        while (go == false)
            wait(); // 放弃锁资源,等待被唤醒, 和 while, synchronized, notify 等一起使用
        System.out.println("He has gone.");
    }

    public void run() {
        try {
            watching();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class _03_Wait {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        MyObject o = new MyObject(monitor);
        new Thread(o).start();
        new Thread(monitor).start();
    }
}