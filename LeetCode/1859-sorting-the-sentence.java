class Solution {
    public String sortSentence(String s) {
        
        String[] arr = s.split(" ");
        String[] output = new String[arr.length];
        
        for(int i = 1; i <= arr.length; i++) {
            
            for(int j = 0; j < arr.length; j++) {
                
                if(Character.forDigit(i, 16) == arr[j].charAt(arr[j].length()-1)) {
                    output[i-1] = arr[j].substring(0,arr[j].length()-1);
                    break;
                }
                
            }
            
        }
        
        String result = String.join(" ",output);
        
        return result;
        
    }
}
