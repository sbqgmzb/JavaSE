package part1.day02.homework.demo2;

public class Dog extends Animal {

    public void lookHome(){
        System.out.println("老老实实看家");
    }

    @Override
    public void eat() {
        System.out.println("Dog吃骨头");
    }
}
