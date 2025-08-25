package day06_api.string.work;

import java.util.Random;
import java.util.Scanner;

public class Safecode {
    public static void main(String[] args) {
        final String words="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int n=words.length();
        String cd=new String();
        System.out.println("验证码：");
        Random random=new Random();
        for(int i=0;i<6;i++){
            int index = random.nextInt(words.length());
//            nextInt(n)[0,n)
//            nextInt(max-min+1)==》[min,max]
//            min + (max - min) * random.nextDouble();==》[min,max]
            char c=words.charAt(index);
            cd=cd+c;
        }
        System.out.println(cd);

        System.out.println("请输入验证码：");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if (s.equals(cd)){
            System.out.println("正确");
        }else
        {
            System.out.println("错误");
        }
    }
}
