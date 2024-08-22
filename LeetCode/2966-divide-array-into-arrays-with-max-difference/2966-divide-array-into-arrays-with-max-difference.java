class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] answer = new int[nums.length/3][3];

        Arrays.sort(nums);
        int index = 0;

        for(int i = 0; i < nums.length; i=i+3) {
            if(nums[i+2] - nums[i] > k) {
                return new int[0][0];
            }
            answer[index][0] = nums[i];
            answer[index][1] = nums[i+1];
            answer[index][2] = nums[i+2];
            index++;
        }
        
        return answer;
    }
}