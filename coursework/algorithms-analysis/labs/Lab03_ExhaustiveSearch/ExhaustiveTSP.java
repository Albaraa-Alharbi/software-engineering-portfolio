import java.util.Arrays;

public class ExhaustiveTSP {

    static class Result {
        int[] route;
        int distance;
    }

    public static Result solveTSP(int[][] D) {
        int n = D.length;

        boolean[] used = new boolean[n];
        int[] route = new int[n + 1];

        route[0] = 0;
        used[0] = true;

        Result best = new Result();
        best.distance = Integer.MAX_VALUE;
        best.route = new int[n + 1];

        backtrack(D, used, route, 1, 0, best);
        return best;
    }

    private static void backtrack(int[][] D, boolean[] used, int[] route, int pos, int dist, Result best) {
        int n = D.length;

        if (pos == n) {
            int total = dist + D[route[pos - 1]][0];
            if (total < best.distance) {
                best.distance = total;
                best.route = Arrays.copyOf(route, n + 1);
                best.route[n] = 0;
            }
            return;
        }

        for (int i = 1; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                route[pos] = i;

                backtrack(D, used, route, pos + 1, dist + D[route[pos - 1]][i], best);

                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] D = {
            {0, 4, 10, 10, 3},
            {4, 0, 9, 9, 6},
            {10, 9, 0, 9, 10},
            {10, 9, 9, 0, 6},
            {3, 6, 10, 6, 0}
        };
        
        Result r = solveTSP(D);
        
        System.out.print("Best route (1-based): ");
        for (int node : r.route) {
            System.out.print((node + 1));
        }
        System.out.println();
        
        System.out.println("Minimum distance: " + r.distance);
        
    }
}