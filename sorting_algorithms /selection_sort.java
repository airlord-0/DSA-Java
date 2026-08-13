import java.util.Arrays;

public class selection_sort {
    public static void main (String[] args) {
        // define an array 
        int[] num = {8,23,5,1,6,0};
        int size = num.length; 
        int min_index=-1;
        int temp = 0; 

        // outer loop to swap smallest numbers 

        for (int i = 0; i<size-1; i++ ) // -1 bcuz for n lenth we compare only n-l times 
            {
            min_index=i; // initialze, assume first number is the smallest
            // inner loop to find the smallest number's index as j 

            for (int j = i+1; j<size; j++) 
            {
                if (num[min_index] > num[j])
                {
                    min_index=j; // we've the index of the smallest number now 
                }
            }

            // swap update the smallest number 

            temp = num[i];
            num[i] = num[min_index];
            num[min_index] = temp;
            System.out.println(Arrays.toString(num));
        }
        System.out.println("the sorted array is : "); 
        System.out.println(Arrays.toString(num)); 
    }
}