package part1.day03.block;

public class StaticTest {
    public static String name;

    //静态代码块可以让某个还未知的静态变量通过某种执行后得到结果
    static {
        name="歪比巴卜";
        System.out.println("静态代码块执行力...");
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("main执行了");

    }
}
