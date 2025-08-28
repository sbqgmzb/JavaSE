package part1.day02.homework.demo1;

public class Manger extends Staff {
    public Manger(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("工号为："+this.getId()+",姓名为："+this.getName()+
                "，工资为："+this.getSalary()+"的经理在工作：管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("工号为："+this.getId()+",姓名为："+this.getName()+
                "，工资为："+this.getSalary()+"的经理在吃鱼");
    }
}
