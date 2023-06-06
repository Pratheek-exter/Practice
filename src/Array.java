import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store strings
        String[] array = new String[3];

        // Take input from the user and store it in the array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter your name: ");
            array[i] = scanner.nextLine();
        }

        // Print the strings stored in the array
        System.out.println("Name stored in the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
