class Solution {
    public int minPairSum(int[] nums) {
        List<Integer> sumList = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length/2; i++) {
            sumList.add(nums[i]+nums[nums.length-i-1]);
        }

        Collections.sort(sumList, Collections.reverseOrder());

        return sumList.get(0);
    }
}