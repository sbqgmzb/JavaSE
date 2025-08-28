package designPatterns.templateMethodPattern;



public class Student extends People {

    //子类重写
    @Override
    public void likeBe() {
        System.out.println("学生有学生样");
    }
}
