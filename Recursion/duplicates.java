// for a given string containing duplicates, remove duplicates in it. keep 1
package Recursion;

public class duplicates {
    public static boolean[] map = new boolean [26];

    public static void dupremover(String newString, int idx, String str) {
        char currchar = str.charAt(idx);
        if (idx == str.length()-1){
            System.out.println(newString);
            return;
        }
        if (map[currchar - 'a']) {
            dupremover(newString, idx+1, str);
        } else {
            newString += currchar;
            map[currchar-'a'] = true;
            dupremover(newString, idx+1, str);
        }

    }
    public static void main (String[] args){
        String str = "abbccbdezz";
        dupremover("", 0, str);
    }
}
