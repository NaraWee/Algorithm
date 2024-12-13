class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            Set<Integer> set1 = new HashSet<>();
            for(int j = 0; j <= i; j++) {
                set1.add(nums[j]);
            }

            Set<Integer> set2 = new HashSet<>();
            for(int j = i+1; j < nums.length; j++) {
                set2.add(nums[j]);
            }
            result[i] = set1.size() - set2.size();
        }
        
        return result;
    }
}