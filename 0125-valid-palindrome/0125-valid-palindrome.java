class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        
        int len = s.length();
        for(int i = 0 , j = len-1 ; i<=len/2 && j>=len/2 ; i++ , j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            
        }
        return true;
    }
}