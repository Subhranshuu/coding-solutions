class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            // Update the global maximum if the current subarray sum is larger
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            // If the running sum becomes negative, discard it and start fresh
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}
