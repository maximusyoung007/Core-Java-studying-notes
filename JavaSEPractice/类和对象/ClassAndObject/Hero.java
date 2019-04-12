package ClassAndObject;

/**
 * 为Hero设计4个参数的构造方法
 * 这四个参数分别是
 * String heroName
 * float heroHP
 * float heroArmor
 * int heroMoveSpeed
 */
public class Hero {
    public String name;
    public int hp;
    int armor;
    int moveSpeed;

    public Hero(){}

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
    public static void main(String[] args){
        Hero timo = new Hero("提莫");
        Hero garen = new Hero("盖伦",4000);
        Hero anny = new Hero("安妮",200,200,200);
        Hero ez = new Hero("小黄毛",100,8);

        System.out.println(timo.name + " " + timo.hp + " "  + timo.armor + " " + timo.moveSpeed);
        System.out.println(garen.name + " " + garen.hp + " "  + garen.armor + " " + garen.moveSpeed);
        System.out.println(ez.name + " " + ez.hp + " " + ez.armor + " " + ez.moveSpeed + " ");
        System.out.println(anny.name + " " + anny.hp + " "  + anny.armor + " " + anny.moveSpeed);
    }
}
