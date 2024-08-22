class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int crashTime = 0;

        boolean flag = true;

        while(flag) {
            crashTime++;
            if(memory1 >= memory2 && memory1 >= crashTime) {
                memory1 -= crashTime;
            } else if( memory2 > memory1 && memory2 >= crashTime) {
                memory2 -= crashTime;
            } else {
                flag = false;
            }
        }

        int[] answer = {crashTime, memory1, memory2};

        return answer;
    }
}