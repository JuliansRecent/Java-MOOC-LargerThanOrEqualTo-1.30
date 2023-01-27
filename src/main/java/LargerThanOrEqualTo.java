
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for two numbers
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());

        // Create a conditional statement that evaluates and prints the greater number
        if (a > b) {
            // If a is greater than b, print a
            System.out.println("Greater number is:" + a);
        } else if (b > a) {
            // If b is greater than a, print b
            System.out.println("Greater number is:" + b);
        } else if (a == b) {
            // If a and b are equal, print 'The numbers are equal
            System.out.println("The numbers are equal!");
        }
    }
}
