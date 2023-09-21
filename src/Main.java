import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        Database liste = new Database();
        int choice;

        do{
            userInterface.welcome();
            choice = scanner.nextInt();

            if (choice == 1){
                userInterface.createASuperhero();
            }

            if (choice == 2){
                userInterface.databaseprint();
            }
            if (choice == 3){
                System.out.println("Search for a superhero:");
                String brugerensSøgning = scanner.nextLine();
                liste.searchHeroByName(brugerensSøgning);
            }
            if (choice == 9){
                System.exit(0);
            }
        }while(choice != 9);
    }
}

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            userInterface.welcome();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                userInterface.createASuperhero();
            } else if (choice == 2) {
                userInterface.databaseprint();
            } else if (choice == 3) {
                userInterface.searchSuperhero();
            } else if (choice == 9) {
                System.exit(0);
            }
        } while (choice != 9);
    }
}*/


