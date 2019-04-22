package NumberAndString;

/**
 * String与StringBuffer的性能区别?
 *
 * 生成10位长度的随机字符串
 * 然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
 * 然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间
 */
public class StringAndStringBuffer {
    public static void main(String[] args){
        RandomString rs = new RandomString();
        String str1 = "";
        long start1 = System.currentTimeMillis();
        for(int i = 0;i < 10000;i++){
            str1 += rs.randomString(10);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("使用String的+,耗时 " + (end1 - start1) + "毫秒");

        StringBuffer sb = new StringBuffer();
        long start2 = System.currentTimeMillis();
        for(int i = 0;i < 10000;i++){
            sb = sb.append(rs.randomString(10));
        }
        long end2 = System.currentTimeMillis();
        System.out.println("使用StringBuffer的append方法，耗时 " + (end2 - start2) + "毫秒");
    }
}
