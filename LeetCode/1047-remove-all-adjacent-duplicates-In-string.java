class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<Character>();
        
        for(int i=0; i < s.length(); i++){
        
            if(!st.empty() && st.peek() == s.charAt(i)){
            
                st.pop();
            
            } else{
                
                st.push(s.charAt(i));
            
            }
            
        }
        
        String output="";
        
        while(!st.empty()){
            output = st.pop() + output;
        }
        
        return output;
    }
}
