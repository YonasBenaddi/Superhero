import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Database database;

    public UserInterface(){
        scanner = new Scanner(System.in);
        database = new Database();
    }

    public void welcome(){
        System.out.println("Welcome to the superhero universe!");
        System.out.println("1. Create a superhero");
        System.out.println("2. Print superhero:");
        System.out.println("3. Search for a superhero:");
        System.out.println("9. Exit");
    }

    public void createASuperhero(){
        //Name, real name, superpower, year created, is human, strength
        System.out.println("Insert name");
        String name = scanner.nextLine();
        System.out.println("Insert real name");
        String realName = scanner.nextLine();
        System.out.println("Insert superpower");
        String superpower = scanner.nextLine();
        System.out.println("Insert year created");
        int yearCreated = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert true or false");
        boolean isHuman = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Insert strenght");
        String strenght = scanner.nextLine();
        Superhero hero = new Superhero(name, realName, superpower, yearCreated, isHuman, strenght);
        database.addHero(hero);
        System.out.println(hero);
    }

    public void databaseprint() {
        database.databaseprint();
    }
    }



