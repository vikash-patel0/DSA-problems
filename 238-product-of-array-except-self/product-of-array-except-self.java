class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int prod2=1;
        int countZero=0;
        for(int i:nums){
            if(i==0){
                countZero++;
            }
            if(i!=0){
                prod2*=i;
            }
            prod*=i;
        }
        
        int[] res= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=nums[i];
            }else{
                res[i]=prod/nums[i];
            }
        }

       
        
        if(countZero==1){

            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    res[i]=prod2;
                }
            }
            return res;
        }
        return res;
    }
}