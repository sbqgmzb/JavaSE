package part0.day05_javaSE.day05_homework.practice4;

public class Text {
    public static void main(String[] args) {
        Phone p= new Phone("小米手机",3998,"黑色");
        PhoneOperator po = new PhoneOperator(p);
        po.call();
        po.sendMessage();
    }
}
