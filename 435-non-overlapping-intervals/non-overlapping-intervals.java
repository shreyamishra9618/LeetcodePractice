class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0 || intervals[0].length == 0){
            return 0;
        }
        int count = 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int[] prev = intervals[0];
        for(int i =1; i < intervals.length; i++){
            if(prev[1] > intervals[i][0]){
               count++;
            
            if(prev[1] > intervals[i][1]){
                prev = intervals[i];
            }
            }
            else{
                prev = intervals[i];
            }
        }
        return count;
    }
}