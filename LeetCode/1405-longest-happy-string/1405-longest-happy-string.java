class Solution {
    public String longestDiverseString(int a, int b, int c) {
        String result = "";

        int total = a + b + c;
        int aLen = 0;
        int bLen = 0;
        int cLen = 0;

        for(int i = 0; i < total; i++) {
            if(a >= b && a >= c && aLen != 2 || (bLen == 2 || cLen == 2) && a > 0) {
                result += "a";
                a--;
                aLen++;
                bLen = 0;
                cLen = 0;
            } else if(b >= a && b >= c && bLen != 2 || (cLen == 2 || aLen == 2) && b > 0) {
                result += "b";
                b--;
                bLen++;
                aLen = 0;
                cLen = 0;
            } else if(c >= a && c >= b && cLen != 2 || (aLen == 2 || bLen == 2) && c > 0) {
                result += "c";
                c--;
                cLen++;
                aLen = 0;
                bLen = 0;
            }
        }
        
        return result;
    }
}