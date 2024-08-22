class Solution {
    public boolean judgeSquareSum(int c) {
        
        for(int a = 0; a*a <= c/2; a++) {
            
            double sqrt = Math.sqrt(c - a*a);   // 제곱근 구하기
            int b = (int) sqrt;                 // int형으로 바꾸기
            
            if(b == sqrt) {                     // 제곱근의 값이 정수일 때
                return true;
            }
            
        }
        
        return false;
        
    }
}
