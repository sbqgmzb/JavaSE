package day05_javaSE.day05_homework.practice3;

public class Text {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setId(112);
        t1.setName("张");
        t1.teach();
        Teacher t2 = new Teacher(122,"黎");
        t2.teach();
    }
}
