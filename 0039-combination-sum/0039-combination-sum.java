class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        int sum = 0;

        calculate(candidates, answer, integers, target, sum, 0);

        return answer;

    }

    public int calculate(int[] candidates, List<List<Integer>> answer, List<Integer> integers, int target, int sum, int index) {

        if(sum == target) {
            answer.add(new ArrayList<>(integers));
            return sum;
        }

        for(int i = index; i < candidates.length; i++) {

            if(sum + candidates[i] > target) {
                break;
            }

            sum += candidates[i];
            integers.add(candidates[i]);

            sum = calculate(candidates, answer, integers, target, sum, i);
            sum -= integers.get(integers.size()-1);
            integers.remove(integers.size()-1);
        }

        return sum;
    }
}