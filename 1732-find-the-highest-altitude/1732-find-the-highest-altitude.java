class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] array = new int[gain.length+1];
        array[0] = 0;
        
        for(int i = 0; i < gain.length; i++) {
            array[i+1] = array[i] + gain[i];
        }
        
        Arrays.sort(array);
        
        return array[gain.length];
    }
}