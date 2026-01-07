public class ClosestPair2D {

    public static double distance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }

    public static void main(String[] args) {
        int[][] points = { {10, 20}, {15, 25}, {30, 5}, {12, 18}, {25, 30} };

        int n = points.length;
        double minDist = Double.MAX_VALUE;
        int idx1 = -1, idx2 = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double d = distance(points[i], points[j]);
                if (d < minDist) {
                    minDist = d;
                    idx1 = i;
                    idx2 = j;
                }
            }
        }

        System.out.println(
            "Closest points: " + idx1 + "(" + points[idx1][0] + "," + points[idx1][1] + ") and "
            + idx2 + "(" + points[idx2][0] + "," + points[idx2][1] + ")"
            + " the distance = " + minDist
        );
    }
}