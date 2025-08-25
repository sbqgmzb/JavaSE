package day05_javaSE.day05_homework.practice1;

public class Text {
    public static void main(String[] args) {
        BoyFriend boyFriend = new BoyFriend();
        boyFriend.setName("黎深");
        boyFriend.setHeight(186);
        boyFriend.setWeight(80);
        System.out.println(boyFriend.getName()+"，身高"+boyFriend.getHeight()+"cm,体重"+boyFriend.getWeight()+"公斤");
    }
}
