package interfaceAndInherit;

public class ADHero extends Hero implements Mortal{
    /**
     * 作为子类，无论如何 都会调用父类的构造方法。
     * 默认情况下，会调用父类的无参的构造方法。
     * 但是，当父类没有无参构造方法的时候( 提供了有参构造方法，并且不显示提供无参构造方法)，子类就会抛出异常，因为它尝试去调用父类的无参构造方法。
     * 这个时候，必须通过super去调用父类声明的、存在的、有参的构造方法
     */
    public ADHero() {
        super("");
    }
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    @Override
    public void die() {
        System.out.println(name + "die");
    }

    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String[] args) {
        Hero.battleWin();
        ADHero.battleWin();
        /**
         * h.battleWin(); //battleWin是一个类方法
         * h是父类类型的引用
         * 但是指向一个子类对象
         * h.battleWin(); 会调用父类的方法？还是子类的方法？
         */
        Hero h = new ADHero();
        h.battleWin();
        /**
         * 静态方法会被子类继承
         * 但不存在动态绑定，访问的是定义的对象变量所在的类或类本身的方法
         */
    }
}
