package part1.day03.block;

/*实例代码块*/
public class InstanceTest {
    static int age;

    /*静态代码块*/
    static {
        System.out.println("静态代码块");
    }

    String name;

    {
        name = "歪比巴卜";
        age = 20;
        System.out.println("实例代码块");
    }

    //创建对象才执行，主要是完成对象创建时给成员变量赋值
    //可以访问静态和非静态成员
    //可以放一些对象相同的属性
    public InstanceTest() {
        System.out.println("无参构造器");
    }

    public InstanceTest(String name) {
        this.name = name;
        System.out.println("有参构造器");
    }

    public static void main(String[] args) {
        //先main后实例
        System.out.println("main方法执行了");
        InstanceTest i = new InstanceTest();
        InstanceTest i1 = new InstanceTest("test");

    }
}
