package exceptionsHandling.squareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        try {

            int i = Integer.parseInt(s);

            System.out.println(i*i);

        } catch (NumberFormatException ex) {

            System.out.println("Invalid integer number!");

        }
        System.out.println("Good bye");
    }
}
