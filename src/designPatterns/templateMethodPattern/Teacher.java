package designPatterns.templateMethodPattern;

public class Teacher extends People{
    //子类重写
    @Override
    public void likeBe() {
        System.out.println("老师有老师样");
    }
}
