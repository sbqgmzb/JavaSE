package part1.day03.innerClass.staticClass;

public class Outer {
    public static String b="外部类静态成员";
    public String a="外部类实例成员";

//    静态成员直接用类名调用就可
    public static class Inner {
        //只能访问外部类的静态成员

    public void show() {
//        System.out.println(a);报错
        System.out.println(b);
    }
    }
}
