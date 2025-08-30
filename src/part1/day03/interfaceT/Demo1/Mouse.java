package part1.day03.interfaceT.Demo1;

public class Mouse implements IUsb {

    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }
    public void clickMouse() {
        System.out.println("点击鼠标");
    }
}
