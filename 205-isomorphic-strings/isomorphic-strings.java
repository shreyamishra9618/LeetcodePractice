class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        if(s.length()==1 || s.length() == 0){
            return true;
        }
       int [] mapS = new int[256];
        int [] mapT = new int[256];

        for(int i =0; i< s.length(); i++)
           {
            if(mapS[s.charAt(i)]!=mapT[t.charAt(i)])
                return false;

            mapS[s.charAt(i)]=i+1;

            mapT[t.charAt(i)]=i+1;
        }
       
        return true;
    }
}