import java.util.*;

class Solution {
    public void helper(int[] candidates, int target,
                       List<List<Integer>> ans,
                       List<Integer> current, int i) {

        if (target > 0) {
            for (int j = i; j < candidates.length
                    && target >= candidates[j]; j++) {

                current.add(candidates[j]);

                helper(candidates, target - candidates[j],
                       ans, current, j);

                current.remove(current.size() - 1);
            }
        } else if (target == 0) {
            ans.add(new ArrayList<Integer>(current));
        }
    }

    public List<List<Integer>> combinationSum(
            int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        helper(candidates, target, ans,
               new ArrayList<Integer>(), 0);

        return ans;
    }
}