class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {

        vector <int> ans;
        unordered_map<int , int> m;

        for(auto num : nums)
        {
            m[num]++;
        }
        
        vector<pair<int,int>> v;
        
        for(auto x :m)
        {
            v.push_back({x.second , x.first});
        }
        sort(v.rbegin() , v.rend());

        for(int i{0} ; i<k ;  i++)
        {
            ans.push_back(v[i].second);
        }
        return ans;
    }
};