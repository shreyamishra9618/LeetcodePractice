class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for( int candi : candies){
            maxCandies = Math.max(candi, maxCandies);

        }

        for( int candi : candies){
            result.add(candi + extraCandies >= maxCandies);
        }
        return result;
    }
}