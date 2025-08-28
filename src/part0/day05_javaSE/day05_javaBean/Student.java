package part0.day05_javaSE.day05_javaBean;
//javaBeen将数据存储起来，对于数据的处理由其他类进行
public class Student {
    private String name;
    private int age;
    private String gender;
    //需要无参构造函数
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
