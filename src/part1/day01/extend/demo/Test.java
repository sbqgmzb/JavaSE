package part1.day01.extend.demo;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.fun1();
        b.fun1(8);
        b.fun2();
        System.out.println(b.a);
        System.out.println(b.x);
        System.out.println(b.b);

        //System.out.println(b.c); 报错
        /**
         * 继承的特点：
         * 1、单继承：不支持多继承，但可以多层继承
         * 2、成员访问遵循就近原则，自己有优先自己的，如果没有则向父类中找。
         * 3、用super访问父类成员，只能在非静态方法中使用
         *      super()在构造器中的使用：
         *        1、子类构造方法中默认会调用基类的无参构造方法：super()；
         *        2、super()永远在子类构造器的第一行；
         *        3、只出现一次，且不和this()同时存在
         *        4、父类无无参构造器时，子类需要用super(...)创建父类的有参构造器
         **/
    }
}
