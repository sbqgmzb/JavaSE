package part1.day03.interfaceT.Demo3;

public class SmartControl {
    private static SmartControl smartControl=new SmartControl();
    private SmartControl(){}
    public static SmartControl getInstance(){
        return smartControl;
    }
    //1、控制设备的开关
    public void control(JD jd){
        System.out.println("========================================");
        System.out.println(jd.getName()+"目前状态是："+(jd.isStatus()? "开着":"关闭"));
        System.out.println("开始你的操作");
        jd.press();
        System.out.println(jd.getName()+"目前状态是："+(jd.isStatus()? "开着":"关闭"));
        System.out.println("========================================");
    }
    //2、查询所有状态的开关情况
    public void printAllStatus(JD[] jds){
        for (JD jd : jds) {
            System.out.println(jd.getName() + "目前状态是：" + (jd.isStatus() ? "开着" : "关闭"));
        }
    }
}
