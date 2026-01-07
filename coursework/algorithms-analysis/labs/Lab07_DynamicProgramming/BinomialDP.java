public class BinomialDP {

    public static int binomial(int n, int k) {
        int[][] C = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    C[i][j] = 1;
                } else {
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
                }
            }
        }
        return C[n][k];
    }

    public static void main(String[] args) {
        System.out.println("C(5, 2) = " + binomial(5, 2));
        System.out.println("C(6, 3) = " + binomial(6, 3));
    }
}