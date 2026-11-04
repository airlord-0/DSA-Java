package leetcode;

public class removedups {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3};

        int k = removeDuplicates(arr);

        System.out.println("Unique elements: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {

        // Handle empty array
        if (arr.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[k - 1]) {

                arr[k] = arr[i];
                k++;

            }
        }

        return k;
    }
}