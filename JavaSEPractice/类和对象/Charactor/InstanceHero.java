package Charactor;

/**
 * 使用饿汉式单例模式将Hero改造成单例模式
 */
public class InstanceHero {
    private InstanceHero(){}
    private static InstanceHero instance = new InstanceHero();
    public static InstanceHero getInstance(){
        return instance;
    }
}
