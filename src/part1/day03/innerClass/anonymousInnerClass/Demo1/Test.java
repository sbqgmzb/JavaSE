package part1.day03.innerClass.anonymousInnerClass.Demo1;
/*用法：
 * 作为对象参数传递给方法
 */

interface Swim {
    void swim();
}

public class Test {
    public static void go(Swim s1) {
        System.out.println("开始====");
        s1.swim();
    }

    public static void main(String[] args) {
        Swim s1 = new Swim() {
            @Override
            public void swim() {
                System.out.println("swim");
            }
        };
        go(s1);
        System.out.println("==================");
        go(new Swim() {
            @Override
            public void swim() {
                System.out.println("swim");
            }
        });
    }
}