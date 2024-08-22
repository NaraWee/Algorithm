class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        answer.add(new ArrayList<>(list));

        getSubset(answer, list, nums, 0);
        
        return answer;
    }

    public void getSubset(List<List<Integer>> answer, List<Integer> list, int[] nums, int index) {

        if(index >= nums.length) {
            return;
        }

        for(int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            answer.add(new ArrayList<>(list));
            getSubset(answer, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }
}