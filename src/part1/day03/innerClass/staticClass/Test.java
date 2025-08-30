package part1.day03.innerClass.staticClass;

public class Test {
    public static void main(String[] args) {
        //创建静态内部类对象时，不需要先创建外部类对象
        Outer.Inner inner=new Outer.Inner();
        inner.show();
    }
}
