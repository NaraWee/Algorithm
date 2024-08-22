package leet;

public class TwoSum {
	
	public static void main(String[] args) {
		
		// https://leetcode.com/problems/two-sum/
		
		TwoSum sum = new TwoSum();
		int[] nums = {2,7,11,15};
		int target = 9;
		
		for(int i : sum.twoSum(nums, target))
		System.out.print(i + " ");
		
	}

	public int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        int[] output = new int[2];
        
        for(int i = 0; i < nums.length-1; i++) {
            
            for(int j = i+1; j < nums.length; j++) {
                
                sum = nums[i] + nums[j];
                
                if(sum == target) {
                    
                    output[0] = i;
                    output[1] = j;
                    
                }
            }
            
        }
        
        return output;
        
    }
	
}
