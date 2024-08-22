class Solution {
    public String removeStars(String s) {
        
        Queue<String> sQueue = new LinkedList<>();
        Stack<String> newStack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            sQueue.add(String.valueOf(s.charAt(i)));
        }

        while(!sQueue.isEmpty()) {
            if(sQueue.peek().equals("*")) {
                sQueue.poll();
                if(!newStack.isEmpty()) {
                    newStack.pop();
                }
            } else {
                newStack.push(sQueue.poll());
            }
        }

        String answer = "";
        while(!newStack.isEmpty()) {
            answer = newStack.pop() + answer;
        }

        return answer;
    }
}