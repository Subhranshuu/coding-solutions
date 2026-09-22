import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Start backtracking from the 0th index with an empty tracking list
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int start) {
        // Deep copy the current subset combinations and add to the final list
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            // Step 1: Make a choice (include the current number)
            current.add(nums[i]);
            
            // Step 2: Explore further down the decision tree
            backtrack(result, current, nums, i + 1);
            
            // Step 3: Undo the choice (backtrack to explore other paths)
            current.remove(current.size() - 1);
        }
    }
}
