package part1.day01.extend.decoratedDemo;

import part1.day01.extend.decorated.Fu;


public class DefaultTest extends Fu {
    public static void main(String[] args) {
        System.out.println(new DefaultTest().b);
        System.out.println(new DefaultTest().d);
        //System.out.println(new DefaultTest().c);报错，缺省必须同包
    }
}
