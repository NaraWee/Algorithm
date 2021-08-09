class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> output = new ArrayList<>();
        int max = 0;
        
        for(int i = 0; i < candies.length; i++) {
            
            if(candies[i] > max) {    // candies 배열 중 가장 큰 수 구하기
                max = candies[i];
            }
            
        }
        
        for(int i = 0; i < candies.length; i++) {
            
            if(candies[i] + extraCandies >= max) {
                output.add(true);
            } else {
                output.add(false);
            }
            
        }
        
        return output;
        
    }
}
