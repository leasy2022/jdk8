package _test.util.concurrent.atomic.AtomicLong.demo1;

/**
 * Created by wushang on 16/3/29.
 */
/*
如果数组中的元素类型,为基本类型,则没有影响;

如果是引用, 则和原数组的对象一致,存储的是相同地址.

clone:相当于 新建一个相同长度的数组,然后用for一一赋值
 */
public class _2_clone {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2};
        int[] arrClone = arr.clone();
        printArr(arrClone);

        arrClone[2] = 10; // 使用clone复制数组
        printArr(arr);
        printArr(arrClone);
        System.out.println("1------------");
        Student[] students = new Student[]{new Student("zhang", 10), new Student("li", 15)};
        Student[] studentsClone = students.clone();
        printArr(students);
        printArr(studentsClone);
        System.out.println("2---------------");
        studentsClone[1] = new Student("wang", 24);
        printArr(students);
        printArr(studentsClone);
        System.out.println("3 -------------");
        studentsClone[0].name = "sun";
        printArr(students);
        printArr(studentsClone);
    }
    public static void printArr(int[] arr) {
        for(Object object : arr) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    public static void printArr(Student[] arr) {
        for(Object object : arr) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + name + ":" + age +"]";
    }
}
