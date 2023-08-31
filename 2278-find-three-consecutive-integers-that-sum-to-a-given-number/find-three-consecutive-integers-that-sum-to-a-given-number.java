class Solution {
    public long[] sumOfThree(long num) {
        long[] res = new long[3];
        if( num % 3 != 0)  return new long[]{};
        else{
             long mid = num/3;
        res[0] = mid -1;
        res[1] = mid;
        res[2] = mid +1;
        
        }
       
        
      return res;  
        
    }
}