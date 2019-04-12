package Charactor;

/**
 * 在一个类方法中，直接调用一个对象方法，
 * 比如在battleWin中调用die()
 * 能否直接调用？ 为什么？
 */
public class Hero2 {
    public String name;
    protected float hp;
    //实例方法，必须通过对象调用
    public void die(){
        hp = 0;
    }

    //类方法，可通过类直接调用
    public static void WinBattle(){
        System.out.println("获得胜利");
    }
    public static void loseBattle(){
        System.out.println("失败了");
        //die();
    }

    public static void main(String[] args){
        Hero2 garen =  new Hero2();
        garen.name = "盖伦";
        //必须有一个对象才能调用
        garen.die();

        Hero teemo =  new Hero();
        teemo.name = "提莫";

        //无需对象，直接通过类调用
        Hero2.WinBattle();

        /*
        不能，不能调用，因为调用battleWin()的时候，
        很可能没有任何具体对象，然而die()是一个对象方法，必须建立在有对象的前提下。
         */
    }
}
