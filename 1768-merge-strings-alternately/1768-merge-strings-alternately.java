class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String answer = "";
        
        int index = 0;
        while(true) {
            if(index >= word1.length() && index >= word2.length()) {
                break;
            }
            if(index < word1.length()) {
                answer += word1.charAt(index);
            }
            if(index < word2.length()) {
                answer += word2.charAt(index);
            }
            index++;
        }
        return answer;
    }
}