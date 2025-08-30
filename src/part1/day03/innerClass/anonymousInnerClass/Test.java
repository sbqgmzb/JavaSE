package part1.day03.innerClass.anonymousInnerClass;
/*
匿名内部类：是一种特殊的局部内部类，不需要声明名字
*/
public class Test {
    public static void main(String[] args) {
        /*Animal a=new Cat();
        a.cry();*/
        //其实就是一个子类或者实现类对象，要方法重写
        //匿名 体现在子类没有声明
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();

        //只能用1次
        new Animal() {

            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        }.cry();
    }
}
/*
class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }
}
*/
