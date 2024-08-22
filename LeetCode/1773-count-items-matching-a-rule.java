class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int output = 0;
        
        if(ruleKey.equals("type")) {
            
            for(int i = 0; i < items.size(); i++) {
                
                if(ruleValue.equals(items.get(i).get(0))) {
                    output += 1;
                }
                
            }
            
        } else if(ruleKey.equals("color")) {
            
            for(int i = 0; i < items.size(); i++) {
                
                if(ruleValue.equals(items.get(i).get(1))) {
                    output += 1;
                }
                
            }
            
        } else {
            
            for(int i = 0; i < items.size(); i++) {
                
                if(ruleValue.equals(items.get(i).get(2))) {
                    output += 1;
                }
                
            }
            
        }
        
        return output;
        
    }
}
