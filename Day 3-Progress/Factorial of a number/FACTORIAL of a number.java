import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorialResult = factorial(number);
        System.out.println("The factorial of " + number + " is " + factorialResult);
        scanner.close();
    }
}
