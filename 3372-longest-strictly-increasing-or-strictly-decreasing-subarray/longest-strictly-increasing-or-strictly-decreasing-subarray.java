class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int prevd=1;
        int previ=1;
        int nextd=1;
        int nexti=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nextd=1;
                nexti=1;
            }
            
            if(nums[i-1]>nums[i]){
                nextd++;
                prevd=Math.max(nextd,prevd);
                
                nexti=1;
            }
            if(nums[i-1]<nums[i]){
                nexti++;
                previ=Math.max(nexti,previ);
                nextd=1;
            }
        }
        if(previ>prevd){
            return previ;
        }
        return prevd;
    }
}