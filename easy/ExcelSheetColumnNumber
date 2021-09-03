class Solution {
    public int titleToNumber(String columnTitle) {
        
        int output = 0;
        
        for(int i = columnTitle.length()-1; i >= 0; i--) {
            
            if(i != 0) {
                output += Math.pow(26,i) * (columnTitle.charAt(columnTitle.length()-i-1) - 64);
            } else {
                output += columnTitle.charAt(columnTitle.length()-i-1) - 64;
            }
        }
        
        return output;
        
    }
}
