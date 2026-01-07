import java.util.Arrays;

public class LinearProbing {

    public static void main(String[] args) {

        // Keys to insert
        int[] keys = {15, 28, 19, 20, 33};

        // Hash table size
        int tableSize = 10;

        // Create table and mark empty cells with -1
        int[] table = new int[tableSize];
        Arrays.fill(table, -1);

        // Insert each key using linear probing
        for (int key : keys) {
            int index = key % tableSize;

            while (table[index] != -1) {
                index = (index + 1) % tableSize;
            }

            table[index] = key;
        }

        // Print final table
        System.out.println("Final Hash Table:");
        System.out.println(Arrays.toString(table));
    }
}