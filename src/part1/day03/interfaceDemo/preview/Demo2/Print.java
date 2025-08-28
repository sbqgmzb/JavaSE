package part1.day03.interfaceDemo.preview.Demo2;

public class Print extends Student  implements IPrintInform,ICount{
    static double sum = 0;
    static int counter = 0;
    static double average = 0;
    public Print(String name, char gender, double score) {
        super(name, gender, score);
    }

    @Override
    public void average() {
        sum += getScore();
        counter++;
        average = sum / counter;
        System.out.println("Average score: " + average);
    }

    @Override
    public void printInform() {
            System.out.println("姓名："+this.getName());
            System.out.println("性别："+this.getGender());
            System.out.println("分数："+this.getScore());
            System.out.println("=============================");
    }
}
