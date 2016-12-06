package _test.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wushang on 16/4/13.
 */
public class _1_AtomicInteger {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(5);
        System.out.println(count.addAndGet(5));
        System.out.println(count.getAndAdd(2));
    }
}
