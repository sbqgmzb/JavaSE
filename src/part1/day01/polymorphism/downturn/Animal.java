package part1.day01.polymorphism.downturn;

public class Animal {
    String name="动物";
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void talk() {
        System.out.println("动物会叫...");
    }

    public void eat() {
        System.out.println("动物吃饭...");
    }
}

