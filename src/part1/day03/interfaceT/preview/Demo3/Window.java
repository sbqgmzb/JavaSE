package part1.day03.interfaceT.preview.Demo3;

public class Window implements IController {
    @Override
    public void openDevice() {
        System.out.println("开窗");
    }

    @Override
    public void closeDevice() {
        System.out.println("关窗");
    }

    public void lock(){
        System.out.println("设置童锁");
    }
}
