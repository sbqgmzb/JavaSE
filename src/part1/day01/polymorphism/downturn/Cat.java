package part1.day01.polymorphism.downturn;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void talk() {
        System.out.println("小猫喵喵...");
    }
    @Override
    public void eat() {
        System.out.println("小猫吃猫粮...");
    }
    public void behave(){
        System.out.println("小猫会捉老鼠...");
    }
}
