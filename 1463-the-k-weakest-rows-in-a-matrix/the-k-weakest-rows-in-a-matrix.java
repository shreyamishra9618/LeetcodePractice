class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[] indexes = new int[k];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->{
            if(a[0]== b[0]) {
               return b[1] - a[1];
            }
            else{
              return  b[0] - a[0];
            }
        });
        for(int i =0; i <m; i++){
            int maxOnes = binarySearch(mat[i]);
            int[] pair = new int[] {maxOnes,i};
            maxHeap.add(pair);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        for(int j =k -1; j >=0; j--){
            int[] entry = maxHeap.poll();
            indexes[j] = entry[1];
        }
        return indexes;
    }

    public int binarySearch(int[] row){
        int low =0;
        int high = row.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(row[mid] == 1){
                low = mid +1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}