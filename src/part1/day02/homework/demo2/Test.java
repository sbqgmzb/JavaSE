package part1.day02.homework.demo2;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        Dog dog = (Dog) a1;
        dog.lookHome();
        System.out.println("------------------------------");
        Animal a2 = new Cat();
        a2.eat();
        Cat cat = (Cat) a2;
        cat.catchMouse();
    }
}
