import java.util.Scanner;

public class BruteForceStringMatch {

    public static int bfSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your text: ");
        String text = scanner.nextLine();

        System.out.print("Your pattern: ");
        String pattern = scanner.nextLine();

        int index = bfSearch(text, pattern);

        if (index != -1) {
            System.out.println("Match found at index: " + index);
        } else {
            System.out.println("No match found");
        }
    }
}