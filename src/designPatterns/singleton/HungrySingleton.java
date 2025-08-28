package designPatterns.singleton;

//设计模式：
//单例模式：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
//只有一个实例==》静态区
/*
 * 饿汉式单例模式：拿对象时，对象早创建好了
 * 使用场景：任务管理器对象，获得运行对象
 * 步骤：
 * 1、把类的构造器私有化
 * 2、定义一个静态变量去记住类
 * 3、定义一个静态方法返回对象
 * */
class A {
    //2、创建对象并定义静态变量指向当前类对象
    private static A a = new A();

    //1、把类的构造器私有化
    private A() {
    }

    //定义一个静态方法返回对象
    public static A getInstance() {
        //返回的一直是a对象，构造器私有，保证了只能创造一个对象
        return a;
    }
}

public class HungrySingleton {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 == a2);
    }
}
