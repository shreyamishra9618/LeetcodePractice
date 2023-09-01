class Solution {
    public int divide(int dividend, int divisor) {
        // in case of overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow condition
        }
        
        boolean sign = (dividend >= 0 ) == (divisor >= 0) ? true : false;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result =0;
        while(dividend - divisor >= 0){
            int count =0;
            while(dividend - (divisor << 1 << count) >= 0){
                count++;
            }
            result += 1 << count;
            dividend -= divisor << count;
        }
          return sign ? result : - result;
    }
}