class Solution {
    public boolean check(int[] nums) {

        if(checks(nums,0,0)<=1) return true; 
        else return false;
    }
    static int checks(int[] nums,int i,int count){
        if(i==nums.length) return count;
        if(nums[i]>nums[(i+1)%nums.length]){
            count++;
        }
        return checks(nums,++i,count);
    }
}