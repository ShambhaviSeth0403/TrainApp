package main;

// UC16.java

public class UC16 {

    // Bubble Sort Method
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Main method
    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        bubbleSort(capacities);

        System.out.print("Sorted Capacities: ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}