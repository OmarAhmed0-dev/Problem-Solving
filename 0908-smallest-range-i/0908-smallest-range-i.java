class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for(int num : nums)
        {
            if(min > num){
                min = num;
            }
            if(max < num) {
                max = num;
            }
        }
        int diff = (max-k) - (min +k);

        return diff < 0 ? 0 :diff;
    }
}