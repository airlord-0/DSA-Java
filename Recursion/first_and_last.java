// find the first and last occurance of an element in a string

package Recursion;

public class first_and_last {
    // initialise two stattic variables first & last this way recursion won't create new variables  and consume ram 
    public static int first = -1;
    public static int last = -1;
    public static void main (String[] args) {
        String str = "aabadfgdcgaaiopea";
        occurance(str, 0, 'a');
    }

    public static void occurance (String str, int index, char element) {
        char currchar = str.charAt(index);
        // base case : 
        if (index == str.length()-1) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        // if loop check if curent element is the element. 
        if (currchar == element) {
            // if its True, check if first is equal to -1, if its -1 then update it as first occurence 
            if (first == -1) {
                first = index;
            }
            // else assume its the last occurence as it would keep on updating upon encountering new occurences
            else {
                last = index;
            } 
            // recurse the function this time with index +1
        }
        occurance(str, index+1, element);
    }
    
}
