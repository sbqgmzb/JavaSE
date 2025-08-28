package part1.day03.interfaceDemo.preview.Demo3;

public class AppTest {
    public static void main(String[] args) {
        Sys sys = new Sys();
        sys.openApp();
        System.out.println("==================");
        IController ic1=new Light();
        sys.useApp(ic1);
        System.out.println("==================");
        IController ic2=new Tv();
        sys.useApp(ic2);
        System.out.println("=================");
        IController ic3=new DishMachine();
        sys.useApp(ic3);
        System.out.println("=================");
        IController ic4=new Window();
        sys.useApp(ic4);
        System.out.println("=================");
        sys.closeApp();
    }
}
