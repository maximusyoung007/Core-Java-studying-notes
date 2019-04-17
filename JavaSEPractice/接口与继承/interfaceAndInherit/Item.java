package interfaceAndInherit;

/**
 * 重写Item的 toString(), finalize()和equals()方法
 * toString() 返回Item的name + price
 * finalize() 输出当前对象正在被回收
 * equals(Object o) 首先判断o是否是Item类型，然后比较两个Item的price是否相同
 */

public class Item {
    String name;
    int price;
    public void effect(){
        System.out.println("物品使用后，会有效果");
    }

    public String toString(){
        return name + price;
    }

    public void finalize(){
        System.out.println("当前物品正在被回收");
    }

    public boolean equals(Object o){
        if(o instanceof Item){
            Item i = (Item) o;
            return this.price == i.price;
        }
        return false;
    }
    public static void main(String[] args){
        Item i = new Item();
        i.effect();

        MagicPotion m = new MagicPotion();
        m.effect();

        Item i2 = new Item();
        i2.name = "大红药";
        i2.price = 100;
        System.out.println(i2.toString());
        System.out.println(i2);

        Item i3;
        for(int n = 0;n < 10000;n++){
            i3 = new Item();
        }

        Item i4 = new Item();
        i4.price = 100;
        Item i5 = new Item();
        i5.price = 100;
        Item i6 = new Item();
        i6.price = 50;
        System.out.println(i4.equals(i5));
        System.out.println(i4.equals(i6));
    }
}
