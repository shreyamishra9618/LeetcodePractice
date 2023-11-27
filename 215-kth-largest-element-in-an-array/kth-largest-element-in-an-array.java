class Solution {
    public int findKthLargest(int[] nums, int k) {
			PriorityQueue<Integer> minHeap = new PriorityQueue<>();
			int size = 0;
for(int i = 0; i < k; i++){
	minHeap.add(nums[i]);
}

			for(int i=k; i < nums.length; i++){
					minHeap.add(nums[i]);
					minHeap.remove();
			}
		
			return minHeap.peek();
        
    }
}