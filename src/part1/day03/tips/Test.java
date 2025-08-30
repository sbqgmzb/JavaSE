package part1.day03.tips;

//4.一个类实现多个接口，如果多个接口存在同名的默认方法，可以不冲突，这个类重写该方法即可
interface A3{
    default void show(){
        System.out.println("A3 show...");
    }
}
interface B3{
    default void show(){
        System.out.println("B3 show...");
    }
}
//3.一个类继承了父类，又同时实现了接口，如果父类中和接口中有同名的默认方法，实现类会优先用父类的
interface A2{
    default void show(){
        System.out.println("A2 show...");
    }
}
//2.一个接口继承多个接口，如果多个接口存在方法签名冲突，则此时不支持多继承，也不支持多实现
interface A1{
    void show();
}




interface B1{
    void show();
}
//1.接口与接口可以多继承：一个接口可同时继承多个接口
interface A {
    void show1();
}
interface B {
    void show2();
}


interface C extends A, B {
    void show3();
}

/**
 * 接口的注意事项
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();

        Dog2 d2 = new Dog2();
        d2.show();
    }
}
//interface C1 extends A1, B1 {}
/*class D1 implements A1, B1 {
    public void show() {}
}*/

class Dog2 implements A3, B3{

    @Override
    public void show() {
        A3.super.show();
        B3.super.show();
    }
}

class Animal{
    public void show(){
        System.out.println("Animal show...");
    }
}

class Dog extends Animal implements A2{

}

class D implements C {
    public void show1() {}
    public void show2() {}
    public void show3() {}
}

