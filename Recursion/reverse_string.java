// print the reverse of a given string using recursion
package Recursion;

public class reverse_string {
    public static void main (String[] args) {
        String name = "pavan";
        int n = name.length();
        reverser(name,n-1);

    }
    public static void reverser (String string, int n) {
        
        if ( n==0 ) {
            System.out.print(string.charAt(n));
            return;
        }
        System.out.print(string.charAt(n));
        reverser (string,n-1);
    }
// time complexity : O(n), where n = lenght of the string



// the pain because I didn't know chatAt object : 
    // public static StringBuilder reverser (StringBuilder string, int index) {
    //     if (index <= 0) {
    //         return string;
    //     }

    //     char first = string.charAt(string.length() - index);
    //     char last = string.charAt(index - 1);
    //     string.setCharAt(index - 1, first);
    //     string.setCharAt(string.length() - index, last);

    //     return reverser(string, index - 1);
        
    // }. 

}
