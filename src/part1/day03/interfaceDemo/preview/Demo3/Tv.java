package part1.day03.interfaceDemo.preview.Demo3;

public class Tv implements IController {
    @Override
    public void openDevice() {
        System.out.println("打开电视");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭电视");
    }

    public void show(){
        System.out.println("换台");
    }
}
