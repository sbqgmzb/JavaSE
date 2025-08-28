package part1.day01.extend.statictest;
class Student{
    //static修饰的 变量/方法 是每个对象都共享的 属性/方法
    public static String className="1班";
    //可以做一个对象计数器
    public static int number;
    String name;
    int age;

    public Student() {
        Student.number++;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        Student.number++;
    }
    //如果方法是为了做一个功能，不需要访问数据，可以做成静态方法
    public static void display() {
        //无法访问非静态成员（变量/方法），不可以出现this关键字
        //System.out.println(name+"hello,heima");
        //System.out.println(this);
        System.out.println(Student.className);
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Student s1=new Student("张三",11);
        Student s2=new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        Student.display();
        System.out.println(Student.number);
    }
}
//静态方法通常在工具类中，不需要创建对象，直接用类名去调用方法
//工具类最好私有化，毕竟不需要创建对象
//类的私有化：将构造器用private修饰
//这样的设计是为了提高代码复用性，节省内存，因为为了功能创造对象很浪费空间

