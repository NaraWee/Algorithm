class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        
        for(int i = 0; i <= nums.length-k; i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += nums[i+j];
            }
            
            if(sum > max) {
                max = sum;
            }
        }
        
        return max/k;
    }
}