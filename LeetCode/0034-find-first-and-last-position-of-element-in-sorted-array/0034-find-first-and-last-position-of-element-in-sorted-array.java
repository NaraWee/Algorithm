class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] answer = new int[2];
        answer[0] = -1;
        answer[1] = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                answer[0] = i;
                answer[1] = i;
                break;
            }
        }
        
        if(answer[0] != -1) {
            for(int i = answer[0]+1; i < nums.length; i++) {
                if(nums[i] == target) {
                    answer[1] = i;
                }
            }
        }
        
        return answer;
        
    }
}