package NumberAndString;

public class StringBufferAndMyStringBuffer {
    public static void main(String[] args) {
        String rdm= random();
        myStringBuffer(rdm);
        stringBuffer(rdm);
    }

    public static void myStringBuffer(String rdm) {
        MyStringBuffer msb = new MyStringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            msb.append(rdm);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("MyStringBuff耗时：" + (endTime - startTime) + "毫秒");
    }

    public static void stringBuffer(String rdm) {
        StringBuffer sb = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            sb.append(rdm);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer耗时：" + (endTime - startTime) + "毫秒");
    }

    public static String random() {
        char[] cs = new char[10];
        for (int i = 0; i < cs.length; i++) {
            char c = (char)(Math.random() * 127);
            cs[i] = c;
        }
        String str = new String(cs);
        return str;
    }
}
