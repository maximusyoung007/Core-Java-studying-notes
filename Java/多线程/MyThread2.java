package Multithreading;

public class MyThread2 implements Runnable {
    public void run(){
        for(int i = 0;i < 1000;i++){
            //Thread t = Thread.currentThread();
            //System.out.println(t.getName() + ":" + i);

            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
