import java.util.Arrays;
import java.util.Random;

public class LoadFactorTest {

    public static void main(String[] args) {

        // Number of keys
        int N = 10;

        // Load factor α = 0.5 → M = 2 × N
        int M = 2 * N;

        // Create empty hash table
        int[] table = new int[M];
        Arrays.fill(table, -1);

        Random rand = new Random();

        // Insert N random keys
        for (int i = 0; i < N; i++) {
            int key = rand.nextInt(100) + 1;
            int index = key % M;

            while (table[index] != -1) {
                index = (index + 1) % M;
            }

            table[index] = key;
        }

        // Print table
        System.out.println("Hash Table:");
        System.out.println(Arrays.toString(table));

        // Perform 10 random searches
        int totalComparisons = 0;

        for (int t = 1; t <= 10; t++) {
            int key = rand.nextInt(100) + 1;
            int index = key % M;
            int comparisons = 1;

            while (table[index] != key && table[index] != -1) {
                index = (index + 1) % M;
                comparisons++;
            }

            System.out.println(
                t + ") Searched Key = " + key +
                ", Comparisons = " + comparisons
            );

            totalComparisons += comparisons;
        }

        // Average comparisons
        double average = totalComparisons / 10.0;
        System.out.println("Average Comparisons: " + average);
    }
}