package Multithreading;

/**
 * 模拟火车售票
 * 需要有火车票总数，每售出一张减1
 * 有很多售票窗口
 */
public class TicketTest {
    public static void main(String[] args){
        TicketWindow tw = new TicketWindow();
        Thread t1 = new Thread(tw);
        t1.setName("窗口1");
        Thread t2 = new Thread(tw);
        t2.setName("窗口2");
        Thread t3 = new Thread(tw);
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
