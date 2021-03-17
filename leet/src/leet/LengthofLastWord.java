package leet;

public class LengthofLastWord {

	public static void main(String[] args) {
		
		// https://leetcode.com/problems/length-of-last-word/

		String s = "Hello World ";
		LengthofLastWord le = new LengthofLastWord();
		System.out.println(le.lengthOfLastWord(s));

	}
	
	public int lengthOfLastWord(String s) {
		
		int num = 0;
        int num1 = 0;
        
        for(int i = s.length() - 1; i >= 0; i--) {
            
            if(s.charAt(i) != ' ') {
                num = i;
                break;
                
            }
            
        }
        
        for(int i = num; i >= 0; i--) {
            
            if(s.charAt(i) != ' ') {
                
                num1++;
                    
            } else if(s.charAt(i) == ' ') {
                break;
            }
        }
        
        return num1;
        
	}


}
