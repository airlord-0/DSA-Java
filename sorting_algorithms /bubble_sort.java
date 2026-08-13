import java.lang.reflect.Array;
import java.util.*;
// bubble sort time complexity O(n^2)
public class bubble_sort {
    public static void main (String [] args) {
        int[]a = {7,8,3,2,1};
        System.out.println(Arrays.toString(a) + " is the unsorted array");
        // we need 2 loops outer loop controls how many times the inner loop has to sort elements 
        // while inner loop compares adjescent elements and swaps them in a given condition 
        // the inner loop pushes the largest element to the last in each iteration 
        int temp=0;

        for (int j=0; j<a.length-1; j++) {
            for (int i=0; i<a.length-j-1; i++){
                if (a[i]>a[i+1]) {
                    temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(a));
        
        
       
    }
}
