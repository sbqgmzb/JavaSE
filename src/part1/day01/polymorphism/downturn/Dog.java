package part1.day01.polymorphism.downturn;


public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("小狗汪汪...");
    }
    @Override
    public void eat() {
        System.out.println("小狗吃狗粮...");
    }
    public void behave(){
        System.out.println("小狗会看家...");
    }
}
