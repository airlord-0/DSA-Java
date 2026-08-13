import java.util.Arrays;

public class insertion_sort {
    public static void main (String [] args) {
        int [] a = {10,5,6,1,0, 77};
        for (int i = 1; i<a.length; i ++) 
        {
            int key = a[i];
            int j=i-1;

            while (j>=0 && a[j]>key) 
            {
                a[j+1]= a[j];
                j--;
            }

            a[j+1]=key; // insert the key in the newly made room 
        }

        System.out.println(Arrays.toString(a));
    }
}
// 2nd iteration : i = 2, a[2] = 6, j=1, a[j]=10.
//  a[j+1]=a[j]-> 5,10,  6,1,0,77 -> 5, 10,  10,1,0,77. 
// j-- -> j=0; we exit out of while loop 
// a[j+1] = a[1]=key= 

// 3rd iteration : i = 3, j=2, a[2]= 