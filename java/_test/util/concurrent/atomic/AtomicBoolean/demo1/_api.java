package _test.util.concurrent.atomic.AtomicBoolean.demo1;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by wushang on 16/3/28.
 */
public class _api {
    public static void main(String[] args) {
        AtomicBoolean isOk = new AtomicBoolean();
        System.out.println(isOk.get());//默认是false
        System.out.println(isOk.getAndSet(false));
        System.out.println(isOk.get());
        System.out.println(isOk.getAndSet(true));
        System.out.println(isOk.get());

    }
}
