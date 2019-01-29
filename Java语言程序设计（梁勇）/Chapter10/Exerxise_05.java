package Chapter10;
import java.util.Scanner;
public class Exerxise_05 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("The factors for " + n + " is");
        int factor = 2;
        while (factor <= n) {
            if (n % factor == 0) {
                n = n / factor;
                stack.push(factor);
            }
            else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
class StackOfIntegers{
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    public StackOfIntegers(){
        this (DEFAULT_CAPACITY);
    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }
    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    public int pop(){
        return elements[--size];
    }
    public int peek(){
        return elements[size - 1];
    }
    public boolean empty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
}
