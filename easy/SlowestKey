class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        int max = releaseTimes[0];
        char[] keys = keysPressed.toCharArray();
        char output = 'a';
        
        for(int i = 1; i < releaseTimes.length; i++) {
            
            if(releaseTimes[i] - releaseTimes[i-1] >= max) {    // max값 찾기
                
                if(releaseTimes[i] - releaseTimes[i-1] == max) {    // max값과 같을 떼
                    
                    output = (keys[i] > output) ? keys[i] : output; // 더 큰 알파벳 반환
                    
                } else {
                    output = keys[i];
                }
                
                max = releaseTimes[i] - releaseTimes[i-1];
                
            }
            
        }
        
        return output;
        
    }
}
