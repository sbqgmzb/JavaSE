package part1.day03.interfaceT.preview.Demo3;

public class Light implements IController {
    @Override
    public void openDevice() {
        System.out.println("开灯");
    }

    @Override
    public void closeDevice() {
        System.out.println("关灯");
    }
    public void mode(){
        System.out.println("护眼模式");
    }
}
