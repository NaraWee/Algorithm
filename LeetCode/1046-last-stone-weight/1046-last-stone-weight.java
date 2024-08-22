class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            queue.add(stone);
        }

        int x = 0;
        int y = 0;
        while(queue.size() > 1) {
            y = queue.poll();
            x = queue.poll();
            if(y - x > 0) {
                queue.offer(y - x);
            }
        }
        
        return queue.isEmpty() ? 0 : queue.peek();
    }
}