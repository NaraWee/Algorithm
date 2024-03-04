class Solution {
    public int calPoints(String[] operations) {
        int answer = 0;

        List<Integer> record = new ArrayList<>();

        for(int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "C" : record.remove(record.size()-1); break;
                case "D" : record.add(record.get(record.size()-1) * 2); break;
                case "+" : record.add(record.get(record.size()-1) + record.get(record.size()-2)); break;
                default : record.add(Integer.parseInt(operations[i])); break;
            }
        }
        
        for(Integer i : record) {
            answer += i;
        }
        
        return answer;
    }
}