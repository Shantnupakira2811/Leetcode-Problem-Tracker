class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int j = 0;
        int zeros = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) 
                zeros++;
            if (zeros > k)
                if (nums[j++] == 0) 
                    zeros--;
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}