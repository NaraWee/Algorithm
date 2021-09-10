class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        char[] result = s.toCharArray();
        int[] sum = new int[shifts.length]; // 인덱스 별 shifts의 합계를 담을 배열
        sum[shifts.length-1] = shifts[shifts.length-1] % 26;

        for(int i = shifts.length-2; i >= 0; i--) {
            sum[i] = (sum[i+1] + shifts[i]) % 26;   // 각 인덱스 별 shifts의 합(알파벳 26개이므로 합계 % 26 값으로 구하기)
        }

        for(int i = 0; i < result.length; i++) {    // 결과값 담기

            result[i] += sum[i];
            
            if(result[i] > 'z') {   // 'z'이상일 때 -26을 통해 a부터 시작할 수 있도록 함
                result[i] -= 26;
            }

        }
        
        return String.valueOf(result);
        
    }
}
