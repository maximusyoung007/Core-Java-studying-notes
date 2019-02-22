package Multithreading;

public class TicketWindow implements Runnable{
    int tickets = 100;
    public void run(){
        while(true){
            if(tickets > 0)
                System.out.println(Thread.currentThread().getName() + ":" + --tickets);
        }
    }
}
