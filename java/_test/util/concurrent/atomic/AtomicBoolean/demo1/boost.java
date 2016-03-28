package _test.util.concurrent.atomic.AtomicBoolean.demo1;

/**
 * Created by wushang on 16/3/28.
 */
public class boost {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BarWorker("thread-1"));
        Thread t2 = new Thread(new BarWorker("thread-2"));
        t1.start();
        t2.start();
    }
}
/*
thread-2 give up
thread-1 enter
thread-1 working
thread-1 leave
 */