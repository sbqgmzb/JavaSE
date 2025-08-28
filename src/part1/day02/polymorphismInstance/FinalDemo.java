package part1.day02.polymorphismInstance;

public class FinalDemo {
    public static void main(String[] args) {
        //final修饰基本类型==》不可再修改
        final int i=10;
//        i=30;报错
        //final修饰引用类型，地址不可改，但内容可改
        final int[] arr=new int[]{11,22,33};
//        arr=new int[]{34,56,88};报错
        arr[0]=30;
        System.out.println(i);
        System.out.println(arr[0]);
    }
}

//常量：用static final修饰的成员变量==》一般记录系统的配置信息，常量名全字母大写，用_链接单词
//常量编译后会“宏替换”，被直接替换成字变量，保证性能==》static final 成员变量=常量