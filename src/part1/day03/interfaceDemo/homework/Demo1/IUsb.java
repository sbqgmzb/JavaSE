package part1.day03.interfaceDemo.homework.Demo1;

/*
* 接口的特点：
* 1、接口是一种引用类型，没有构造器，不可以直接new一个对象
* 2、接口中每个方法都是public的抽象方法，必须由实现接口的类来重写实现，不加修饰词也会默认为public abstract
* 3、由于方法重写，重写的方法必须为public
* 5、接口中的成员变量会被直接指定为public static final==》常量
* 6、接口中不能含有静态代码块和构造方法
* 7、接口编译后的字节码文件后缀格式也是.class
* 8、如果类没有实现接口中所有的抽象方法，那么那个类必须为抽象类
* */

public interface IUsb {
    void openDevice();
    void closeDevice();
}
/*
* 多接口让类变成对象是否拥有的能力了
*/