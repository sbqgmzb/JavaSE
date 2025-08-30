package part1.day03.interfaceDemo.preview.Demo2;

public class PrintInform1 implements IClassDataInter {
    private Student[] students;

    public PrintInform1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllInform() {
        System.out.println("所有学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student s=students[i];
            System.out.println(s.getName() + " " + s.getGender() + " " + s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum=0;
        for (int i = 0; i < students.length; i++){
            sum+=students[i].getScore();
        }
        System.out.println("所有学生的平均分是：" + sum / students.length);
        System.out.println("===================================");
    }
}
