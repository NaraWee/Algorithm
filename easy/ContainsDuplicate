class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);  // 배열 정렬
        
        for(int i = 1; i < nums.length; i++) {
            
            if(nums[i-1] == nums[i]) {  // 정렬된 배열 중 같은 숫자가 연속되면 true를 반환
                return true;
            }
            
        }
        
        return false;
        
    }
}
