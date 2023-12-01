class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> a- b );
        int cost =0;
        for(int stick : sticks){
            pq.add(stick);
        }
        while(pq.size()>1){
                int stick1 = pq.poll();
                int stick2 = pq.poll();
                int sum = stick1 + stick2;
                cost += sum;
                pq.add(sum);
            }
      
           
        
       return cost; 
    }
}