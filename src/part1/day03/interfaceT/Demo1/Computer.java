package part1.day03.interfaceT.Demo1;

//使用USB设备
public class Computer {
   public void powerOn(){
       System.out.println("打开电脑");
   }
    public void powerOff(){
        System.out.println("关闭电脑");
    }
    public void useDevice(IUsb usb){
       usb.openDevice();
       if(usb instanceof Mouse){
           Mouse mouse = (Mouse) usb;
           mouse.clickMouse();
       } else if(usb instanceof KeyBoard){
           KeyBoard keyBoard = (KeyBoard) usb;
           keyBoard.inputKey();
       }
       usb.closeDevice();
    }
}
