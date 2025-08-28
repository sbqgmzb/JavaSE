package part0.day05_javaSE.day05_homework.practice3;

public class Teacher {
    private String name;
    private int id;

    public Teacher() {
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void teach() {
        System.out.println("工号为" + id + "的" + name +"老师正在讲课");
    }
}
