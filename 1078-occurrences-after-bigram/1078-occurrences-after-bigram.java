class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        
        List<String> answer = new ArrayList<>();

        String[] textArray = text.split(" ");

        for(int i = 0; i < textArray.length-2; i++) {
            if(textArray[i].equals(first) && textArray[i+1].equals(second)) {
                answer.add(textArray[i+2]);
            }
        }
        
        return answer.toArray(new String[0]);
    }
}