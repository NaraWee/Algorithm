class Solution {
    public String reversePrefix(String word, char ch) {
        String answer = "";
        
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                for(int j = i; j >= 0; j--) {
                    answer += word.charAt(j);
                }
                if(i != word.length()-1) {
                    answer += word.substring(i+1);
                }
                break;
            }
        }
        
        return answer.equals("") ? word : answer;
    }
}