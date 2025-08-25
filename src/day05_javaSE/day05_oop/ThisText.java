package day05_javaSE.day05_oop;

class People{
    String name;
    int age;

    public People( String name,int age) {
        this.age = age;
        this.name = name;
    }
    public void display() {
        //this是一个变量，所在的方法被哪个对象调用，就代表哪个对象
        System.out.println(this);
    }
}
public class ThisText {
    public static void main(String[] args) {
        People people1=new People("iwen",12);
        System.out.println(people1);
        people1.display();
        System.out.println("========================");
        People people2=new People("sam",22);
        System.out.println(people2);
        people2.display();

    }
}

/**
 * this的用途：
 * 修饰变量：
 * 1、防止成员变量和局部变量的同名冲突，用this来声明成员变量。
 *
 * 放到方法：
 * 1、在一个方法中调用另一个方法【两个方法都是处在同一个对象中】
 * 2、在一个构造方法中调用另一个构造方法，且必须放在第一行，无参构造调用了有参构造，复用了初始化逻辑。
 **/