class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)-> b - a);
        for(int num : stones){
            minHeap.add(num);}

            while(minHeap.size()>1){
                int stone1 = minHeap.poll();
                int stone2 = minHeap.poll();
                if(stone1 != stone2){
                    minHeap.add(stone1 - stone2);
                }
            }
              return minHeap.isEmpty() ? 0 : minHeap.remove(); 
        }
        
    }
