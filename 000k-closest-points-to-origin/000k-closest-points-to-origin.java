class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->dist(b)- dist(a));
        for(int[] point : points){
            maxHeap.add(point);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int i =0;
        int[][] res = new int[k][2];
        while(maxHeap.isEmpty() == false){
            res[i++] = maxHeap.poll();
        }

       return res; 
    }
    public int dist(int[] point){
        int x = point[0];
        int y = point[1];
        return x*x + y*y;
    }
}