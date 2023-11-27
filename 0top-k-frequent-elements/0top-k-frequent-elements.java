class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if( k == nums.length) return nums;
        int[] top = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->map.get(a) - map.get(b));
        for(int key : map.keySet()){
            minHeap.add(key);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        for(int i = k-1; i >=0; i--){
            top[i] = minHeap.poll();
        }
        return top;
    }
}