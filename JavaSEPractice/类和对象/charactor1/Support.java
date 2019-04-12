package charactor1;

import ClassAndObject.Hero;

public class Support extends Hero {
    public void heal(Hero h,int hp){
        h.hp += hp;
        System.out.println("给" + h.name + "加血，现在为" + h.hp);
    }
    public static void main(String[] args){
        Support support = new Support();

        Hero h2 = new Hero();
        h2.name = "影流之主";
        h2.hp = 2;

        support.heal(h2,35);


    }
}
