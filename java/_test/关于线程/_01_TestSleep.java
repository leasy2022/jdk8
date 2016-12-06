package _test.关于线程;

/**
 * Created by wushang on 16/4/15.
 */
public class _01_TestSleep {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        System.out.println(System.currentTimeMillis()/1000 + " begin----");
        Task.sleep(1000); //static方法, 当前线程暂停
        task.sleep(1000); // static方法,当前线程暂停
        System.out.println(System.currentTimeMillis()/1000 + " over----");
    }
}

class Task extends Thread {
    @Override
    public void run() {

    }
}