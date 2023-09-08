class Solution {
    public String reverseWords(String s) {
     String[] words = s.trim().split("\\s+");
     int len = words.length;

        // Iterate over the words and do something with each word
        int low = 0;
        int high =len -1;
        while(low < high){
            int mid = low + (high -low)/2;
            String temp = words[low];
            words[low] = words[high];
            words[high] = temp;
            low++;
            high--;
        }

        for (int i = 0; i < words.length; i++) {
    System.out.print(words[i]);
}

String concatenatedString = String.join(" ", words);

return concatenatedString;

    }
}