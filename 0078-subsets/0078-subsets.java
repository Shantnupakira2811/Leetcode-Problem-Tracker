class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        helper(nums, 0, new ArrayList<Integer>(), answer);
        return answer;
    }

    public void helper(int[] nums, int index, List<Integer> current,
                       List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        helper(nums, index + 1, current, result);

     
        current.remove(current.size() - 1);

      
        helper(nums, index + 1, current, result);
    }
}

