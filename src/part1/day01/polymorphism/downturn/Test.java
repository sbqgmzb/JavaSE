package part1.day01.polymorphism.downturn;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("元宝",2);
        Animal dog = new Dog("小七", 1);
        //向上转型
        Animal animal=cat;
        animal.eat();
        //向下转型
        animal=dog;
        animal.eat();
        //原本是Dog，强制转换到Cat会报错
//        cat=(Cat)animal;
//        cat.eat();
        //向下转型很不安全，转换失败会抛出异常
        //Java引用了instanceof，如果该表达式为true，则可以安全转换
        if (animal instanceof Cat) {
            Cat cat2 = (Cat) animal;
            cat2.talk();
        }
        if (animal instanceof Dog) {
            Dog dog2 = (Dog) animal;
            dog2.talk();
        }
    }
}
