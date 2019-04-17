package interfaceAndInherit;

/**
 * 如下转换能否成功？
 * 如果不能，是哪一行会出错？
 * 为什么会出错
 */
public class transfer {
    public static void main(String[] args){
        ADHero ad = new ADHero();
        Hero h = ad;
        AD adi = (AD) h;
        //APHero ap = (APHero) adi;
        //出错，APHero 和 ADHero之间没有关系，所以会出错
    }
}
