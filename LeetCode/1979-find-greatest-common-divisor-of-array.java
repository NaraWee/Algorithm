class Solution {
    public int findGCD(int[] nums) {
        
        int min = 1001;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] >= max) {
                max = nums[i];
            }
            if(nums[i] <= min) {
                min = nums[i];
            }
            
        }
        
        int gcd = GCD(max, min);
        
        return gcd;
        
    }
    
    // 유클리드 알고리즘 이용
    public int GCD(int max, int min) {
        
        int temp = 0;
        
        if(min > max) {
            temp = min;
            min = max;
            max = temp;
        }
        
        if(max % min != 0) {
            
            max = max % min;
            min = GCD(max, min);
            
        }
        
        return min;
        
    }
}
