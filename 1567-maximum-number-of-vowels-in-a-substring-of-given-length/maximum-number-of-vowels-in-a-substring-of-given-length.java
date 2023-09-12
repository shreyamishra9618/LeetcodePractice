class Solution {
    public int maxVowels(String s, int k) {
        int left =0;
        int right =k;
        int max =0, sum =0;
        for(int i =0; i < k; i++){
            if(isVowel(s.charAt(i))){
                sum++;
            }
        }
        max =sum;
        while(right < s.length()){
           if(isVowel(s.charAt(left))){
                sum--;
            }
             if(isVowel(s.charAt(right))){
                sum++;
            }
            max = Math.max(max, sum);
            left++;
            right++;

        }
       return max; 
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}