class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int total = 0;
        double max = grid[0][0];
        HashMap<Integer , Integer> map = new HashMap<>();
    
        for(int i = 0 ; i < grid.length ; i++) {
            for(int j = 0 ; j<grid[i].length ; j++) {
                if(grid[i][j] > max) {
                    max = grid[i][j];
                }                                                                    
                total += grid[i][j];
                map.put(grid[i][j] , map.getOrDefault(grid[i][j] , 0) +1);
            }
        }
        if(max < grid.length * grid.length) {
            max =  grid.length * grid.length;
        }
        for(int key : map.keySet()){
            if(map.get(key) > 1) {
                ans[0] = key;
                break;
            }
        }
        double missed = 0;
        total = total - ans[0];
        missed =  ((max /2) * (max +1)) - total;
        ans[1] = (int)missed;
        return ans;
        
    }
}
