package interfaceAndInherit;

/**
 * 设计一个治疗者接口：Healer
 * 该接口声明有方法： heal()
 * 设计一个Support类，代表辅助英雄，继承Hero类，同时实现了Healer这个接口
 */
public class Support extends Hero implements Healer {
    public Support(){
        super("");
    }
    @Override
    public void heal() {
        System.out.println(name + " 加了一口血");
    }
    public static void main(String[] args){
        Support s = new Support();
        s.name = "张三";
        s.heal();
    }
}
