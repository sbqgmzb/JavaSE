package part1.day01.extend.demo;

public class B extends A {
    String a="B的变量a";
    String x="B的变量x";

    public static void main(String[] args) {
        B b=new B();
        b.fun1(1);
        b.fun2();
        System.out.println(b.a);
        System.out.println(b.x);
        System.out.println(b.b);
    }

    public void fun1(int x){
        System.out.println("B的有参方法fun1");
    }

    public void fun2(){
        System.out.println("B的无参fun2");
    }
}
