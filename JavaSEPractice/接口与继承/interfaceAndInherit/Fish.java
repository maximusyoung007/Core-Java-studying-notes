package interfaceAndInherit;

/**
 * 1. 创建Fish类，它继承Animal类
 * 2. 重写Animal的walk方法以表明鱼不能走且没有腿。
 * 3. 实现Pet接口
 * 4. 无参构造方法
 * 5. 提供一个private 的name属性
 */
public class Fish extends Animal implements Pet{
    private String name;
    public Fish(){
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("fish play in the water");
    }

    @Override
    public void walk() {
        System.out.println("fish has no feet,cannot walk");
    }

    public void eat(){
        System.out.println("fish eat");
    }
}
