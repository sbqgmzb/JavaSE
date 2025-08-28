package part1.day02.polymorphismTest;

import java.util.Scanner;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        //加油站支付小程序
        //1.创建卡片类（父类），以便创建金卡或才银卡对象，封装车主的数据（车牌号码，车主姓名....） 方法：存款  消费
        //2.定义金卡类（子类），继承卡片类，金卡必须重写消费的方法 8折优惠  特有方法：打印洗车票
        //3.定义银卡类（子类），继承卡片类，银卡必须重写消费的方法 9折优惠
        //4.测试  办一张金卡，创建金卡对象，交给一外独立的业务（支付机）--方法来完成，模拟支付机 存款 消费
        GoldCard c1 = new GoldCard("浙A888888", "张三", "13800000000", 10000);
        c1.deposit(1000);
        pay(c1);

        SilverCard c2 = new SilverCard("浙A5555555", "李四", "13800000001", 3000);
        c2.deposit(1000);
        pay(c2);

    }
    //支付机 用一个方法来刷卡：可能接收金卡对象，或者银卡对象
    public static void pay(Card c){
        System.out.println("请刷卡，请您输入当前消费的金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }

}
