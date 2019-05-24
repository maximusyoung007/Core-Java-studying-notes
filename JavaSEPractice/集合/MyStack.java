package collectiondemo;

import java.util.LinkedList;

public class MyStack implements Stack{
	LinkedList<Hero> heros = new LinkedList<Hero>();
    
    @Override
    public void push(Hero h) {
        heros.addLast(h);
    }
   
    @Override
    public Hero pull() {
        return heros.removeLast();
    }
   
    @Override
    public Hero peek() {
        return heros.getLast();
    }
    public static void main(String[] args) {
    	MyStack heroStack = new MyStack();
    	for(int i = 0;i < 5;i++) {
    		Hero h = new Hero("hero" + i);
    		System.out.println("入栈");
    		heroStack.push(h);
    	}
    	for(int i = 0;i < 5;i++) {
    		Hero h = heroStack.pull();
    		System.out.println("出栈" + h);
    	}
    }
}
