package part1.day02.abstracttest.demo1;
//抽象类：只能继承，不可以构造对象
public abstract class A {
    private String name;
    public A(){
        System.out.println("A的无参构造器");
    }

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //抽象类可以没有抽象方法
    //子类重写方法，父类定义成抽象既可以节省代码，有增加了安全性
    public abstract void show();
    public void show2(){
        System.out.println("A的show2");
    }
}
