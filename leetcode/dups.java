package leetcode;
import java.util.HashSet;
import java.util.Set;

public class dups {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,8};
        boolean y = find_duplicates(array);
        System.err.println(y);
    }
    public static boolean find_duplicates (int [] nums) {
        Set <Integer> Nodups = new HashSet<>();
        for (int i =0; i<nums.length; i++ ) {
            Nodups.add (nums[i]);
        }
        if (Nodups.size() == nums.length) {
            return true;
        }
        else return false;
    }
}
