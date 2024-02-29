class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int answer = 0;
        for(int i = 0; i < tickets.length; i++) {
            if(tickets[k] > tickets[i]) {
                answer += tickets[i];
            } else {
                if(k >= i) {
                    answer += tickets[k];
                } else {
                    answer += tickets[k]-1;
                }
            }
        }

        return answer;
    }
}