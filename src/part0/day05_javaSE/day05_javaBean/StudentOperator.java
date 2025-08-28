package part0.day05_javaSE.day05_javaBean;

//这是数据的操作
public class StudentOperator {
    private Student student;
    public StudentOperator( Student student) {
        this.student = student;
    }
    public void agePass(){
        if(student.getAge()>18){
            System.out.println("成年");
        }else {
            System.out.println("未成年");
        }
    }
}

