class Solution {
    public boolean isMonotonic(int[] nums) {
        
        if(nums.length <= 1) {
            return true;
        }
        
        // monotone increasing
        for(int i = 0; i < nums.length-1; i++) {
            
            if(nums[i] <= nums[i+1]) {
                
                if(i == nums.length-2) {
                    return true;
                }
                
                continue;
                
            } else {
                break;
            }
            
        }
        
        // monotone decreasing
        for(int i = 0; i < nums.length-1; i++) {
            
            if(nums[i] >= nums[i+1]) {
                
                if(i == nums.length-2) {
                    return true;
                }
                
                continue;
                
            } else {
                break;
            }
            
        }
        
        return false;
        
    }
}
