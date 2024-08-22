class Solution {
    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        int answer = 0;
        
        for(int i = array.length-1; i >= 0; i--) {
            if(array[i] == null || array[i].equals("")) {
                continue;
            }
            answer = array[i].length();
            break;
        }
        return answer;
    }
}
