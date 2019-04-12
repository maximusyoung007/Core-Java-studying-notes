package Charactor;

/**
 * 使用懒汉单例模式将Item类改造成单例模式
 */
public class InstanceItem {
    //声明构造方法为私有
    private InstanceItem(){}

    //静态属性指向实例，这里为null,饿汉式则直接指定（即是否用到这个对象，都会加载）
    public static InstanceItem instance;

    //返回第二步的静态属性，
    public InstanceItem getInstance(){
        if(instance == null){
            instance = new InstanceItem();
        }
        return instance;
    }
}
