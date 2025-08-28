package part1.day02.polymorphismTest;

/**
 * 金卡类
 */
public class GoldCard extends Card {
    public GoldCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前的金卡消费：" + money);
        System.out.println("优惠之后的价格：" + (money * 0.8));
        //判断余额是否充足
        if (getMoney() < money * 0.8) {
            System.out.println("您的余额是：" + getMoney() + "，余额不足，消费失败！请存钱！");
            return;
        }
        //更新金卡的账户余额
        setMoney(getMoney() - money * 0.8);
        System.out.println("您当前金卡的余额是：" + getMoney());
        //判断消费是否大于200，调用一个独有的方法，打印洗车票
        if (money * 0.8 >= 200) {
            printTicket();
        } else {
            System.out.println("您当前消费不满足200元，不能免费洗车！");
        }

    }

    public void printTicket() {
        System.out.println("您消费了，请打印洗车票");
    }
}
