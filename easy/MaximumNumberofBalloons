class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int output = 0;
        
        char[] word = text.toCharArray();
        
        for(int i = 0; i < word.length; i++) {
            
            if(word[i] == 'b') {
                b++;
            } else if(word[i] == 'a') {
                a++;
            } else if(word[i] == 'l') {
                l++;
            } else if(word[i] == 'o') {
                o++;
            } else if(word[i] == 'n') {
                n++;
            }
            
        }
        
        while(b != 0 && a != 0 && l > 1 && o > 1 && n != 0) {
            output++;
            b--;
            a--;
            l -= 2;
            o -= 2;
            n--;
        }
        
        return output;
        
    }
}
