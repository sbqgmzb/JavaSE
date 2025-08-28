package part1.day03.interfaceDemo.preview.Demo2;

public class Student {
    private String name;
    private char gender;
    private double score;

    public Student(String name,char gender,double score) {
        this.score = score;
        this.gender = gender;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
