class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        // internationalization --> word --length=> 20
        // i12iz4n--->abbr ---length=> 7
        int i=0, j=0;
        while(i < word.length() && j < abbr.length()){
            if(word.charAt(i)==abbr.charAt(j)){
                ++i;
                ++j;
                continue;
            }
            if(abbr.charAt(j) <='0' || abbr.charAt(j) > '9'){
                return false;
            }
            int start =j;
            while(j < abbr.length() && abbr.charAt(j)>='0' && abbr.charAt(j) <= '9'){
                ++j;
            }
            int num = Integer.valueOf(abbr.substring(start,j));
            i += num;
        }
       return i == word.length() && j == abbr.length();
    }
}