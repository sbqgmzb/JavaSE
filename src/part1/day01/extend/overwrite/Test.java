package part1.day01.extend.overwrite;
class Animal{
    void talk(){
        System.out.println("动物会叫");
    }
}
//重写：返回值和形参都不能改变。即外壳不变，核心重写。
class Bog extends Animal{

    @Override//重写的注解：java编辑器会检查我们重写的方法格式是否正确
    //子类重写的方法访问权限要大于等于父类被重写的方法
    //不可重写私有，静态、final修饰的方法
    public void talk(){
        System.out.println("小狗汪汪叫");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal dog = new Bog();
        dog.talk();

    }
}
