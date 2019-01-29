package Chapter10;
public class Exercise_06 {
    public static void main(String[] args){
        StackOfIntegers stack = new StackOfIntegers();
        for(int i = 2;i <= 120;i++){
            if(isPrime(i))
                stack.push(i);
        }
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
    }
    public static boolean isPrime(int n){
        for(int i = 2;i < n;i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}

