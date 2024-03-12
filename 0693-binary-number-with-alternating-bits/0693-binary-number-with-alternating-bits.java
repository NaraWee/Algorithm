class Solution {
    public boolean hasAlternatingBits(int n) {
        
        List<Integer> binaryList = new ArrayList<>();
        while(n != 0) {
            binaryList.add(n%2);
            n /= 2;
        }
        
        for(int i = 0; i < binaryList.size()-1; i++) {
            if(binaryList.get(i) == binaryList.get(i+1)) {
                return false;
            }
        }
        
        return true;
    }
}