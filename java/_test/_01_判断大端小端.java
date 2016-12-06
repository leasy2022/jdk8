package _test;

import java.nio.ByteOrder;

/**
 * Created by wushang on 16/4/15.
 */
public class _01_判断大端小端 {
    public static void main(String[] args) {

        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            System.out.println("BIG_ENDIAN");
        } else {
            System.out.println("LITTLE_ENDIAN");
        }

        //误解:
        int i = 1;
        byte b = (byte)i;// 并不能判断大小端,因为向下的类型转换时,保留的是a值的低字节部分,而不是内存中数据的低地址字节部分
        System.out.println(b);
        if(b == 1)
            System.out.println("LITTLE_ENDIAN");
        else
            System.out.println("BIG_ENDIAN");

        System.out.println(i&0xff);
    }
}
