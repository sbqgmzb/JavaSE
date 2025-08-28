package part1.day02.homework.demo1;

public class Test {
    public static void main(String[] args) {
        Staff s1=new Manger("v001","张三",13000.0);
        s1.eat();
        s1.work();
        System.out.println("------------------------------------------");
        Staff s2=new Chef("p001","小李",7000.0);
        s2.eat();
        s2.work();
    }
}
