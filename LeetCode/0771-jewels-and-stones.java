class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        String[] je = jewels.split("");
        String[] st = stones.split("");
        int output = 0;
        
        for(int i = 0; i < je.length; i++) {
            
            for(int j = 0; j < st.length; j++) {
                
                if(st[j].equals(je[i])) {
                    output++;
                }
                
            }
            
        }
        
        return output;
        
    }
}
