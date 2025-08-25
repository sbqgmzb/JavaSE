package day05_javaSE.day05_homework.practice2;

public class Text {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(20);
        Student s2=new Student("李四",24);
        s1.show();
        s2.show();
    }
}
