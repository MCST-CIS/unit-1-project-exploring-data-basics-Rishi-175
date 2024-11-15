// Rishi Rana
// 11/12/24
// Random Door Game

// import
import java.util.Scanner;

// Main Class
public class main {

    // Main function
    public static void main(String args[]) {

        // Scanner
        Scanner javaScanner = new Scanner(System.in);

        // Ask for name
        System.out.println("Hi, please enter your name: ");
        String userName = javaScanner.nextLine();
        System.out.println("Hi " + userName + " welcome to the door game show!");
        System.out.println(
                "There are 3 doors. 2 of them have nothing behind them but one of them contains prize money. \nPick a door and I will reveal 1 of the other empty doors. \nThen you will be given a chance to switch and change your door.");
        System.out.println(
                "Dont worry if you loose, you will be given a chance to play another game where you guess a random number.");

    }
}
