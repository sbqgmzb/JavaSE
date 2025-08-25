package day06_api.string.demo;

/**
 * 创建String对象，并封装字符串数据
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //1.直接双引号得到字符串对象，封装字符串数据
        String name = "黑马666";
        System.out.println(name);
        //2.通过new关键字得到字符串对象，封装字符串数据
        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("itheima");
        System.out.println(rs2);

        char[] chars = {'a', '黑', '马'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        byte[] bytes = {97, 98, 99};
        String rs4 = new String(bytes);
        System.out.println(rs4);
        //3、

        String str = "helloworld" ;
        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 5));
        }

    }

