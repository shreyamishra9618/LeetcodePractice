class Solution {
    public int countSubstrings(String s) {
        int result =0;
        if (s.length() < 2) {
            return s.length();
        }
        for(int i =0; i < s.length(); i++){
            int left =i;
            int right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                
                    right++;
                    left--;
                    result++;
                }

             left =i;
             right = i +1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                
                    right++;
                    left--;
                    result++;
                }
             
        }
        return result;
    }
}