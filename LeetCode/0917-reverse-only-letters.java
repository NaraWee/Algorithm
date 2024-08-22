class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] text = s.toCharArray();
        ArrayList<Character> output = new ArrayList<>();
        
        for(int i = text.length-1; i >= 0; i--) {
            
            if(text[i] >= 'a' && text[i] <= 'z' || text[i] >= 'A' && text[i] <= 'Z') {
                
                output.add(text[i]);
                
            } else {
                output.add(i,text[i]);
            }
            
        }
        
        String result = "";
        
        for(int i = 0; i < output.size(); i++) {
            
            result += output.get(i);
            
        }
        
        return result;
        
    }
}
