package designPatterns.templateMethodPattern;

public class Test {
    public static void main(String[] args) {
        People p1=new Student();
        People p2=new Teacher();
        p1.face();
        p2.face();
    }
}
