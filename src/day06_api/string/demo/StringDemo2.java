package day06_api.string.demo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "hello java";
        System.out.println("====================");
        System.out.println(s1.length());
        //字符串的遍历
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        System.out.println("====================");

        //转换成数组
        char[] ch=s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        System.out.println("====================");

        //比较忽略大小写
        String c1 = "helloHUJI";
        String c2 = "helloHuJi";
        System.out.println(c2.compareToIgnoreCase(c1));
        System.out.println("====================");

        //截取
        String s2="歪比巴卜歪比巴卜";
        String s4=s2.substring(2,5);
        System.out.println(s4);
        System.out.println("====================");

        //替换
        String s3= s2.replaceAll("巴","安？");
        System.out.println(s3);
        System.out.println("====================");

        //判断是否包含某字符串
        System.out.println(s1.contains("java"));
        System.out.println(s1.contains("java1"));
        System.out.println("====================");

        //判断字符串的开头/结尾是否是xxx
        System.out.println(s1.startsWith("java"));
        System.out.println(s1.endsWith("java"));
        System.out.println("====================");

        //分割
        String lovers="沈星回 黎深 祁煜";
        String[] x1=lovers.split(" ");
        for (int i = 0; i < x1.length; i++) {
            System.out.println(x1[i]);
        }
    }
}
