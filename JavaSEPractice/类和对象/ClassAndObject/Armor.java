package ClassAndObject;

/**
 * 设计一个类Armor护甲
 * 继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
 *
 * 实例化出两件护甲
 * 名称 价格 护甲等级
 * 布甲 300 15
 * 锁子甲 500 40
 */
public class Armor extends Item {
    int ac;
    public static void main(String[] args){
        Armor clothArmour = new Armor();
        Armor chainMail = new Armor();
        clothArmour.name = "布甲";
        clothArmour.price = 300;
        clothArmour.ac = 15;

        chainMail.name = "锁子甲";
        chainMail.price = 750;
        chainMail.ac = 18;

        System.out.println("布甲：");
        System.out.println("名称：" + clothArmour.name + " 价格：" + clothArmour.price + " 等级： " + clothArmour.ac);
        System.out.println();
        System.out.println("锁子甲：");
        System.out.println("名称：" + chainMail.name + " 价格：" + chainMail.price + " 等级： " + chainMail.ac);
    }
}
