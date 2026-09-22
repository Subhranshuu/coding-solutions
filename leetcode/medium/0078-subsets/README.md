# Subsets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of  **unique**  elements, return  *all possible*   *subsets*   *(the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10
- All the numbers of nums are unique.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 87.20%)  
**Memory:** 44.4 MB (beats 20.55%)  
**Submitted:** 2026-09-22T13:25:22.472Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/subsets/)