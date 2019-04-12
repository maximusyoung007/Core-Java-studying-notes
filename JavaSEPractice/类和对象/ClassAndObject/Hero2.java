package ClassAndObject;

/**
 * 使参数引用指向一个新的对象
 *
 * 外面的引用是指向原来的对象？还是新的对象？
 */
public class Hero2 {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero2(){

    }

    public Hero2(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero2 h){
        h = new Hero2("提莫",383);
    }

    public static void main(String[] args) {
        Hero2 teemo =  new Hero2("提莫",383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);

        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？
        System.out.println(teemo.hp);
        //答案:h所指向的对象指向了teemo指向的对象，但是teemo还是指向原来的对象并没有改变，所有teemo输出
    }

}