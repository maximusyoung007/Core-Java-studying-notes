package interfaceAndInherit;

/**
 * 为Item2类设计一个抽象方法
 * 不同的子类，实现disposable后，会返回不同的值。
 * 比如LifePotion就会返回true，因为是会消失了。
 * 而Weapon,Armor 就会返回false,因为是不会消失了
 */
public abstract class Item2 {
    String name;
    int prive;
    public abstract boolean disposable();

    /**
     *匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
     * 通常情况下，要使用一个接口或者抽象类，都必须创建一个子类
     *
     * 有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
     * 既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
     * 这样的类，叫做匿名类
     */

    /**
     * 创建一个Item的匿名类
     *
     * Item有抽象方法disposable(), 就像抽象类练习 中要求的那样。
     */
    public static void main(String[] args){
        Item2 item2 = new Item2() {
            @Override
            public boolean disposable() {
                return false;
            }
        };
        item2.disposable();
    }
}
/**
 * 区别1：
 * 子类只能继承一个抽象类，不能继承多个
 * 子类可以实现多个接口
 * 区别2：
 * 抽象类可以定义
 * public,protected,package,private
 * 静态和非静态属性
 * final和非final属性
 * 但是接口中声明的属性，只能是
 * public
 * 静态
 * final的
 * 即便没有显式的声明
 */
