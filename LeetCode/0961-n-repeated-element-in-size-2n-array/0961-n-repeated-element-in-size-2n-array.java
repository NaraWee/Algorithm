class Solution {
    public int repeatedNTimes(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(Integer key : map.keySet()) {
            if(map.get(key) == n) {
                answer = key;
            }
        }

        return answer;
    }
}