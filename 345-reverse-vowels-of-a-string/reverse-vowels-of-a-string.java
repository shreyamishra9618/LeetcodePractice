class Solution {
    public String reverseVowels(String s) {
      char[] strs = s.toCharArray();
      int left =0;
      int right = s.length()-1;
      while(left < right){
          while(left < right && !isVowel(strs[left])){
              left++;
          }
           while(left < right && !isVowel(strs[right])){
              right--;
          }
          if(left < right){
              char temp = strs[left];
              strs[left] = strs[right];
              strs[right] = temp;
              left++;
              right--;
          }
      }
      return new String(strs);
    }
    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}