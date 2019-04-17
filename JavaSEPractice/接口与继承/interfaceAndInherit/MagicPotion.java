package interfaceAndInherit;

/**
 * 设计一个类MagicPotion 蓝瓶，继承Item, 重写effect方法
 * 并输出 “蓝瓶使用后，可以回魔法”
 */
public class MagicPotion extends Item {
    @Override
    public void effect() {
        System.out.println("蓝瓶使用后，可以回魔法");
    }
}
