package Chapter3;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 3);
        System.out.println("scissor(0),rock(1),paper(2):");
        int b = input.nextInt();
        if(a == 0 && b == 0){
            System.out.print("The computer is scissor and you are a scissor,too.So it is a draw.");
        }
        if(a == 0 && b == 1){
            System.out.print("The computer is scissor and you are a rock.So you won.");
        }
        if(a == 0 && b == 2){
            System.out.print("The computer is scissor and you are a paper.So you lose.");
        }
        if(a == 1 && b == 0){
            System.out.print("The computer is rock and you are a scissor.So you lose.");
        }
        if(a == 1 && b == 1){
            System.out.print("The computer is rock and you are a rock,too.So it is a draw.");
        }
        if(a == 1 && b == 2){
            System.out.print("The computer is scissor and you are a paper.So you win.");
        }
        if(a == 2 && b == 0){
            System.out.print("The computer is paper and you are a scissor.So you win.");
        }
        if(a == 2 && b == 1){
            System.out.print("The computer is paper and you are a rock.So you lose.");
        }
        if(a == 2 && b == 2){
            System.out.print("The computer is paper and you are a paper,too.So it is a draw.");
        }
    }
}
