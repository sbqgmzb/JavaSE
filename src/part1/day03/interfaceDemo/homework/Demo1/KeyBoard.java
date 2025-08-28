package part1.day03.interfaceDemo.homework.Demo1;

public class KeyBoard implements IUsb {
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }

    public void inputKey() {
        System.out.println("鼠标输入");
    }
}

