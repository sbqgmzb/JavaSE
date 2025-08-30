package part1.day04.preview.lambda;
/*
Lambda表达式本质是匿名内部类：
形态：(形参)->{执行语句}
步骤：
1、创建一个只有一个抽象函数的接口【函数式接口】
2、在测试类定义一个主方法和一个使用接口的方法useInterface()
3、在主方法中调用useInterface(Lambda表达式代替重写的方法)
*/

//第一种：无参数无返回值
@FunctionalInterface
interface A {
    void words();
}


//第二种：有一个参数无返回值
@FunctionalInterface
interface B {
    void words(String s);
}

//第三种：有多种参数和返回值
@FunctionalInterface
interface C {
    int counter(int a, int b);
}

public class LambdaTest {
    public static void main(String[] args) {
        //当方法体只有一句时，可以省略大括号和分号,有return时可以省去
        useA(() -> System.out.println("你好"));

        //当参数只有一个时，可以省略数据类型
        useB(s -> System.out.println(s));

        //当参数不止一个时，要么全部省略数据类型，要么都不省略
        useC((x, y) -> x + y);

    }

    public static void useA(A a) {
        a.words();
        System.out.println("===========================");
    }
//    -----------------------------------------------------------

    public static void useB(B b) {
        b.words("一天一苹果，医生远离我");
        System.out.println("===========================");
    }

    //    -----------------------------------------------------------
    public static void useC(C c) {
        int sum = c.counter(10, 20);
        System.out.println(sum);
    }
}
