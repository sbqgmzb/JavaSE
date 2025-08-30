package part1.day03.innerClass.memberClass;

//外部类
public class Outer {
    public static String b = "外部类静态成员";
    public String a = "外部类实例成员";
    public int i=24;
    public void print() {
        System.out.println("外部类实例方法");
        System.out.println(i);
    }

    //成员内部类
    //可以访问实例成员和静态成员
    public  class Inner {
        public void show() {
            System.out.println(a);
            System.out.println(b);
            print();
            //就近原则
            int i=34;
            System.out.println(i);
            //拿到外部类的变量
            System.out.println(Outer.this.i);
        }
    }
}
