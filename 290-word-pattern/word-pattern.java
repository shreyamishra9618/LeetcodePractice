class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        for(int i =0; i < pattern.length(); i++){
            boolean containsKey = map.containsKey(pattern.charAt(i));
         if(map.containsValue(words[i]) && !containsKey) return false;
         if(containsKey && !map.get(pattern.charAt(i)).equals(words[i]))return false;
         else map.put(pattern.charAt(i), words[i]);
          
           
        }
        
      
       return true;
    }
}