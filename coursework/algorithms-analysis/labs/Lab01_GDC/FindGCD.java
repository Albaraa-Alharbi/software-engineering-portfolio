import java.util.Scanner;

public class FindGCD {

    public static int findGCD(int m, int n) {
        int min = Math.min(m, n);
        int gcd = 1;

        for (int i = 1; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int m = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n = scanner.nextInt();

        if (m == 0 || n == 0) {
            System.out.println("Do not enter zero");
            return;
        }

        System.out.println("GCD of " + m + " and " + n + " is: " + findGCD(m, n));
    }
}