import java.util.Arrays;

public class BruteForceKnapsack {

    public static class Result {
        int[] picked;
        int totalValue;
        int totalWeight;
    }

    public static Result bruteKnapsack(int capacity, int[] weights, int[] values) {
        int n = weights.length;

        int bestValue = 0;
        int bestWeight = 0;
        int[] bestPicked = new int[n];

        int limit = 1 << n; // 2^n subsets

        for (int mask = 0; mask < limit; mask++) {
            int cw = 0, cv = 0;
            int[] picked = new int[n];

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    cw += weights[i];
                    cv += values[i];
                    picked[i] = 1;
                }
            }

            if (cw <= capacity && cv > bestValue) {
                bestValue = cv;
                bestWeight = cw;
                bestPicked = Arrays.copyOf(picked, n);
            }
        }

        Result r = new Result();
        r.picked = bestPicked;
        r.totalValue = bestValue;
        r.totalWeight = bestWeight;
        return r;
    }

    public static void main(String[] args) {
        // Lab test case (C=10)
        int capacity = 10;
        int[] w = {1, 1, 5, 3, 4, 1, 3, 3, 5, 3};
        int[] v = {8, 10, 10, 4, 6, 9, 8, 8, 10, 7};

        Result r = bruteKnapsack(capacity, w, v);

        System.out.println("Picked vector: " + Arrays.toString(r.picked));
        System.out.println("Total value: " + r.totalValue);
        System.out.println("Total weight: " + r.totalWeight);
    }
}