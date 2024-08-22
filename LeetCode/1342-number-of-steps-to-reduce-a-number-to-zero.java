class Solution {
    public int numberOfSteps(int num) {
        
        int output = 0;
        
        while(true) {
            
            if(num == 0) {
              break;  
            } else if(num % 2 == 0) {
                num /= 2;
                output++;
            } else {
                num -= 1;
                output++;
            }
            
        }
        
        return output;
        
    }
}
