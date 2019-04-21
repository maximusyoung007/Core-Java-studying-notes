package NumberAndString;

/**
 * 借助Math的方法，把自然对数计算出来，看看经过自己计算的自然对数和Math.E的区别有多大
 */
public class Mathmethod {
   public static void main(String[] args){
       System.out.println("e的值为:" + Math.E);

       //得到一个1到2之间的整数（取不到2），再乘一千万
       double i= (Math.random() + 1) * 10000000;

       System.out.println("极限的值为" + Math.pow((1+1/i),i));
   }
}
