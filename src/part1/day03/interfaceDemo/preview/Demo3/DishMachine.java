package part1.day03.interfaceDemo.preview.Demo3;

public class DishMachine implements IController{
    @Override
    public void openDevice() {
        System.out.println("打开洗衣机");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭洗衣机");
    }

    public void time(){
        System.out.println("设置洗衣时间");
    }
}
