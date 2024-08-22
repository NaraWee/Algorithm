class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int student : students) queue.offer(student);
        
        for(int sandwiche : sandwiches) {
            for(int i = 0; i < queue.size(); i++) {
                if(sandwiche == queue.peek()) {
                    queue.poll();
                    sandwiche = -1;
                    break;
                } else {
                    queue.add(queue.poll());
                }
            }
            if(sandwiche != -1) break;
        }
        
        return queue.size();
    }
}