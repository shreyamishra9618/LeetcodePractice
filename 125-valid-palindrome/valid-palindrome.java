class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while(left < right){
            char charF = s.charAt(left);
            char charL = s.charAt(right);
            if(!Character.isLetterOrDigit(charF)){
                left++;
            }
            else if(!Character.isLetterOrDigit(charL)){
                right--;
            }else{
                if(Character.toLowerCase(charF)!= Character.toLowerCase(charL)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}