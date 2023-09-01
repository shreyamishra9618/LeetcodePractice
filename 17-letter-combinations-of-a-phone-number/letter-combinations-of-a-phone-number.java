class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        String[] mapping = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.isEmpty()) return ans;
        ans.add("");
        for(int i =0; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            System.out.print("i - ");
            System.out.println(i);
            while(ans.peek().length() == i){
               String t = ans.remove();
               System.out.print("t - ");
               System.out.println(t);
               for(char s : mapping[x].toCharArray()){
                System.out.print("t + s - ");
                 System.out.println(t + s);
                   ans.add(t + s);
               }
            }
        }
        return ans;
    }
}