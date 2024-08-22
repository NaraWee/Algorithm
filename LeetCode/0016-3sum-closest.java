class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int temp = 0;
        int min = nums[0] + nums[1] + nums[2];
        int sum = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
            
            for(int j = i+1; j < nums.length - 1; j++) {
                
                for(int k = j+1; k < nums.length; k++) {
                    
                    sum = nums[i] + nums[j] + nums[k];
                    temp = Math.abs(target - sum);
                    
                    if(temp <= Math.abs(target - min)) {
                        
                        min = sum;
                    }
                    
                }
            }
        }
        
        return min;
        
    }
}
