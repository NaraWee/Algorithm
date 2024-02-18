class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        
        int sum = 0;
        for(int i = nums.length-1; i >= 0; i--) {
            sum += nums[i];
            list.add(nums[i]);
            total -= nums[i];
            if(sum > total) break;
        }
        
        return list;
    }
}