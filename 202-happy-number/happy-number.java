class Solution {
    // Floyd's Cycle-Finding Algorithm
    public boolean isHappy(int n) {
        int slow =n;
        int fast = n;
        do{
            slow =compute(slow);
            fast =compute(compute(fast));
            if(fast == 1) return true;
        }
        while(slow != fast);
            return false;
         
    }

    public int compute(int n){
        int sum =0;
        while(n != 0){
            sum += (n%10)*(n%10);
            n= n/10;
        }
        return sum;
    }
}