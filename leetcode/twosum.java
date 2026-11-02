package leetcode;
public class twosum {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5}; //0,4
        int target = 6;
        twoSum (a,target);
        
    }

    public static int [] twoSum (int [] nums, int target) {
        int sum = 0;
        int [] indices = new int[2];

        for (int i = 0; i<nums.length; i++) {
            for (int j = 0; j<nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    System.out.println(indices);
                    return indices;
                }
            }
        }
        return indices;
    }
}
