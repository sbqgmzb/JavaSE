package part1.day02.enumdemo;

enum A{
    //1.枚举是最终类，不可以被继承
    //2.第一行只能罗列一些名称，这些名称都是常量，且记住枚举类的一个对象

    X,Y,Z;
    //相当于public static final A X=new A();
    //3.枚举类构造器是私有的
}

public class EnumTest {
    public static void main(String[] args) {
        A a = A.X;
        System.out.println(a);
    }
}
/*
* 枚举类很适合做信息分类和标志
* 枚举也可以规避很多编译时查不到的异常
*
* */
