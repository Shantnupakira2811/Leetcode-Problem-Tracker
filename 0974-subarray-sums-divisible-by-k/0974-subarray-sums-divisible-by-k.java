class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] rem = new int[k];
        int offset = 0, res = 0;

        for (int cur : nums) {
            // Lazily rotate all existing suffix remainders by cur % k
            offset = Math.floorMod(offset + cur, k);

            // Add the new one-element subarray [cur]
            // Convert its logical remainder into the physical index
            rem[Math.floorMod(Math.floorMod(cur, k) - offset, k)]++;

            // Get the frequency of logical remainder 0
            // using its corresponding physical index
            res += rem[Math.floorMod(-offset, k)];
        }

        return res;
    }
}