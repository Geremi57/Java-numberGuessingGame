import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        Scanner range = new Scanner(System.in);

        System.out.println("Enter the range you want");
        System.out.println();

        int rangeNum = range.nextInt();
        int randomNum = rand.nextInt(rangeNum) + 1;

        int count = 0;
        
        System.out.println("Enter your number (1-100)");
        System.out.println();
        while(count < 5) {

            count += 1;
            int remaining = 5 - count;
            // System.out.println("random Number is " +randomNum);

        int playerGuess = scanner.nextInt();

        if (playerGuess == randomNum) {
            System.out.println("Correct! you win!");
            System.out.println();
            System.out.println("it took you "+ count +" tries");
            break;
        }
        else if(randomNum > playerGuess) {
            System.out.println();
            System.out.println("number is higher try again");
            System.out.println();
            System.out.println("you have "+remaining +" tries");

        }
        else {
            System.out.println("number is lower try again");
            System.out.println("you have "+remaining +"tries");
        }
    }
    if (count >= 5) {
        System.out.println("you have foiled your attempts");
        System.out.println();
        System.out.println("the number was "+randomNum);

    }
    scanner.close();
    }
}
