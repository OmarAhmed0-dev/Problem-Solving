class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {

        unordered_map <int , int> mymap;
        vector<int> result;
        

        for(int i {0} ; i <nums1.size() ; i++)
        {
            mymap[nums1[i]]++;
        }
        for(int j{0} ; j<nums2.size() ; j++)
        {
           if(mymap[nums2[j]] > 0)
           {
               result.push_back(nums2[j]);
           }
        }
        sort( result.begin(), result.end() );
        result.erase( unique( result.begin(), result.end() ), result.end() );

       
        return result;

        
    }
};