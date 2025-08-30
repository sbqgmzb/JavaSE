package part1.day03.interfaceDemo.preview.Demo2;

public class PrintInform2 implements IClassDataInter {
    private Student[] students;

    public PrintInform2(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllInform() {
        System.out.println("所有学生的信息如下：");
        int maleCount=0;
        for(int i=0;i<students.length;i++){
            Student s=students[i];
            System.out.println(s.getName() + " " + s.getGender() + " " + s.getScore());
            if (s.getGender()=='M')
                maleCount++;
        }
        System.out.println("男生人数是"+maleCount);
        System.out.println("女生人数是"+(students.length-maleCount));
    }

    @Override
    public void printAverageScore() {
        System.out.println("===============");
        Student s=students[0];
        double sum=s.getScore();
        double max=s.getScore();
        double min=s.getScore();
        for (int i=1;i<students.length;i++) {
            s=students[i];
            sum+=s.getScore();
            if (students[i].getScore()>max) {
                max=students[i].getScore();
            }
            if (students[i].getScore()<min) {
                min=students[i].getScore();
            }
        }
        System.out.println("最高分："+max);
        System.out.println("最低分"+min);
        System.out.println("平均分"+(sum-max-min)/students.length);
    }
}
