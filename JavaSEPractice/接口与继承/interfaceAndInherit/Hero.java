package interfaceAndInherit;

public class Hero {
    public String name;
    public int hp;
    int armor;
    int moveSpeed;

    /**
     *但是没有提供无参的构造方法
     * 子类应该怎么处理？
     */

    //故意不提供无参构造方法
    //public Hero(){}

    public Hero(String HeroName){
        name = HeroName;
    }

    public Hero(String HeroName,int heroHp){
        name = HeroName;
        hp = heroHp;
    }

    public Hero(String HeroName,int heroHP,int heroArmor,int heroMoveSpeed){
        name = HeroName;
        hp = heroHP;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }

    public Hero(String name,int hp,int armor){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
    }

    public void kill(Mortal m){
        m.die();
    }

    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public static void main(String[] args){
        /**
         * 1. 设计一个接口
         * 接口叫做Mortal,其中有一个方法叫做die
         * 2. 实现接口
         * 分别让ADHero,APHero,ADAPHero这三个类，实现Mortal接口，不同的类实现die方法的时候，都打印出不一样的字符串
         * 3. 为Hero类，添加一个方法,在这个方法中调用 m的die方法。
         * 4. 在主方法中
         * 首先实例化出一个Hero对象:盖伦
         * 然后实例化出3个对象，分别是ADHero,APHero,ADAPHero的实例
         * 然后让盖伦 kill 这3个对象
         */
        Hero h = new Hero("盖伦");

        ADHero adHero = new ADHero();
        adHero.name = "艾希";

        APHero apHero = new APHero();
        apHero.name = "安妮";

        ADAPHero adapHero = new ADAPHero();
        adapHero.name = "艾希和安妮";

        h.kill(adHero);
        h.kill(apHero);
        h.kill(adapHero);
    }
}
