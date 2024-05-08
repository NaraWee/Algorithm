class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] array = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            array[i] = score[i];
        }
        Arrays.sort(array);

        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            if(i == array.length-1) {
                map.put(array[i], "Gold Medal");
            } else if(i == array.length-2) {
                map.put(array[i], "Silver Medal");
            } else if(i == array.length-3) {
                map.put(array[i], "Bronze Medal");
            } else {
                map.put(array[i], String.valueOf(array.length-i));
            }
        }

        String[] answer = new String[score.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = map.get(score[i]);
        }

        return answer;
    }
}