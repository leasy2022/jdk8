package _test;

/**
 * Created by wushang on 16/4/13.
 */
public class _hashCodeTest {
    public static void main(String[] args) {
        System.out.println("5".hashCode()); // 虽然是字符串,其实是单个字符, 字符就等于整数 53
        System.out.println(new Integer(10).hashCode());//数字,返回自身  10
        System.out.println(new Long(115).hashCode());//数字,返回自身  10
        System.out.println(new Integer(-10).hashCode());//数字,返回自身  -10
        System.out.println(new Boolean(true).hashCode());//1237
        System.out.println(new Boolean(false).hashCode());//1231
        System.out.println("50".hashCode()); //字符串 1691


        System.out.println(new Student().hashCode());// 自定义

        System.out.println(new _hashCodeTest().hashCode()); //没有自定义,对象的内存地址计算而来


    }
}

class Student {
    @Override
    public int hashCode() {
        return 1314;
    }
}