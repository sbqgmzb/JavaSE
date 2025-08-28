package part1.day01.extend.codeblock;

class Person {
    static {
        System.out.println("Person：静态代码块执行");
    }

    public String name;
    public int age;

    {
        /*
         * 实例代码块==构造器的 “前置初始化逻辑”
         * */
        System.out.println("Person：实例代码块执行");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person：构造方法执行");
    }
}

class Student extends Person {
    static {
        System.out.println("Student：静态代码块执行");
    }

    {
        System.out.println("Student：实例代码块执行");
    }


    public Student(String name, int age) {
        super(name, age);
        System.out.println("Student：构造方法执行");
    }
}

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 19);
        System.out.println("===========================");
        Student student2 = new Student("张三", 20);
    }

    public static void main1(String[] args) {
        Person person1 = new Person("iwen", 10);
        System.out.println("============================");
        Person person2 = new Person("李四", 20);
    }
}
/*
* 在代码块中，执行顺序：静态代码块->实例代码块->构造代码块
* 静态代码块只会出现一次，它随着类的加载而不是随着对象的加载
* 父类代码块先执行，然后执行子类代码块
* */
