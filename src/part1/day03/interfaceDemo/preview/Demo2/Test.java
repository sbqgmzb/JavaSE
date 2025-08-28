package part1.day03.interfaceDemo.preview.Demo2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Print("张三", '男',98.3);
        Student s2 = new Print("李四", '女',108.3);
        Student s3 = new Print("王五", '男',120);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println("该班级的所有成员信息：");
        for (Student student : students) {
            Print print=(Print) student;
            print.printInform();
            print.average();
        }
    }
}
