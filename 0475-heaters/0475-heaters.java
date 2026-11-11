class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = 0;

        for (int house : houses) {
            int left = 0, right = heaters.length;

            // Find the first heater whose position is >= house.
            while (left < right) {
                int mid = left + ((right - left) >>> 1);

                if (heaters[mid] < house) left = mid + 1;
                else right = mid;
            }

            // Calculate distance to the nearest heater on either side.
            int rightDist = left < heaters.length
                    ? heaters[left] - house : Integer.MAX_VALUE;

            int leftDist = left > 0
                    ? house - heaters[left - 1] : Integer.MAX_VALUE;

            result = Math.max(result, Math.min(leftDist, rightDist));
        }

        return result;
    }
}