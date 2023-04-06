import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        char character = string.charAt(index);

        System.out.println("The character at index " + index + " is " + character);
    }
}