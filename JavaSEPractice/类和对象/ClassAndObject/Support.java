package ClassAndObject;

/**
 * 设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
 * 对Support的heal方法进行重载
 * heal()
 * heal(Hero h) //为指定的英雄加血
 * heal(Hero h, int hp) //为指定的英雄加了hp的血
 */
public class Support extends Hero{
    public void heal(){
        System.out.println("给特定英雄加血");
    }

    public void heal(Hero h){
        System.out.println("给" + h.name + "加血");
    }

    public void heal(Hero h,int hp){
        h.hp += hp;
        System.out.println("给" + h.name + "加血，现在为" + h.hp);
    }
    public static void main(String[] args){
        Support support = new Support();
        Hero h1 = new Hero();
        h1.name = "提莫";
        h1.hp = 32;

        Hero h2 = new Hero();
        h2.name = "影流之主";
        h2.hp = 2;

        support.heal(h1);
        support.heal(h2,35);

    }
}
