// Rishi Rana
// Computer Programming II
// 11/12/24
// Random Door Game

// import
import java.util.Scanner;

// Main Class
public class main {

    // Main function
    public static void main(String args[]) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Clear console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Ask for name
        System.out.println("Hi, please enter your name: ");
        String userName = scanner.nextLine();

        // Print instructions
        System.out.println("\nHi " + userName + " welcome to the door game show!");
        System.out.println("""
                            \nThere are 3 doors, and 2 of them have nothing behind them.
                            But one of the 3 doors contain prize money. 
                            Pick a door and I will reveal 1 of the other empty doors. 
                            Then you will be given a chance to switch your chosen door
                            to potentially win prize money. Good Luck!
                            """);

        System.out.println("Enter to continue: ");
        String cont = scanner.nextLine();

        // Clear console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Pick winning door; innitilizte blank and switch choice
        int door = (int) (Math.random() * 3 + 1);
        int blank = door;
        int switchChoice;

        // Get input and remove another door
        System.out.println("There are 3 doors, choose a door (1-3)");
        int choice = scanner.nextInt();

        // make blank never equal to the correct door or chosen
        do {
            blank = (int) (Math.random() * 3 + 1);
        } while (blank == choice || blank == door);

        // if incorrect input
        if (!(choice >= 1 && choice <= 3)) {
            System.out.println("Invalid input! ReRun Program!");
        } else {
            // Reveal blank door and ask if switch
            System.out.println("You have chosen door #" + choice);
            System.out.println("Door #" + blank + " is a blank door, do you wish to change doors? (Y/N)");
            char ans = scanner.next().charAt(0);

            // If switch
            if (ans == 'Y' || ans == 'y') {
                // Switch door
                do {
                    switchChoice = (int) (Math.random() * 3 + 1);
                } while (switchChoice == choice || switchChoice == blank);

                // print if win or lose
                System.out.println("You have switched to door #" + switchChoice);
                System.out.println("The winning door is door #" + door);
                if (switchChoice == door) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("You Lose!");
                }
            } // if not switch
            else {
                // print if win or lose
                System.out.println("You have chosen door #" + choice);
                System.out.println("The winning door is door #" + door);
                if (choice == door) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("You Lose!");
                }
            }
        }
    }
}
