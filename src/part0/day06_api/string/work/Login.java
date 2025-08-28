package part0.day06_api.string.work;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String name = "admin";
        String pass = "123456";

        int n=0;
        while(n<3){
            System.out.println("登录");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name1= sc.nextLine();
            System.out.println("请输入密码：");
            String pass1= sc.nextLine();
            if (name.equals(name1) && pass.equals(pass1)) {
                System.out.println("登陆成功");
                break;
            }
            System.out.println("登录失败，请重新登录");
            System.out.println("===========================");
            n++;
            if (n==3){
                System.out.println("三次错误，已锁定");
            }
        }


    }
}
