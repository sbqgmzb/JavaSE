package part1.day02.abstracttest.demo2;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.cry();
        Animal a2 = new Cat();
        a2.cry();
    }
}
