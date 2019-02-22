package Multithreading;

public class ThreadDemo3 {
    public static void main(String[] args){
        MyThread2 mt = new MyThread2();
        Thread t = new Thread(mt);
        t.setName("李四");
        t.start();
        Thread t2 = new Thread(mt);
        t2.setName("老王");
        t2.start();
    }
}
