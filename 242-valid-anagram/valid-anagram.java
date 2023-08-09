class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sp = new char[26];
       
        for(char ch : s.toCharArray()){
            sp[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            sp[ch - 'a']--;
        }

        for(int i =0; i < 26; i++){
            if(sp[i] != 0){
                return false;
            }
           
        }
        return true;
    }
}