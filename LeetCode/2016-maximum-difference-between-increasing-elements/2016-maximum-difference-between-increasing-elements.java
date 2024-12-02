class Solution {
    public int maximumDifference(int[] nums) {
        
        int max = -1;
        
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] >= nums[j]) continue;
                
                int diff = nums[j] - nums[i];
                if(diff > max) {
                    max = diff;
                }
            }
        }
        
        return max;
    }
}