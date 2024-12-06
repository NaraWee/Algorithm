class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> bannedSet = new HashSet<>();
        for(int bannedVal : banned) {
            if(bannedVal > n) continue;
            bannedSet.add(bannedVal);
        }

        int sum = 0;
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(!bannedSet.contains(i) && sum+i <= maxSum) {
                sum += i;
                cnt++;
            }
        }
        
        return cnt;
    }
}