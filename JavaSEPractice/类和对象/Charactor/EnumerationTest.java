package Charactor;

/**
 * 英雄联盟中有这么一些分类
 * TANK (坦克)
 * WIZARD (法师 )
 * ASSASSIN (刺客)
 * ASSIST (辅助)
 * WARRIOR (近战)
 * RANGED (远程 )
 * PUSH (推进)
 * FARMING (打野)
 * 设计一个枚举类型HeroType,使用上述分类作为常量
 *
 * 再编写一段switch语句，把每种枚举常量输出为中文字符串
 */
public class EnumerationTest {
    public static void main(String[] args){
        for(HeroType type : HeroType.values()) {
            switch (type){
                case TANK:
                    System.out.println("坦克");
                    break;
                case WIZARD:
                    System.out.println("法师");
                    break;
                case ASSASSIN:
                    System.out.println("刺客");
                    break;
                case ASSIST:
                    System.out.println("辅助");
                    break;
                case WARRIOR:
                    System.out.println("近战");
                    break;
                case RANGED:
                    System.out.println("推进");
                    break;
                case FARMING:
                    System.out.println("打野");
                    break;
            }
        }
    }
}
