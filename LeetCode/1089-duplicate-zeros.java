class Solution {
    public void duplicateZeros(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap();
        
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            
            if(arr[i] != 0) {
                map.put(index, arr[i]);
                index++;
            } else {
                map.put(index, 0);
                map.put(index+1, 0);
                index += 2;
            }
            
            if(index >= arr.length) {
                break;
            }
            
        }
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(i);
        }
        
    }
}
