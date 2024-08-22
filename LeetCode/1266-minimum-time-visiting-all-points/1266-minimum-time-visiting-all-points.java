class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int count = 0;
        
        for(int i = 0; i < points.length-1; i++) {
            int h = Math.abs(points[i][0] - points[i+1][0]);
            int v = Math.abs(points[i][1] - points[i+1][1]);
            
            if(h > v) {
                count += h;
            } else {
                count += v;
            }
        }
        
        return count;
    }
}