class Solution {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        int index = 0;
        for(int num : nums) {
            if(num == 0) countZero++;
            else nums[index++] = num;
        }

        for(int i = 0; i < countZero; i++) {
            nums[index++] = 0;
        }
    }
}