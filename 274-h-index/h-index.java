class Solution {
    public int hIndex(int[] citations) {
        int count =0;
        int len = citations.length;
        Arrays.sort(citations);
        while(count < citations.length && citations[len -1 - count] > count){
           count++;
        }
        return count;
    }
}