package part1.day03.interfaceT.preview.Demo2;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("John", 'M', 90);
        students[1] = new Student("Jane", 'F', 80);
        students[2] = new Student("Jack", 'M', 70);
        students[3] = new Student("Jill", 'M', 60);
        students[4] = new Student("Bob", 'M', 50);
        students[5] = new Student("Bob", 'M', 40);
        students[6] = new Student("Bob", 'M', 30);
        students[7] = new Student("Bob", 'M', 20);
        students[8] = new Student("Bob", 'M', 10);
        students[9] = new Student("enid", 'F', 100);
        IClassDataInter cdi=new PrintInform1(students);
        cdi.printAllInform();
        cdi.printAverageScore();
        IClassDataInter cdi1=new PrintInform2(students);
        cdi1.printAllInform();
        cdi1.printAverageScore();

    }
}

