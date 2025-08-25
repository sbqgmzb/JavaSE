package day06_api.string.oj;

import java.util.Scanner;
//最后一个子串长度
public class LastWordLength {
    public static void main(String[] args) {
        //静态
        String words = "hello world 12e rterg rwdf";
        String[] arrstr=words.split(" ");
        System.out.println(arrstr[arrstr.length-1]);
        //动态
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words: ");
        //hasNext() 用于判断是否还有可读取的数据：
        while(sc.hasNext()){
            String s = sc.nextLine();
            // 1. 找到最后一个空格
            // 2. 获取最后一个单词：从最后一个空格+1位置开始，一直截取到末尾
            // 3. 打印最后一个单词长度
            String x = s.substring(s.lastIndexOf(' ')+1, s.length());
            int len=x.length();
            System.out.println(x);
            System.out.println(len);
        }
    }
}
