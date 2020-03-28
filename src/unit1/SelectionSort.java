package unit1;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 8, 6};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;

            // iterate over the remaining elements within the array to find the min index
            for(int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j; // i = 1; j = 2
                }
            }

            if (minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }

        for(int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }

        System.out.println("\nQED");
    }
}
