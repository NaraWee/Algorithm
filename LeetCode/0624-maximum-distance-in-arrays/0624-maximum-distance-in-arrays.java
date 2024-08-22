class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int answer = 0;
        int minnum = arrays.get(0).get(0);
        int maxnum = arrays.get(0).get(arrays.get(0).size()-1);

        for(int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);   
            int a = Math.abs(maxnum - array.get(0));
            int b = Math.abs(minnum - array.get(array.size()-1));
            answer = Math.max(answer, Math.max(a, b));
            minnum = Math.min(minnum, array.get(0));
            maxnum = Math.max(maxnum, array.get(array.size()-1));
        }
        
        return answer;
    }
}