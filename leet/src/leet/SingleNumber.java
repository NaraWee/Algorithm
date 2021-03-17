package leet;

public class SingleNumber {

	public static void main(String[] args) {

		// https://leetcode.com/problems/single-number/
		
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));

	}
	
	public static int singleNumber(int[] nums) {
		
		int result = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			int cnt = 0;
			
			for(int j = 0; j < nums.length; j++) {	
				
				if(nums[i] == nums[j]) {			
					cnt++;		
				}
				
			}
			
			if(cnt == 1) {
				result = nums[i];
			}
			
		}
        
        return result;
		
	}

}
