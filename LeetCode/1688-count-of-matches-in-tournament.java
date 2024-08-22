class Solution {
    public int numberOfMatches(int n) {
        
        int output = 0;
        
        while(true) {
            
            if(n == 1) {
                break;
            } else {
                
                if(n % 2 == 0) {
                    output += n / 2;
                    n /= 2;
                } else {
                    output += n / 2;
                    n = n / 2 + 1;
                }
                
            }
            
        }
        
        return output;
        
    }
}
