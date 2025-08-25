package day05_javaSE.day05_homework.practice4;

public class PhoneOperator {
    private Phone phone;

    public PhoneOperator(Phone phone) {
        this.phone = phone;
    }
    public void call() {
        System.out.println("正在使用价格为"+phone.getPrice() +"元"+phone.getColor()+"的"+phone.getBrand()+"打电话");
    }
    public void sendMessage() {
        System.out.println("正在使用价格为"+phone.getPrice() +"元"+phone.getColor()+"的"+phone.getBrand()+"发短信");

    }
}
