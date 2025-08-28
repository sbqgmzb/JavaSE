package part1.day02.abstracttest.demo2;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract void cry();
}
