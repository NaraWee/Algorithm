class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        int[] array = new int[2];
        
        for(int i = 1; i < n; i++) {
            if(checkNonZero(i) && checkNonZero(n-i)) {
                array[0] = i;
                array[1] = n-i;
                break;
            }
        }
        
        return array;
        
    }
    
    public boolean checkNonZero(int i) {
        while(i > 0) {
            if(i % 10 == 0) {
                return false;
            }
            i /= 10;
        }
        
        return true;
    }
}