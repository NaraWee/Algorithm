class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int l = 0;  // 결과 배열의 사이즈를 구할 매개변수
        
        for(int i = 0; i < nums.length / 2; i++) {
            
            l += nums[2*i];
            
        }
        
        int[] output = new int[l];
        int index = 0;      // output배열의 index값
        
        for(int i = 0; i < nums.length / 2; i++) {
            
            int freq = 0;
            
            while(nums[2*i] != freq) {  // nums[2*i] 값의 빈도수 만큼 nums[2*i+1]값을 저장
                
                output[index] = nums[2*i+1];
                index++;
                freq++;
                
            }
            
        }
     
        
        return output;
    
    }
}
