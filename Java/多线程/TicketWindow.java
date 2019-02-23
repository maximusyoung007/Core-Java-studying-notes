package Multithreading;
/**synchronized:同步 ，修饰代码块和方法，被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他线程无法访问
 * 非静态同步方法的所对象是this
 * 静态同步方法的所对象是当前类的字节码对象
 **/
 public class TicketWindow implements Runnable {
    static int  tickets = 100;
    Object obj = new Object();

    public void run() {
        while (true) {
            /*synchronized (obj) {
                method();
            }*/
           // method();
            method2();
        }
    }
    /*public void method(){
        if (tickets > 1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + --tickets);
        }
    }**/
    private synchronized void method(){
        if (tickets > 1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + --tickets);
        }
    }
    private static synchronized void method2(){
        if (tickets > 1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + --tickets);
        }
    }
}