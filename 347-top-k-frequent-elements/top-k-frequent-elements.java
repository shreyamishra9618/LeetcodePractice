class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int[] topK = new int[k];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->map.get(a) - map.get(b));

        for(int key : map.keySet()){
            minHeap.add(key);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        for(int j = k -1; j >=0; j--){
            topK[j] = minHeap.poll();
        }
        return topK;
    }
}