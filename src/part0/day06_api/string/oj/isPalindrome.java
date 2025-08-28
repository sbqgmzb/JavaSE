package part0.day06_api.string.oj;

import java.util.Scanner;

//是否为回文
public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //可以一致小写，如果需要的话 s=s.toLowerCase()
        char[] ch = s.toCharArray();
        for (int x = 0; x < ch.length; x++) {
            if ((ch[x] >= 'a' && ch[x] <= 'z') || (ch[x] >= '0' && ch[x] <= '9')) {
                int temp = 0;
                for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
                    if (ch[i] != ch[j]) {
                        temp++;
                    }
                }
                if (temp == 0){
                    for (int i = 0,j= ch.length-1; i<j; i++,j--) {
                        if(ch[i]!=ch[j]){
                            temp++;
                        }
                    }
                    if(temp==0){
                        System.out.println("yes");
                        break;
                    }else{
                        System.out.println("no");
                        break;
                    }
                }
            }

        }
    }
}
