
// give an array, the functions tells if its strictly increasing 
package Recursion;

public class strictly_increasing {
    public static boolean checker (int arr[], int ind) {  // the function takes an array and index number as parameters
        // we increment the ind after each check 
        // when it hits the base case arr.lenth()-1, we simply return true 

        // base case 

        // check if arr[ind] < arr[ind+1] if yes return the same with ind + 1else return false 
        if (ind == arr.length-1) {    //  -1 because we are starting from 0, lenth include number of elements
            System.out.println("The array is strictly increaseing");
            return true;
        }
        if (arr[ind]>=arr[ind+1]) {
            System.out.println("not strickty increasing");
            return false;
        }
        return checker(arr, ind+1);
    } 
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5,8};
        checker(arr,0);
    }
}
