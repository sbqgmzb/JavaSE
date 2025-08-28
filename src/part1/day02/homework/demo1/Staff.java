package part1.day02.homework.demo1;

public abstract class Staff {
    private String id;
    private String name;
    private double salary;

    public Staff(String id, String name,double salary ) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
    public abstract void eat();
}
