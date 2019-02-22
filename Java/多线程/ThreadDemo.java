package Multithreading;

public class ThreadDemo  {
    public static void main(String[] args){
        MyThread1 mt = new MyThread1();
        mt.setName("张三");
        mt.start();
        MyThread1 mt2 = new MyThread1();
        mt2.setName("李四");
        mt2.start();
    }

}
