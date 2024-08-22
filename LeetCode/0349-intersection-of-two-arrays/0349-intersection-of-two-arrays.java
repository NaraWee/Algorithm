class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> answer = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                answer.add(nums2[i]);
            }
        }

        int[] result = new int[answer.size()];
        int index = 0;
        for(Integer i : answer) {
            result[index] = i;
            index++;
        }

        return result;
    }
}