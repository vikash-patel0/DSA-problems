class Solution {
    public int findClosestNumber(int[] nums) {
        // Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(min==Math.abs(nums[i]) && nums[i]>0 ){
                a=nums[i];
            }
            if(min>Math.abs(nums[i])){
                min=Math.abs(nums[i]);
                a=nums[i];
            }
        }
        if(a<0){
            return -min;
        }
        return min;
        
    }
}

