package part1.day03.interfaceT.Demo3;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        JD[] jds = new JD[4];
        jds[0] = new Tv("小米电视", false);
        jds[1] = new Tv("美的洗衣机", false);
        jds[2] = new Tv("欧灯", false);
        jds[3] = new Tv("空调", false);
        SmartControl smartControl = SmartControl.getInstance();
        Scanner sc = new Scanner(System.in);

        while (true) {
            smartControl.printAllStatus(jds);
            System.out.println("请输入你想要控制的设备：1、电视；2、洗衣机；3、欧灯；4、空调;5、退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    smartControl.control(jds[0]);
                    break;
                case 2:
                    smartControl.control(jds[1]);
                    break;
                case 3:
                    smartControl.control(jds[2]);
                    break;
                case 4:
                    smartControl.control(jds[3]);
                    break;
                case 5:
                    System.out.println("退出app");
                    return;
                default:
                    System.out.println("输入有误，重新输入");

            }
        }
    }
}
