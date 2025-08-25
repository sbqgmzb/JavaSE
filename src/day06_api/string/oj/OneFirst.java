package day06_api.string.oj;

//找出只出现第一个一次的字符
public class OneFirst {
    public static void main(String[] args) {
        String s1="sdkfjghjfdsghfgrbhjopjgtfdj";
        int[] count=new int[520];
        for (int i = 0; i <s1.length() ; i++) {
            //count每一个元素代表着s1字符出现的次数，出现一次该位置，次数就+1
            count[s1.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[s1.charAt(i)]==1){
                System.out.println(s1.charAt(i));
                break;
            }
        }
    }

}
