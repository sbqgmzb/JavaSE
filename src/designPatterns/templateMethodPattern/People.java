package designPatterns.templateMethodPattern;
/*
* 模板方法设计模式：解决了方法中存在 重复代码 的问题，提高了代码的复用 、简化子类设计
*
* */
//1.定义一个抽象类
public abstract class People {
    //2.创造一个模板方法【被final修饰且包含了需要重写的抽象方法】
    //加个final子类就不会重写模板方法了
    public final void face(){
        //相同的部分
        System.out.println("两个眼睛一张嘴");
        //不同的部分抽取为抽象方法
        likeBe();
    }
    //3.定义一个抽象方法
    public abstract void likeBe();

}
