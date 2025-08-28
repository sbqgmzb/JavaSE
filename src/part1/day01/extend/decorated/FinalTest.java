package part1.day01.extend.decorated;



public class FinalTest {
    public static void main(String[] args) {
        //1、修饰变量或字段--》不可修改
        final int a=10;//a=20;报错


    }
}
final class X{
    //2、修饰方法-->不能被重写
    final void display(){
        System.out.println("X");
    }
}
//
//3、修饰类-->不能被继承
//class Y extends X{}