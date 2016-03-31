package _test.util.concurrent.atomic.AtomicLong.demo1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wushang on 16/3/29.
 */
public class _1_最大长度 {
    public static void main(String[] args ) {
        AtomicLong num = new AtomicLong(10000000000L); // long  需要 加 L后缀
        System.out.println(num.longValue());
        System.out.println(num.intValue()); //超出了int最大值,不报异常
    }
}
