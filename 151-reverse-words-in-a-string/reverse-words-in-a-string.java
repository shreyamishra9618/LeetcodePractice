class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int len = words.length;
        int low =0;
        int high = len -1;
        while(low < high){
            String temp = words[low];
            words[low] = words[high];
            words[high] = temp;
            low++;
            high--;
        }
        String ans = String.join(" ", words);
        return ans;
        
    }
}