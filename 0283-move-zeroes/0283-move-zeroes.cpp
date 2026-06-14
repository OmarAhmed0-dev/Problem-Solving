class Solution {
public:
    void moveZeroes(vector<int>& nums) {

/*
        int zeros{0};
      
        for(size_t i{0} ; i < nums.size() ; i++)
        {
            if(nums.at(i) == 0)
            {
                nums.erase(nums.begin()+i);
                --i;
                ++zeros;
            }
                
        }

        for(int i {0} ; i < zeros ; i++)
        {
            nums.push_back(0);
        }
        */

        int i{0};
        for(auto num : nums)
        {
            if(num !=0)
            {
                nums[i] = num;
                ++i;
            }
        }

        while(i<nums.size())
        {
            nums[i] = 0;
            ++i;
        }
        
    }
};