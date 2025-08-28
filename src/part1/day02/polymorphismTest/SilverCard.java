package part1.day02.polymorphismTest;

/**
 * 金卡类
 */
public class SilverCard extends Card{
    public SilverCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前的金卡消费：" + money);
        System.out.println("优惠之后的价格：" + (money * 0.9));
        //判断余额是否充足
        if (getMoney() < money * 0.9) {
            System.out.println("您的余额是：" + getMoney() + "，余额不足，消费失败！请存钱！");
            return;
        }
        //更新金卡的账户余额
        setMoney(getMoney() - money * 0.9);
        System.out.println("您当前金卡的余额是：" + getMoney());
    }

}
