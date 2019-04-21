package NumberAndString;

/**
 * 1. 对byte,short,float,double进行自动拆箱和自动装箱
 *
 * 2. byte和Integer之间能否进行自动拆箱和自动装箱
 *
 * 3. 通过Byte获取byte的最大值
 */
public class BoxingAndUnboxing {
    public static void main(String[] args){
        byte b = 1;
        short s = 4;
        float f = 3.33f;
        double d = 3.14;
        int i = 1;

        //自动装箱
        Byte b1 = b;
        Short s1 = s;
        Float f1 = f;
        Double d1 = d;
        Integer i1 = i;

        //自动拆箱
        byte b2 = b1;
        short s2 = s1;
        float f2 = f1;
        double d2 = d1;

        //Integer i = b; 不能把byte自动装箱成Integer
        //b = i1;也不能把Integer自动拆箱成byte

        System.out.println(Byte.MAX_VALUE);
    }
}
