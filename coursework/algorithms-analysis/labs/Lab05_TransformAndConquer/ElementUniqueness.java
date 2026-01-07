import java.util.Arrays;

public class ElementUniqueness {

    public static void checkUniqueness(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                System.out.println("Not Unique");
                return;
            }
        }
        System.out.println("All elements are unique");
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 1, 9};
        int[] arr2 = {4, 7, 2, 7, 1};

        System.out.print("Array 1: ");
        checkUniqueness(arr1);

        System.out.print("Array 2: ");
        checkUniqueness(arr2);
    }
}