package _test;

import java.nio.ByteOrder;

/**
 * Created by wushang on 16/4/15.
 */
// 要求: 把整数转换成字节数组: byte[0]为存储数据低位, byte[3]存储数据高位
public class _02_位运算 {

    public boolean isBigEndian() { //判断是大端还是小端
        return ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public byte[] unpackBigEndian(int x) { //高位在前，低位在后。
        return new byte[]{
                (byte) (x >>> 24),// 强制类型转换, 总是转换低字节部分,操作系统已经屏蔽了内存地址
                (byte) (x >>> 16),// 把内存地址看做是从右至左,依次增大;符号方向同移动方向就一致了
                (byte) (x >>> 8),
                (byte) (x >>> 0)
        };
    }

    public byte[] unpackInt(int x) {//低位在前，高位在后
        return new byte[]{
                (byte) (x >>> 0),
                (byte) (x >>> 8),
                (byte) (x >>> 16),
                (byte) (x >>> 24)
        };
    }

    public static void main(String[] args) {
        System.out.println(new _02_位运算().isBigEndian());
        byte[] bytes = new _02_位运算().unpackInt(1000);
        System.out.println(bytes[0]);
        System.out.println(bytes[1]);
    }
}
