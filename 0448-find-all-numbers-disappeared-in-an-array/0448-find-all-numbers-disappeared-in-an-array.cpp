class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        unordered_map<int , int> m;
        vector <int> vec;
        int size = nums.size();    

        for(int i {1} ; i<size +1 ;i++)
        {
            m[i] = 0;
        }


        for(int i{0} ; i <size; i++)
        {
            m[nums[i]]++;
        }

        for(auto &x : m)
        {
            if(x.second == 0)
                vec.push_back(x.first);
           
        }
        return vec;
    }
   
};