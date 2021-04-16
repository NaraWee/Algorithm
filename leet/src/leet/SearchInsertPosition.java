package leetCode;

public class SearchInsertPosition {

	public static void main(String[] args) {

		// https://leetcode.com/problems/search-insert-position/
		
		int[] nums = {1,3,5,6};
		int target = 5;
		
		SearchInsertPosition insert = new SearchInsertPosition();
		
		System.out.println(insert.searchInsert(nums, target));

	}

	public int searchInsert(int[] nums, int target) {
		 
		int output = 0;;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] == target) {
				output = i;
				break;
			} else if(target > nums[i]) {
				output = i + 1;
			} else {
				break;
			}
			
		}
		
		return output;
    }
	
}
