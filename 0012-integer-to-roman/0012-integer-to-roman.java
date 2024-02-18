class Solution {
    public String intToRoman(int num) {
        String answer = "";
        int mok = 0;
        
        // step1. M
        mok = num/1000;
        num %= 1000;
        for(int i = 0; i < mok; i++) answer += "M";
        
        // step2. C
        mok = num/100;
        if(mok == 9) {
            num %= 100;
            answer += "CM";
        } else if(mok == 4) {
            num %= 100;
            answer += "CD";
        } else if(mok >= 5) {
            num %= 100;
            answer += "D";
            for(int i = 0; i < mok-5; i++) answer += "C";
        } else {
            num %= 100;
            for(int i =0; i < mok; i++) answer += "C";
        }
        
        // step3. X
        mok = num/10;
        if(mok == 9) {
            num %= 10;
            answer += "XC";
        } else if(mok == 4) {
            num %= 10;
            answer += "XL";
        } else if(mok >= 5) {
            num %= 10;
            answer += "L";
            for(int i = 0; i < mok-5; i++) answer += "X";
        } else {
            num %= 10;
            for(int i =0; i < mok; i++) answer += "X";
        }
        
        // step4. I
        if(num == 9) {
            answer += "IX";
        } else if(num == 4) {
            answer += "IV";
        } else if(num >= 5) {
            answer += "V";
            for(int i = 0; i < num-5; i++) answer += "I";
        } else {
            for(int i = 0; i < num; i++) answer += "I";
        }
        
        return answer;
    }
}