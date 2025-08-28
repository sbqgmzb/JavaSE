package designPatterns.singleton;

/*
 * 懒汉式单例模式：要对象时，对象才创建(延迟加载对象)
 * 使用场景：任务管理器对象，获得运行对象
 * 步骤：
 * 1、把类的构造器私有化
 * 2、定义一个静态变量去记住类
 * 3、定义一个静态方法返回对象
 * */
class B{
    //2、用静态变量接受对象，不创建对象
    private static B b;
    //1、构造器私有化
    private B(){}
    //3、定义一个静态方法返回对象
    public static B getInstance(){
        //需要时才创建对象
        if(b == null){
            b = new B();
        }
        return b;
    }
}
public class LazySingleton {
    public static void main(String[] args) {
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1 == b2);
    }
}
