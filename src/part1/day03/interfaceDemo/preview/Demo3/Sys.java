package part1.day03.interfaceDemo.preview.Demo3;

public class Sys {
    public void openApp(){
        System.out.println("打开系统");
    }

    public void closeApp(){
        System.out.println("关闭系统");
    }
    public void useApp(IController c){
        if (c instanceof Light){
            Light l = (Light)c;
            l.openDevice();
            l.mode();
            l.closeDevice();
        } else if (c instanceof Tv){
            Tv tv = (Tv)c;
            tv.openDevice();
            tv.show();
            tv.closeDevice();
        } else if (c instanceof DishMachine){
            DishMachine dm = (DishMachine)c;
            dm.openDevice();
            dm.time();
            dm.openDevice();
        } else if (c instanceof Window) {
            Window window = (Window)c;
            window.openDevice();
            window.lock();
            window.closeDevice();
        }
    }
}
