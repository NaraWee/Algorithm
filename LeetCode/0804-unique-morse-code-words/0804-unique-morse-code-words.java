class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();
        for(String word : words) {
            String MorseRepresentation = "";
            for(int i = 0; i < word.length(); i++) {
                MorseRepresentation += alphabet[word.charAt(i)-97];
            }
            set.add(MorseRepresentation);
        }

        return set.size();
        
    }
}