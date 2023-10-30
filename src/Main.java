// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Hogwarts! Let the sorting house choose your house");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println(" Answer the following questions 'yes' or 'no': ");
        System.out.println("Do you value bravery and chivalry?");
        String question1 = scan.nextLine();

        if (question1.equals("yes")) {
            System.out.println("Dear " + name + ", " + "\nYou belong to Gryffindor!");
        } else if (question1.equals("no")) {
            System.out.println("Do you value hard work, dedication, and loyalty?");
            String question2 = scan.nextLine();
            System.out.println("Do you value intelligence, creativity, and learning?");
            String question3 = scan.nextLine();
            if (question2.equals("no") && question3.equals("yes")) {
                System.out.println("Dear " + name + ", " + "\nYou belong to Ravenclaw!");
            }
            else
            {
                System.out.println("Dear " + name + ", " + "\nYou belong to Slytherin!");
            }
        }
    }
}