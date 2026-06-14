class Solution {
public:
    int countPairs(vector<int>& nums, int target) {
        int number_of_pairs{0};
        for(int i{0} ; i < nums.size() ;i++)
        {
            for(int j{1} ; j< nums.size() ; j++)
            {
                if(nums[i] + nums[j] < target && i < j )
                    ++number_of_pairs;
            }
        }
        return number_of_pairs;
    }
};