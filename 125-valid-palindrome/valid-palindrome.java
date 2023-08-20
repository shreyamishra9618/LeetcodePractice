class Solution {
    public boolean isPalindrome(String s) {
        int first =0;
        int last = s.length() - 1;
        if (s.isEmpty()) return true;
        while(first <= last){
            char charF = s.charAt(first);
            char charL = s.charAt(last);
            if(!Character.isLetterOrDigit(charF)){
                first++;
            }
            else if(!Character.isLetterOrDigit(charL)){
                last--;
            }
            else {
                if (Character.toLowerCase(charF) != Character.toLowerCase(charL)){
               return false;}
            first++;
            last--; 
            }
            
         
        }
       return true; 
    }
}