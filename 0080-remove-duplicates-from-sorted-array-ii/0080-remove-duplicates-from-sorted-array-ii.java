class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        HashMap<Integer,Integer> haveSeenCount = new HashMap<>();
        int j = 1;
         haveSeenCount.put(nums[0] ,haveSeenCount.getOrDefault(nums[0] ,0)+1);
        for(int i = 1; i<nums.length ; i++)
        {
             haveSeenCount.put(nums[i] ,haveSeenCount.getOrDefault(nums[i] ,0)+1);
            if(haveSeenCount.get(nums[i])<=2)
            {
                 nums[j] = nums[i];
                 j++;
            }
           
        }
        return j;
        */
        int j = 2; 
        for(int i =2 ; i<nums.length ; i++) {
            if(nums[i] != nums[j-2])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}