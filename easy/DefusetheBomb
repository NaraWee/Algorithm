class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] output = new int[code.length];
        int temp = 0;
        
        for(int i = 0; i < code.length; i++) {
            
            int sum = 0;
            
            if(k >= 0) {    // k가 양수일 때
            
                for(int j = 0; j < k; j++) {
                
                    if((i+1)+j >= code.length) {
                        temp = (i+1) + j - code.length;
                    } else {
                        temp = (i+1) + j;
                    }
                
                    sum += code[temp];
                
                }
                
            } else {    // k가 음수일 때
                
                for(int j = 0; j > k; j--) {
                
                    if((i-1)+j < 0) {
                        temp = (i-1) + j + code.length;
                    } else {
                        temp = (i-1) + j;
                    }
                
                    sum += code[temp];
                
                }
                
            }
            
            output[i] = sum;
            
        }
        
        return output;
        
    }
}
