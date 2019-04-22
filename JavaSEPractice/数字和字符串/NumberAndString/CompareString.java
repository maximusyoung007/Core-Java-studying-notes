package NumberAndString;

import java.util.Map;

/**
 * 创建一个长度是100的字符串数组
 * 使用长度是2的随机字符填充该字符串数组
 * 统计这个字符串数组里重复的字符串有多少种
 */

/*
    说明：==表示两个String是否指向同一个对象
         equals表示两个String的内容是否相同
         本题中应该用equals
 */
public class CompareString {
    public static void main(String[] args){
        String[] s = new String[100];
        String[] s2 = new String[100];
        String[] compare = new String[100];
        int count = 0;
        boolean judge = false;
        RandomString rs = new RandomString();

        for(int i = 0;i < s.length;i++) {
            s[i] = rs.randomString(2);
        }
        for(int i = 0;i < s.length;i++){
            System.out.print(s[i] + " ");
            if((i + 1) % 10 == 0)
                System.out.println();
        }

        for(int i = 0;i < s.length;i++){
            for(int j = 0;j < s2.length;j++){
                //如果s2里有，则将judge改为true
                if(s[i].equals(s2[j])){
                    judge = true;
                }
            }
            //如果s2中有,则表示已经有重复元素，则将s[i]加入到compare中,也要加入到s2中
            if(judge == true){
                compare[count++] = s[i];
                s2[i] = s[i];
            }
            //如果s2中没有，则将s[i]加入s2中
            else if (judge == false){
                s2[i] = s[i];
            }
            //初始化为false
            judge = false;
        }
        System.out.println("共有" + count + "种重复的字符串");
        System.out.println("重复的分别是：");
        for(int i = 0;i < count;i++){
            System.out.print(compare[i] + " ");
        }
    }
}
