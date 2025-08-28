package part0.day05_javaSE.day05_package;

class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
public class Text{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("iwen");
        s1.setAge(32);
        s1.setGender("M");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());

    }
}
