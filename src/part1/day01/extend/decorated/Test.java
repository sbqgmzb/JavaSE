package part1.day01.extend.decorated;

class Zi extends Fu {
    int x;
}

public class Test {
    public static void main(String[] args) {
        //System.out.println(new Zi().a);报错，a是私有变量
        System.out.println(new Zi().b);
        System.out.println(new Zi().c);
        System.out.println(new Zi().d);
    }
}
