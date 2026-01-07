import java.util.Arrays;

public class ModeFinder {

    public static int findMode(int[] A) {
        Arrays.sort(A);

        int mode = A[0];
        int currentValue = A[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == currentValue) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    mode = currentValue;
                }
                currentValue = A[i];
                count = 1;
            }
        }

        if (count > maxCount) {
            mode = currentValue;
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 5, 3, 3, 3, 2, 5, 1, 5};
        int mode = findMode(arr);

        System.out.println("Mode of array: " + mode);
    }
}