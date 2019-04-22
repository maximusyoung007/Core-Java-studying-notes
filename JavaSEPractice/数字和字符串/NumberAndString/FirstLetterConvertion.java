package NumberAndString;

/**
 * 给出一句英文句子： "let there be light"
 * 得到一个新的字符串，每个单词的首字母都转换为大写
 */
public class FirstLetterConvertion {
    public static void main(String[] args){
        String str = "let there be light";
        String result = "";
        String[] sub = str.split(" ");
        for(int i = 0;i < sub.length;i++){
            String firstLetter = Character.toString(sub[i].charAt(0));
            sub[i] = sub[i].replaceFirst(firstLetter,firstLetter.toUpperCase());
            result += sub[i] + " ";
        }
        //消除首尾空格
        result = result.trim();
        System.out.print(result);
    }
}
