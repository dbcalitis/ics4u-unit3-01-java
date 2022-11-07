/*
 * This program reverses the string
 * using recursion.
 *
 * @author  Daria Bernice Calitis
 * @version 11.0.16
 * @since   2022-11-07
 */

import java.util.Scanner;

/**
 * Main class.
 */
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The reverseString function.
     *
     * @param str the string that will be reversed.
     * @return String the reversed string.
     */
    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Create Scanner Object.
        final Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        final String stringInput = scan.nextLine();

        System.out.println();
        System.out.printf("The original string is: %s", stringInput);
        System.out.printf("\nThe reversed string is: %s",
            reverseString(stringInput));
        System.out.println();

        System.out.println("\nDone.");
    }
}
