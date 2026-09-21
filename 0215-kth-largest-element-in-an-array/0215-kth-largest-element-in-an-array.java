class Solution {
    public int findKthLargest(int[] nums, int k) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int[] freq = new int[max - min + 1];

        for (int num : nums) {
            freq[num - min]++;
        }

        for (int i = freq.length - 1; i >= 0; i--) {

            k -= freq[i];

            if (k <= 0) {
                return i + min;
            }
        }

        return -1;
    }
}