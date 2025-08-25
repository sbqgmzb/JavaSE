package day05_javaSE.day05_oop;
class Student{
    String name;
    double chinese;
    double english;

    public Student(String name, double chinese, double english) {
        this.name = name;
        this.chinese = chinese;
        this.english = english;
    }

    public void printTotalScore() {
        double score = chinese+english;
        System.out.println(name+"的总成绩为："+String.format("%.2f", score));
    }
    public void printAvgScore() {
        double avgscore=(chinese+english)/2;
        System.out.println(name+"的平均成绩为："+String.format("%.2f", avgscore));
    }
}
public class Text {
    public static void main(String[] args) {
        Student s1=new Student("张三",112,123);
        Student s2=new Student("李四",98,100);
        s1.printTotalScore();
        s2.printTotalScore();
        s1.printAvgScore();
        s2.printAvgScore();
    }
}
