class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int gcd = gcdfind(str1.length(), str2.length());
        return str1.substring(0, gcd);
        
    }

    public int gcdfind(int x, int y){
        if(y == 0) return x;
        else{
          return  gcdfind(y, x %y);
        }
    }
}