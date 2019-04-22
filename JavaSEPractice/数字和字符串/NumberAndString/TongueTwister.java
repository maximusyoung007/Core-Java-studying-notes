package NumberAndString;

/**
 * 英文绕口令
 * peter piper picked a peck of pickled peppers
 * 统计这段绕口令有多少个以p开头的单词
 */
public class TongueTwister {
    public static void main(String args[]){
        String str = "peter piper picked a peck of pickled peppers";
        //以空格分割，单词全都装到字符串数组s中
        String[] s = str.split(" ");
        int count = 0;
        for(int i = 0;i < s.length;i++){
            if(s[i].charAt(0) == 'p')
                count++;
        }
        System.out.println(count);
    }
}
