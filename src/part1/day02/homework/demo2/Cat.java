package part1.day02.homework.demo2;

public class Cat extends Animal {

    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }

    @Override
    public void eat() {
        System.out.println("Cat吃鱼");
    }
}
