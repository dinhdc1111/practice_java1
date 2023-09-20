package lab1;

import java.util.Scanner;

/**
 * FizzBuzz
 */
public class FizzBuzz {
    // Trò chơi FizzBuzz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số: ");
        int choiceNumber = sc.nextInt();
        if (choiceNumber % 3 == 0 && choiceNumber % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (choiceNumber % 3 == 0) {
            System.out.println("Fizz");
        } else if (choiceNumber % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(choiceNumber);
        }
        sc.close();
    }
}