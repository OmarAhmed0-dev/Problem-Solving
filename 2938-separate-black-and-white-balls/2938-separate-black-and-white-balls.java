class Solution {
    public long minimumSteps(String s) {
       long zeros = 0;
       long steps = 0;
       //char [] chars = s.toCharArray();
       /*
       for(int i = 1 ; i < s.length() ; i++) {
            if(chars[i] == '0' && chars[i-1] == '1') {
                
                count ++ ;
            }        
       }
       */
       for(int i = s.length() -1 ; i >=0; i-- )
       {
            if(s.charAt(i) == '0') {
                zeros ++;
            }
            else{
                steps += zeros;
            }
       }
       return steps;
        
    }
    /*
    public void swap(char x1 , char x2) {
        char temp = x1; 
        x1 = x2 ; 
        x2 = temp;
    }
*/
    

}