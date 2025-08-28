package part0.day06_api.string.demo;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="ab";
        String s3=s1+"c";
        System.out.println(s1==s3);
        //false
        //这种包含变量的拼接操作，Java 会在堆内存中创建新的 String 对象
        System.out.println("==========================");
        String c1="abc";
        String c2="a"+"b"+"c";
        System.out.println(c1==c2);
        //true
        //java 编译器会进行编译期优化，将"a"+"b"+"c"多个字符串常量直接拼接，合并为"abc"
    }
}
