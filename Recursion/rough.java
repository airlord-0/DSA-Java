package Recursion;

public class rough {
    public static long arrayManipulation(int n, int[][] queries) {

    long[] arr = new long[n];

    for (int i = 0; i < queries.length; i++) {

        int a = queries[i][0];
        int b = queries[i][1];
        int k = queries[i][2];

        // Add k to every element from a to b
        for (int j = a - 1; j <= b - 1; j++) {
            arr[j] += k;
        }
    }

    // Find maximum
    long max = 0;

    for (long value : arr) {
        if (value > max) {
            max = value;
        }
    }

    return max;
}
 public static void main(String[] args) {

    int n = 10;

    int[][] queries = {
        {1, 5, 3},
        {4, 8, 7},
        {6, 9, 1}
    };

    long result = arrayManipulation(n, queries);

    System.out.println("Maximum value: " + result);
}
}
