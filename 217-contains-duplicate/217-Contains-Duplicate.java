// whenever there's a duplicate thing use Hash set
// .add() returns true if there is a duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }   
        }
        return false;
        
    }
}