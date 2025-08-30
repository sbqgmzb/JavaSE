package part1.day03.innerClass.memberClass;

public class Test {
    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.print();
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
