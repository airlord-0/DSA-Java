// for a given array of strings abxcvxxtu, move all x to the end of the array such as abcvtuxxx
package Recursion;

public class movex {
    public static void remover (String str,int idx, String newString, int count) {
        char currchar = str.charAt(idx);
        // base case 
        if (idx == str.length()-1) {
            for (int i = 1; i<=count; i++) {
                newString += 'x';
            }
            System.out.print(newString);
            return ;
        }
        if (currchar == 'x') {
            count++;
            remover(str, idx+1, newString, count);
        } else {
            newString += currchar;
            remover(str,  idx+1, newString, count);
        }
    }

    public static void main (String[] args) {
        String str = "abxcvxxtuttttttt";
        
        remover (str, 0, "", 0) ;
    }
}
