import java.util.Scanner;
import java.util.Random;

public class MyProgram {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    Scanner range = new Scanner(System.in);

int cont = 505;
int stop = 404;
    System.out.println("enter the range you want");
    int rangeNum = range.nextInt();
    
    //   if (scanner.hasNextInt()){
    //    rangeNum = range.nextInt();
        
    // }
    // else{
    //     System.out.println("Please enter a valid number");
    // }
    
   
    int randomNum = rand.nextInt(rangeNum) + 1;

    System.out.println("Enter your number (1-" +rangeNum +")");

    int count = 1;

    
    
    while(count < 6) {
      count += 1;
      int remaining = 7 - count;
      
            int playerGuess = scanner.nextInt();
      
      if (randomNum == playerGuess){
        System.out.println("You are spot on you got it right");
        System.out.println("Your Score is "+remaining);
        System.out.println("to play again enter: 505");
        System.out.println("to quit the game enter: "+stop);
      }
      if (playerGuess == cont) {
        randomNum = rand.nextInt(rangeNum) + 1;
        count = 1;
        System.out.println("the count is "+count);
      }
      else if (playerGuess == stop){
      System.out.println("you have quit the game");
      break;
      }
      else if (randomNum < playerGuess){
        System.out.println("the number is below your number");
        System.out.println("You have " +remaining +" tries remaining");
      }
      else{
        System.out.println("the number is above your number");
        System.out.println("You have " +remaining +" tries remaining");
      }
      
    }

     if (count >= 6){
        System.out.println("no more moves");
       System.out.println("to play again enter: 505");
       int playerGuess = scanner.nextInt();
       if (playerGuess == cont){
         count = 1;
         System.out.println("the count is "+count);
       }
    }
   
    scanner.close();
  }
}