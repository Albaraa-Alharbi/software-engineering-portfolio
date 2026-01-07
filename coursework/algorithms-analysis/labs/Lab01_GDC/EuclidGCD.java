import java.util.Scanner;

public class EuclidGCD {

    public static int euclid(int m, int n) {
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int m = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n = scanner.nextInt();

        if (m == 0 && n == 0) {
            System.out.println("Both numbers cannot be zero.");
            return;
        }

        System.out.println("GCD is: " + euclid(m, n));
    }
}