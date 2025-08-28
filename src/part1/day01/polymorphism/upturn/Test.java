package part1.day01.polymorphism.upturn;

public class Test {
    public static void main(String[] args) {
        //多态：对象的多态，行为的多态【属性不会多态】
        //向上转型：创造子类对象，但当作父类对象去调用
        Animal dog=new Dog("小狗",12);
        Animal cat=new Cat("小猫",10);
        System.out.println("==========动物叫=========");
        cat.talk();
        dog.talk();
        System.out.println("===========动物吃食===========");
        theEat(dog);
        theEat(cat);
        System.out.println("==========================");
        Animal dog1= createAnimal("dog");
        dog1.talk();
        //dog.behave();报错==》向上转型无法调用子类特有的方法【不是重写的方法】，必须向下转型

    }

    //向上转型的作用：
    //1、统一接口，隐藏实现细节-->就是将同一行为包装起来做成静态方法，向上转型方便传参
    public static void theEat(Animal animal) {
        animal.eat();
    }

    //2、支持多态，提高扩展性：方法运行时多态，调用方法时会动态绑定到实际子类的实现，无需修改使用父类引用的代码，符合 “开闭原则”。
    //系统功能扩展时【如新增一个子类】，原有代码无需变动【只要动新添加的类代码】，降低了修改带来的风险，同时减少了代码冗余，使系统更易于维护。

    //3、返回值抽象化：方法返回父类类型，实际返回子类对象，隐藏具体实现，方便后续替换返回的子类类型
    public static Animal createAnimal(String animalName) {
        if (animalName.equals("dog"))
            return new Dog("小狗",8);
        else if (animalName.equals("cat"));
            return new Cat("小猫",2);
    }
    //4、基于接口的编程。在接口中使用，降低耦合度==》类似1
}
