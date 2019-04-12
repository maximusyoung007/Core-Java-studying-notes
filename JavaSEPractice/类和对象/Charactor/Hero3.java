package Charactor;

/**
 * 对象属性的初始化方法有三种，分别为属性声明，初始化块，构造方法，三种方法哪种先执行，哪种后执行？
 */
public class Hero3 {
    public String name = Hero3.getName("属性声明");
    public Hero3(){
        name = Hero3.getName("构造方法");
    }
    {
        name = Hero3.getName("初始化块");
    }
    public static String getName(String pos){
        String result= "初始化方法：" + pos;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        new Hero3();
    }
    /**
     * 属性声明先于初始化块先于构造方法
     */
}
