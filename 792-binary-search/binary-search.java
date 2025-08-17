class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        return binary(left,right,nums,target);
        
    }
    public int binary(int left,int right, int[] nums, int target){
        int mid=left+(right-left)/2;
        if(left<=right){

        if(target==nums[mid]){
            return mid;
        }else if(target<=nums[mid]){
            return binary(left,mid-1,nums,target);
            
        }else{
            return binary(mid+1,right,nums,target);
        }
        }
    
        return -1;
    }
}