public class RecursiveBinarySearch {

    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == key)
            return mid;
        else if (key < arr[mid])
            return binarySearch(arr, left, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, right, key);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 12, 20, 34, 50};

        int existingKey = 20;
        int nonExistingKey = 7;

        int foundIndex = binarySearch(arr, 0, arr.length - 1, existingKey);
        int notFoundIndex = binarySearch(arr, 0, arr.length - 1, nonExistingKey);

        if (foundIndex != -1)
            System.out.println("Element " + existingKey + " found at index " + foundIndex);
        else
            System.out.println("Element " + existingKey + " not found.");

        if (notFoundIndex != -1)
            System.out.println("Element " + nonExistingKey + " found at index " + notFoundIndex);
        else
            System.out.println("Element " + nonExistingKey + " not found.");
    }
}