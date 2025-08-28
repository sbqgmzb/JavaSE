package part0.day05_javaSE.day05_javaBean;

public class Text {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(12);

        StudentOperator studentOperator = new StudentOperator(student);
        studentOperator.agePass();
    }
}
