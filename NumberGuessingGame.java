import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum = rand.nextInt(100) + 1;

        int count = 0;
        
        while(true) {

            count += 1;
            System.out.println("Enter your number (1-100)");
            // System.out.println("random Number is " +randomNum);

        int playerGuess = scanner.nextInt();

        if (playerGuess == randomNum) {
            System.out.println("Correct! you win!");
            System.out.println("it took you "+ count +" tries");
            break;
        }
        else if(randomNum > playerGuess) {
            System.out.println("number is higher try again");
        }
        else {
            System.out.println("number is lower try again");
        }
    }
    if (count >= 5) {
        System.out.println("you have foiled your attempts");
    }
    }
}