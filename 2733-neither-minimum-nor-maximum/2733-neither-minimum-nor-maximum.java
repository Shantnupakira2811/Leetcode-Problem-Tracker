class Solution {
    public int findNonMinOrMax(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Find an element that is neither min nor max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min && nums[i] < max) {
                return nums[i];
            }
        }

        return -1;
    }
}