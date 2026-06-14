class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len = word1.length() + word2.length();
        char []result = new char[len];
        int i =0;
        int index = 0;
        while (i < word1.length() || i < word2.length()) {
          
            if(i < word1.length()) {
                result[index] = word1.charAt(i);
                index++;
            }
            if(i < word2.length()) {
                result[index] = word2.charAt(i);
                index++;
            } 
            i++;   
          
        }
        return String.copyValueOf(result);

    }
}