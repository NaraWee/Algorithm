class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        char[] arr = new char[s.length()];  // 배열 생성
        
        // string 값을 배열에 넣기
        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        
        // 알파벳 배열 생성
        int[] cnt = new int[26];
        
        // 해당 알파벳 배열 cnt++ 해주기
        for(int i = 0; i < arr.length; i++) {
            
            cnt[arr[i] - 97]++;
            
        }
        
        int temp = arr[0] - 97;
        boolean b = true;
        
        for(int i = 0; i < cnt.length; i++) {
            
            if(cnt[i] != 0) {
                // 알파벳 개수 같은지 확인
                if(cnt[temp] != cnt[i]) {
                    b = false;
                }
                
            }
            
        }
        
        return b;
    }
        
}
