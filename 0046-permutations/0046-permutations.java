class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        getNumList(answer, list, nums);
        
        return answer;
        
    }
    
    public void getNumList(List<List<Integer>> answer, List<Integer> list, int[] nums) {
        
        if(list.size() == nums.length) {
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
                getNumList(answer, list, nums);
                list.remove(list.size()-1);
            }
        }
        
    }
}