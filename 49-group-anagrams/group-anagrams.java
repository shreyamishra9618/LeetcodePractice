class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        int[] hash = new int[26];
        for(String word : strs){
            Arrays.fill(hash,0);
            for(char ch : word.toCharArray()){
                hash[ch - 'a']++;
            }
        

        StringBuilder sbs = new StringBuilder();
        for(int i =0; i < 26; i++){
            sbs.append('#');
            sbs.append(hash[i]);
        }
        String key = sbs.toString();
       if(!map.containsKey(key)){
           map.put(key, new ArrayList<>());
       }
       map.get(key).add(word);
       
        }
       return new ArrayList<>(map.values());
    }
}