package Charactor;

/**
 * 通过garen.copyright修改其值
 * 然后打印teemo.copyright，观察是否有变化
 */
public class Hero {
    public String name;//实例属性
    protected float hp;
    static String copyRight;//类属性
    public static void main(String[] args){
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 4000;
        Hero.copyRight = "版权由拳头公司所有";
        System.out.println(gareen.name + " " + gareen.hp + " " + gareen.copyRight);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 2000;
        System.out.println(teemo.name + " " + teemo.hp + " " + teemo.copyRight);

        gareen.copyRight = "哈哈哈哈哈";
        System.out.println(teemo.copyRight);
        /*
        答案：会变化，类属性只有一个，所有对象共享一个类属性
         */
    }
}
