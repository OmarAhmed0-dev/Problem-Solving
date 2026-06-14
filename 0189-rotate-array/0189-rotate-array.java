class Solution {
    public void rotate(int[] nums, int k) {
    
      
        int [] temp = new int [nums.length];
        int size = nums.length;
        int index = 0;
        k = k%size;

        for(int i = size-k; i<size ; i++)
        {
           
            temp[index] = nums[i];
            index++;
        }
     
        for(int i = 0 ; i <size-k && index < size ; i++ )
        {
 
            temp[index] = nums[i];
            index++;
           
        }
        for(int i =0 ;i<size ;i++)
        {
            nums[i] = temp[i];
        }
    }
}