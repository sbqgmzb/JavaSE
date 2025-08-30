package part1.day03.interfaceT.Demo1;

public class TestUSB {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        System.out.println("==================");
        IUsb usb1=new Mouse();
        computer.useDevice(usb1);
        System.out.println("==================");
        IUsb usb2=new KeyBoard();
        computer.useDevice(usb2);
        System.out.println("==================");
        computer.powerOff();
    }
}
