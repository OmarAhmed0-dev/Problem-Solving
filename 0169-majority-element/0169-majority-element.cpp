#include <unordered_map>
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        /*
        int max{0};
        int output{0};
        int size = nums.size();
        for(int i {0}; i <size ; i++)
        {
            int count{0};
            for(int j{i+1} ; j< size ;j++)
            {
                if(nums[i] == nums[j])
                    count++;
            }

            if(count > max)
                {
                    max = count;
                    output = i;

                }
        }
        return nums[output];
        */
        /*
        int size = nums.size();
    
        std::unordered_map<int , int> mymap;
        for(int i{0} ; i <size ; i++)
        {
            if(mymap[i].first == nums[i])
                mymap[i].second++;
            else
                {
                    mymap[i].first = nums[i];
                    mymap[i].second++;
                }
        }

        int max{0};
        int flag;
        for(auto &x : mymap)
        {
            if(x.second > max)
            {
                max = x.second;
                flag = x.first;
            }
        }
        return flag;
*/

    sort(nums.begin() , nums.end());
    int n = nums.size();
    return nums[n/2];


    }
};