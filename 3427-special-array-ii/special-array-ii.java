class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] prefixBadPairs= new int[nums.length];
        for(int i=1;i<nums.length;i++){
            prefixBadPairs[i]=prefixBadPairs[i-1];
            if(nums[i]%2==nums[i-1]%2){
                prefixBadPairs[i]++;
            }
        }
        boolean[] res= new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int from=queries[i][0];
            int to=queries[i][1];
            if(from==to){
                res[i]=true;
                continue;
            }
            boolean ans=(prefixBadPairs[to]-prefixBadPairs[from])==0;
            res[i]=ans;
        }
        return res;
    }
}