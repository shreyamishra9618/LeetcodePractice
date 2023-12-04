class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i < heights.length -1; i++){
            int climb = heights[i+1] - heights[i];
            if(climb <= 0){
                continue;
            }
            minHeap.add(climb);
            if(minHeap.size() <= ladders){
                continue;
            }
            bricks -= minHeap.remove();
            if(bricks < 0){
                return i;
            }

        }
        return heights.length -1;
        
    }
}